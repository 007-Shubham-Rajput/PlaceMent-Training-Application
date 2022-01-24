/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import DBConnection.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Neel_Esh
 */
public class QualifiedParticipantsDao {
    
    public static ResultSet allParticipantsIdByCompanyName(String cmpName)throws SQLException
    {
       PreparedStatement ps=DBConnection.getConnection().prepareStatement("select participantid from qualifiedParticipants where companyname=?");    
       ps.setString(1,cmpName);
       return ps.executeQuery();
    }
    
    public static ResultSet allQualifiedParticipantsIdByStatus1()throws SQLException
    {
        Statement st=DBConnection.getConnection().createStatement();
        return st.executeQuery("select participantid from qualifiedParticipants where status=1");
    }
    
    public static ResultSet allQualifiedParticipantsIdByStatus_CmpName(String cmpName)throws SQLException
    {
       PreparedStatement ps=DBConnection.getConnection().prepareStatement("select participantid from qualifiedParticipants where status=1 and companyname=?");    
       ps.setString(1,cmpName);
       return ps.executeQuery();
    }
}
