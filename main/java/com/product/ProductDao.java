package com.product;

import java.sql.*; 
import java.util.ArrayList;  
import java.util.List;  
public class ProductDao {  

	public static Connection getConnection(){  
		Connection con=null;  
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","techouts");  
		}catch(Exception e){System.out.println(e);}  
		return con;  
	}  
	public static int save(Product u){  
		int status=0;  
		try{  
			Connection con=getConnection();  
			PreparedStatement ps=con.prepareStatement(  
					"insert into products(name,price,url,descr,cat) values(?,?,?,?,?)");  
			//ps.setInt(1,u.getProductId());  
			ps.setString(1,u.getName());  
			ps.setString(2,u.getPrice());  
			ps.setString(3,u.getUrl());  
			ps.setString(4,u.getDescr());  
			ps.setString(5,u.getCat());  
			status=ps.executeUpdate();  
			System.out.println(ps);
		}catch(Exception e){System.out.println(e);}  
		return status;  
	}  
	public static int update(Product u){  
		int status=0;  
		try{  
			Connection con=getConnection();  
			PreparedStatement ps=con.prepareStatement(  
					"update products set name=?,price=?,url=?,descr=?,cat=? where ProductId=?");  
			ps.setString(1,u.getName());  
			ps.setString(2,u.getPrice());  
			ps.setString(3,u.getUrl());  
			ps.setString(4,u.getDescr());  
			ps.setString(5,u.getCat());  
			//ps.setInt(6,u.getId());  
			status=ps.executeUpdate();  
		}catch(Exception e){System.out.println(e);}  
		return status;  
	}  
	public static int delete(Product u){  
		int status=0;  
		try{  
			Connection con=getConnection();  
			PreparedStatement ps=con.prepareStatement("delete from products where ProductId=?");  
			ps.setInt(1, u.getProductId());  
			status=ps.executeUpdate();  
		}catch(Exception e){System.out.println(e);}  

		return status;  
	}  
	public static List<Product> getAllRecords(String cat){  
		List<Product> list=new ArrayList<Product>();  

		try{  
			Connection con=getConnection();  
			PreparedStatement ps=con.prepareStatement("select * from products where cat=?");  
			ps.setString(1, cat);
			ResultSet rs=ps.executeQuery();  

			while(rs.next()){  
				Product u=new Product();  
				u.setProductId(rs.getInt("ProductId"));  
				u.setName(rs.getString("name"));  
				u.setPrice(rs.getString("price"));  
				u.setUrl(rs.getString("url"));  
				u.setDescr(rs.getString("descr"));  
				u.setCat(rs.getString("cat"));  
				list.add(u);  
			}  
		}catch(Exception e){System.out.println(e);}  
		return list;  
	}  
	public static Product getRecordById(int ProductId){  
		Product u=null;  
		try{  
			Connection con=getConnection();  
			PreparedStatement ps=con.prepareStatement("select * from products where ProductId=?");  
			ps.setInt(1,ProductId);  
			ResultSet rs=ps.executeQuery();  
			while(rs.next()){  
				u=new Product();  
				u.setProductId(rs.getInt("ProductId"));  
				u.setName(rs.getString("name"));  
				u.setPrice(rs.getString("price"));  
				u.setUrl(rs.getString("url"));  
				u.setDescr(rs.getString("descr"));  
				u.setCat(rs.getString("cat"));  
			}  
			System.out.println("Product Added  Successfully");
		}catch(Exception e){System.out.println(e);}  
		return u;  
	}  
}  