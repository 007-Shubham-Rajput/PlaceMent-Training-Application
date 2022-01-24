/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import DBConnection.DBConnection;
import Pojo.GeneralDetails;
import Pojo.HrPojo;
import Pojo.LoginPojo;
import Pojo.UserPojo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Neel_Esh
 */
public class HrTableDao {
    public static boolean addNewHr(HrPojo hr) throws SQLException
    {
        try
        {   
            PreparedStatement ps;
            ps=DBConnection.getConnection().prepareStatement("select * from ptusertable where ((userid=?) or (id=?))");
            ps.setString(1,hr.getUserId().toUpperCase().trim());
            ps.setString(2,hr.getHrId().trim());
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null,"Already have a Hr account on this phone no or mail","Error",JOptionPane.ERROR_MESSAGE);
                return false;   
            }
            else
            {
                ps=DBConnection.getConnection().prepareStatement("insert into ptusertable values(?,?,?,?,?)");
                ps.setString(1,hr.getUserId());
                ps.setString(2,hr.getHrId());
                ps.setString(3,hr.getName());
                ps.setString(4,hr.getPassword());
                ps.setString(5,hr.getType());
                
                if(1==ps.executeUpdate())
                {
                    ps=DBConnection.getConnection().prepareStatement("insert into hrtable values(?,?,?,?,?,?)");
                    ps.setString(1,hr.getHrId());
                    ps.setString(2,hr.getUserId());
                    ps.setString(3,hr.getName());
                    ps.setLong(4,hr.getPhone());
                    ps.setString(5,hr.getCompanyName());
                    ps.setString(6,hr.getProfession());
                    
                    return 1==ps.executeUpdate();
                }
                else
                {
                    //Undo - roll back code
                } 
            }
            
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"DB-Error While Adding New Hr","Error",JOptionPane.ERROR);
        }
        return false;
    }
    
    public static int getHrId() throws SQLException
    {   
        int count;
        Statement st=DBConnection.getConnection().createStatement();
        ResultSet rs=st.executeQuery("select count(*) from hrtable");
        if(rs.next())
        {
            System.out.println("total rows"+rs.getInt(1));
            
            return 101+rs.getInt(1);
        }
        return -1;
    }
    
   public static boolean validateHr(LoginPojo lp)throws SQLException
    {
        PreparedStatement ps=DBConnection.getConnection().prepareStatement("select * from hrTable where ((email=?) or (phone=?)) and password=?");    
        ps.setString(1,lp.getEmail().trim().toUpperCase());
        ps.setLong(2,lp.getPhone());
        ps.setString(3,lp.getPassword().trim());
        ResultSet rs =ps.executeQuery();
        if(rs.next())
        {
            GeneralDetails.setId(rs.getString(1));
            GeneralDetails.setName(rs.getString(3));
            GeneralDetails.setType("Hr");
            return true;
        }
        return false;
    }
   
    public static String getCompanyNameById(String hrid)throws SQLException {
        
       PreparedStatement ps=DBConnection.getConnection().prepareStatement("select companyname from hrTable where hrid=?");    
       ps.setString(1,hrid);
       ResultSet rs =ps.executeQuery();
       if(rs.next())
       {
           return rs.getString(1);
       }
       return null;
    }
    
    public static ResultSet allHr() throws SQLException
    {   
        Statement st=DBConnection.getConnection().createStatement();
        return st.executeQuery("select * from hrtable order by hrid");
    }
    
    public static boolean removeHr(HrPojo hr)throws SQLException
    {
       try
        {   
            PreparedStatement ps;
            ps=DBConnection.getConnection().prepareStatement("delete from hrtable where userid=? and hrid=?");
            ps.setString(1,hr.getUserId().toUpperCase().trim());
            ps.setString(2,hr.getHrId().trim());
            int res=ps.executeUpdate();
            if(res==1)
            {
                ps=DBConnection.getConnection().prepareStatement("delete from ptusertable where userid=? and id=?");
                ps.setString(1,hr.getUserId().toUpperCase().trim());
                ps.setString(2,hr.getHrId().trim());
                return 1==ps.executeUpdate();
            }
            else
            {
               //undo code
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"DB-Error While Deleting New Hr","Error",JOptionPane.ERROR);
        }
        return false;
    }
    
    public static boolean modifyHr(UserPojo user)throws SQLException
    {
            PreparedStatement ps;
            ps=DBConnection.getConnection().prepareStatement("update ptusertable set password=? where userid=? and id=?");
            ps.setString(1,user.getPassword());
            ps.setString(2,user.getUserId().trim());
            ps.setString(3,user.getId().trim());
            return 1==ps.executeUpdate();
    }
}


