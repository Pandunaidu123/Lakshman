package com.product;

import java.sql.*; 
import java.util.ArrayList;  
import java.util.List;  
public class ProfDao {  

	public static Connection getConnection(){  
		Connection con=null;  
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","techouts");  
		}catch(Exception e){System.out.println(e);}  
		return con;  
	}  
	public static int save(Prof u){  
		int status=0;  
		try{  
			Connection con=getConnection();  
			PreparedStatement ps=con.prepareStatement(  
					"insert into profile(name,lname,gender,email,mob) values(?,?,?,?,?)");  
			ps.setString(1,u.getName()); 
			ps.setString(2,u.getLname()); 
			ps.setString(3,u.getGender());  
			ps.setString(4,u.getEmail());  
			ps.setLong(5,u.getMob());  
			status=ps.executeUpdate();  
			System.out.println(ps);
		}catch(Exception e){System.out.println(e);}  
		return status;  
	}  
	public static int update(Prof u){  
		int status=0;  
		try{  
			Connection con=getConnection();  
			PreparedStatement ps=con.prepareStatement(  
					"update profile set name=?, lname=?,gender=?,email=?,mob=? where gender=?");  
			ps.setString(1,u.getName());  
			ps.setString(2,u.getLname());  
			ps.setString(3,u.getGender());  
			ps.setString(4,u.getEmail());  
			ps.setLong(5,u.getMob());  
			status=ps.executeUpdate();  
		}catch(Exception e){System.out.println(e);}  
		return status;  
	}  
	public static int delete(Prof u){  
		int status=0;  
		try{  
			Connection con=getConnection();  
			PreparedStatement ps=con.prepareStatement("delete from prof where gender=?");  
			ps.setString(1, u.getGender());  
			status=ps.executeUpdate();  
		}catch(Exception e){System.out.println(e);}  

		return status;  
	}  
	public static List<Prof> getAllRecords(String gender){  
		List<Prof> list=new ArrayList<Prof>();  

		try{  
			Connection con=getConnection();  
			PreparedStatement ps=con.prepareStatement("select * from profile where gender=?");  
			ps.setString(1, gender);
			ResultSet rs=ps.executeQuery();  

			while(rs.next()){  
				Prof u=new Prof();   
				u.setName(rs.getString("name")); 
				u.setName(rs.getString("lname"));  
				u.setGender(rs.getString("gender"));  
				u.setEmail(rs.getString("email"));  
				u.setMob(rs.getLong("mob"));  
				list.add(u);  
			}  
		}catch(Exception e){System.out.println(e);}  
		return list;  
	}  
	public static Prof getRecordById(String gender){  
		Prof u=null;  
		try{  
			Connection con=getConnection();  
			PreparedStatement ps=con.prepareStatement("select * from profile where gender=?");  
			ps.setString(1,gender);  
			ResultSet rs=ps.executeQuery();  
			while(rs.next()){  
				u=new Prof();    
				u.setName(rs.getString("name"));  
				u.setName(rs.getString("lname"));  
				u.setGender(rs.getString("gender"));  
				u.setEmail(rs.getString("email"));  
				u.setMob(rs.getLong("mob")); 			}  
			System.out.println("Profile Added  Successfully");
		}catch(Exception e){System.out.println(e);}  
		return u;  
	}  
}  