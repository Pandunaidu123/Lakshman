package com.ecom;

import java.sql.*;  
import java.util.ArrayList;  
import java.util.List;  
import com.ecom.UserDetails;  
public class UserDao {  
  
public static Connection getConnection(){  
    Connection con=null;  
    try{  
        Class.forName("com.mysql.jdbc.Driver");  
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecom","root","techouts");  
    }catch(Exception e){System.out.println(e);}  
    return con;  
}  
public static int save(UserDetails u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"insert into register(user,pass) values(?,?)");  
        ps.setString(1,u.getName());  
        ps.setString(2,u.getPassword());  
         
        status=ps.executeUpdate(); 
        System.out.println(status);
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  


public static List<UserDetails> getAllRecords(){  
    List<UserDetails> list=new ArrayList<UserDetails>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from register");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
        	UserDetails u=new UserDetails();   
            u.setName(rs.getString("user"));  
            u.setPassword(rs.getString("pass"));  
            
            list.add(u);  
        }  
        
    }catch(Exception e){System.out.println(e);}  
    return list;  
}  
public static UserDetails getRecordById(int id){  
	UserDetails u=null;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from register where id=?");  
        ps.setInt(1,id);  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            u=new UserDetails();  
            u.setName(rs.getString("name"));  
            u.setPassword(rs.getString("pass"));  
           
        }  
    }
    catch(Exception e)
    {
    	System.out.println(e);
    }  
    return u;
    }  
}  