/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import DBConnection.DBConnection;
import Pojo.GeneralDetails;
import Pojo.LoginPojo;
import Pojo.ParticipantsPojo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Neel_Esh
 */
public class ParticipantsTableDao {
    public static boolean addNewParticipants(ParticipantsPojo pt)
    {
        try
        {   
            PreparedStatement ps;
            ps=DBConnection.getConnection().prepareStatement("select * from ptusertable where ((userid=?) or (id=?))");
            ps.setString(1,pt.getUserId().toUpperCase().trim());
            ps.setString(2,pt.getpId().trim());
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null,"Already have a Hr account on this phone no or mail","Error",JOptionPane.ERROR_MESSAGE);
                return false;   
            }
            else
            {
                ps=DBConnection.getConnection().prepareStatement("insert into ptusertable values(?,?,?,?,?)");
                ps.setString(1,pt.getUserId());
                ps.setString(2,pt.getpId());
                ps.setString(3,pt.getName());
                ps.setString(4,pt.getPassword());
                ps.setString(5,pt.getType());
                
                if(1==ps.executeUpdate())
                {
                    ps=DBConnection.getConnection().prepareStatement("insert into participantstable values(?,?,?,?,?,?,?)");
                    ps.setString(1,pt.getpId());
                    ps.setString(2,pt.getUserId());
                    ps.setString(3,pt.getName());
                    ps.setLong(4,pt.getPhone());
                    ps.setString(5,pt.getSkills());
                    ps.setString(6,pt.getQualifications());
                    
                    FileInputStream resume = new FileInputStream(pt.getResume().getPath());

                    ps.setBlob(7,resume);

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
            JOptionPane.showMessageDialog(null,"DB-Error While Adding New Participants","Error",JOptionPane.ERROR);
        }
        catch(FileNotFoundException fnf)
        {
            fnf.printStackTrace();
            JOptionPane.showMessageDialog(null,"DB-Error While Adding New Participants","Error",JOptionPane.ERROR);
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
    
    public static int getParticipantsId() throws SQLException
    {   
        int count;
        Statement st=DBConnection.getConnection().createStatement();
        ResultSet rs=st.executeQuery("select count(*) from participantstable");
        if(rs.next())
        {
            System.out.println("total rows"+rs.getInt(1));
            
            return 101+rs.getInt(1);
        }
        return -1;
    }
    
    public static boolean validateParticipant(LoginPojo lp)throws SQLException        
    {
        PreparedStatement ps=DBConnection.getConnection().prepareStatement("select * from participanttable where ((mail=?) or (phone=?)) and password=?");    
        ps.setString(1,lp.getEmail().trim().toUpperCase());
        ps.setLong(2,lp.getPhone());
        ps.setString(3,lp.getPassword().trim());
        ResultSet rs =ps.executeQuery();
        if(rs.next())
        {
            GeneralDetails.setId(rs.getString(1));
            GeneralDetails.setName(rs.getString(2));
            GeneralDetails.setType("User");
            return true;
        }
        return false;
    }
    
    public static ResultSet viewAllParticipantsAdmin()throws SQLException
    {
        Statement st=DBConnection.getConnection().createStatement();
        ResultSet rs =st.executeQuery("select * from participantstable");
        return rs;
    }
     
    public static ResultSet viewParticipantsById(String id)throws SQLException
    {
       PreparedStatement ps=DBConnection.getConnection().prepareStatement("select * from participantTable where participantid=?");    
       ps.setString(1,id);
       return ps.executeQuery();
    }
}
