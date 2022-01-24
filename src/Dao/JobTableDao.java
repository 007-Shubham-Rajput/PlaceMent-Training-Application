/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import DBConnection.DBConnection;
import Pojo.JobPojo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Neel_Esh
 */
public class JobTableDao {
    public static boolean addNewJob(JobPojo job)throws SQLException
    {
        
            PreparedStatement ps;
            ps=DBConnection.getConnection().prepareStatement("insert into jobtable values(?,?,?,?,?)");
            ps.setString(1,job.getJobId());
            ps.setString(2,job.getJobTitle());
            ps.setString(3,job.getCompanyName());
            ps.setString(4,job.getTags());
            ps.setInt(5,job.getStatus());
            return 1==ps.executeUpdate();
    }

    public static int getJobId() throws SQLException
    {   
        int count;
        Statement st=DBConnection.getConnection().createStatement();
        ResultSet rs=st.executeQuery("select count(*) from jobtable");
        if(rs.next())
        {
            System.out.println("total rows"+rs.getInt(1));
            
            return 101+rs.getInt(1);
        }
        return -1;
    }
    
    public static ResultSet getAllJobByCompanyName(String cmpName)throws SQLException
    {
            PreparedStatement ps;
            ps=DBConnection.getConnection().prepareStatement("select jobid,jobtitle,tags,status from jobtable where companyname=? order by jobid");
            ps.setString(1,cmpName);
            return ps.executeQuery();
            
    }
    
    public static boolean removeJobByJobId(String jobId) throws SQLException
    {   
        System.out.println(jobId);
        PreparedStatement ps;
        ps=DBConnection.getConnection().prepareStatement("update jobtable set status=0 where jobId=?");
        ps.setString(1,jobId);
        return 1==ps.executeUpdate();
    }
}

