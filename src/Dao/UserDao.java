/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import DBConnection.DBConnection;
import Pojo.GeneralDetails;
import Pojo.UserPojo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Neel_Esh
 */
public class UserDao {
    public static boolean validateUser(UserPojo user)throws SQLException
    {
        PreparedStatement ps=DBConnection.getConnection().prepareStatement("select * from ptusertable where userid=? and password=? and type=?");
        ps.setString(1,user.getUserId());
        ps.setString(2,user.getPassword());
        ps.setString(3,user.getType());
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {
            GeneralDetails.setUserId(rs.getString(1));
            GeneralDetails.setId(rs.getString(2));
            GeneralDetails.setName(rs.getString(3));
            GeneralDetails.setType(rs.getString(5));
            return true;
        }
        return false;
    }
    
    public static UserPojo getDetailsByUserId(String userId)throws SQLException
    {
        PreparedStatement ps=DBConnection.getConnection().prepareStatement("select * from ptusertable where userid=? and type=?");
        ps.setString(1,userId);
        ps.setString(2,"Hr");
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {   
            System.out.println("inside rs if ");
            UserPojo user=new UserPojo();
            user.setUserId(rs.getString(1));
            user.setId(rs.getString(2));
            user.setName(rs.getString(3));
            return user;
        }
        return null;
    }
}
