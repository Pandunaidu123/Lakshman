package com.product;

import java.sql.*;  
import java.util.ArrayList;  
import java.util.List;  
public class CartDao {  

	public static Connection getConnection(){  
		Connection con=null;  
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","techouts");  
		}catch(Exception e){System.out.println(e);}  
		return con;  
	}  
	public static int save(int id,String userid){  
		int status=0;  
		try{  
			Connection con=getConnection();  
			Product product = ProductDao.getRecordById(id);
			PreparedStatement ps=con.prepareStatement(  
					"insert into cart(name,price,url,descr,cat,userid) values(?,?,?,?,?,?)");  
			//ps.setInt(1,u.getCartId());  
			ps.setString(1,product.getName());  
			ps.setString(2,product.getPrice());  
			ps.setString(3,product.getUrl());  
			ps.setString(4,product.getDescr());  
			ps.setString(5,product.getCat()); 
			ps.setString(6, userid);
			status=ps.executeUpdate();  
			System.out.println(status);
		}catch(Exception e){System.out.println(e);}  
		return status;  
	}  
	
	
	public static int saveorders(int id,String userid){  
		int status=0;  
		try{  
			Connection con=getConnection();  
			Product product = ProductDao.getRecordById(id);
			System.out.println("Pandu");
			PreparedStatement ps=con.prepareStatement(  
					"insert into myorders(name,price,url,descr,cat,userid) values(?,?,?,?,?,?)");  
			//ps.setInt(1,u.getCartId());  
			ps.setString(1,product.getName());  
			ps.setString(2,product.getPrice());  
			ps.setString(3,product.getUrl());  
			ps.setString(4,product.getDescr());  
			ps.setString(5,product.getCat()); 
			ps.setString(6, userid);
			status=ps.executeUpdate();  
			System.out.println("Before Delete");
			CartDao.delete(id, userid);
			System.out.println(status);
		}catch(Exception e){System.out.println(e);}  
		return status;  
	}  
//	public static int update(Cart u){  
//		int status=0;   
//		try{  
//			Connection con=getConnection();  
//			PreparedStatement ps=con.prepareStatement(  
//					"update cart set name=?,price=?,url=?,descr=?,cat=? where ProductId=?");  
//			ps.setString(1,u.getName());  
//			ps.setString(2,u.getPrice());  
//			ps.setString(3,u.getUrl());  
//			ps.setString(4,u.getDescr());  
//			ps.setString(5,u.getCat());  
//			//ps.setInt(6,u.getId());  
//			status=ps.executeUpdate();  
//		}catch(Exception e){System.out.println(e);}  
//		return status;  
//	}  
	public static int delete(int id,String userid){  
		int status=0;  
		try{  
			Connection con=getConnection();  
			System.out.println("Under Delete method");
			PreparedStatement ps=con.prepareStatement("delete from cart where ProductId=? and userid=?");  
			ps.setInt(1, id);  
			ps.setString(2, userid);
			status=ps.executeUpdate();  
		}catch(Exception e){System.out.println(e);}  

		return status;  
	}  
	public static List<Cart> getAllRecords(String userid){  
		List<Cart> list=new ArrayList<Cart>();  

		try{  
			Connection con=getConnection();  
			PreparedStatement ps=con.prepareStatement("select * from cart where userid=?");  
			ps.setString(1, userid);
			ResultSet rs=ps.executeQuery();  

			while(rs.next()){  
				Cart u=new Cart();  
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
	public static List<Cart> getAllRecordsOrders(String userid){  
		List<Cart> list=new ArrayList<Cart>();  

		try{  
			Connection con=getConnection();  
			PreparedStatement ps=con.prepareStatement("select * from myorders where userid=?");  
			ps.setString(1, userid);
			ResultSet rs=ps.executeQuery();  

			while(rs.next()){  
				Cart u=new Cart();  
				u.setName(rs.getString("name"));  
				u.setPrice(rs.getString("price"));  
				u.setUrl(rs.getString("url"));  
				u.setDescr(rs.getString("descr"));  
				u.setCat(rs.getString("cat"));  
				list.add(u);  
			}  
		}catch(Exception e){System.out.println(e);}  
		System.out.print(list);
		return list;  
	}  
	
//	public static Cart getRecordById(String  userid){  
//		Cart u=null;
//		try{  
//			Connection con=getConnection();  
//			PreparedStatement ps=con.prepareStatement("select * from cart where userid=?");  
//			ps.setString(1,userid);  
//			ResultSet rs=ps.executeQuery();  
//			while(rs.next()){  
//				u=new Cart();  
//				u.setProductId(rs.getInt("ProductId"));  
//				u.setName(rs.getString("name"));  
//				u.setPrice(rs.getString("price"));  
//				u.setUrl(rs.getString("url"));  
//				u.setDescr(rs.getString("descr"));  
//				u.setCat(rs.getString("cat"));  
//			}  
//			System.out.println("Product added to the Cart Successfully");
//		}catch(Exception e){System.out.println(e);}  
//		return u;  
//	}  
}  