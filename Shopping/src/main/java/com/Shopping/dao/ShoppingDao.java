package com.Shopping.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Shopping.controller.ShoppingItems;
import com.Shopping.entity.BShopping;
import com.Shopping.entity.SShopping;

public class ShoppingDao implements ShoppingDaoInterface {
	
	Scanner scan=new Scanner(System.in);	

	public int createBAccount(BShopping s) {
		// TODO Auto-generated method stub
		int i=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dao","root","root");
			PreparedStatement ps=con.prepareStatement("insert into shopping values(?,?,?,?)");
			ps.setString(1, s.getBname());
			ps.setString(2, s.getBmail());
			ps.setString(3, s.getBpwd());
			ps.setInt(4, s.getBmnum());
			
			
			i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public int BloginDao(BShopping s) {
		// TODO Auto-generated method stub
		int i=0;
		BShopping bs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dao","root","root");
			PreparedStatement ps=con.prepareStatement("select * from shopping where mail=? and password=?");
			ps.setString(1, s.getBmail());
			ps.setString(2, s.getBpwd());
			
			ResultSet res=ps.executeQuery();
			while(res.next()) {
				String n=res.getString(1);
				String m=res.getString(2);
				String p=res.getString(3);
				int mn=res.getInt(4);
				
				bs=new BShopping();
				bs.setBname(n);
				bs.setBmail(m);
				bs.setBpwd(p);
				bs.setBmnum(mn);
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		if(bs!=null) {
			i=1;
		}
		else if(bs==null) {
			i=0;
		}
		
		return i;
	}

	@Override
	public int createSAccountDao(SShopping s) {
		// TODO Auto-generated method stub
		int i=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dao","root","root");
			PreparedStatement ps=con.prepareStatement("insert into selshopping values(?,?,?,?)");
			ps.setString(1, s.getSname());
			ps.setString(2, s.getSmail());
			ps.setString(3, s.getSpwd());
			ps.setInt(4, s.getSmnum());
			
			
			i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int SloginDao(SShopping s) {
		// TODO Auto-generated method stub
		int i=0;
		BShopping bs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dao","root","root");
			PreparedStatement ps=con.prepareStatement("select * from selshopping where mail=? and password=?");
			ps.setString(1, s.getSmail());
			ps.setString(2, s.getSpwd());
			
			ResultSet res=ps.executeQuery();
			while(res.next()) {
				String n=res.getString(1);
				String m=res.getString(2);
				String p=res.getString(3);
				int mn=res.getInt(4);
				
				bs=new BShopping();
				bs.setBname(n);
				bs.setBmail(m);
				bs.setBpwd(p);
				bs.setBmnum(mn);
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		if(bs!=null) {
			i=1;
		}
		else if(bs==null) {
			i=0;
		}
		
		return i;
	}

	@Override
	public int addItemApp(ShoppingItems si) {
		// TODO Auto-generated method stub
		int i=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dao","root","root");
			PreparedStatement ps=con.prepareStatement("insert into shoppingitems (item_name,item_prize,item_category) values(?,?,?)");
			ps.setString(1, si.getIname());
			ps.setInt(2, si.getIprize());
			ps.setString(3, si.getIcat());
			
			i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return i;
	}

	public int upNameItem(ShoppingItems s) {
		// TODO Auto-generated method stub
		int i=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dao","root","root");
			PreparedStatement ps=con.prepareStatement("UPDATE shoppingitems SET item_name=? WHERE item_name=?");
			ps.setString(2, s.getIname());
			ps.setString(1, s.getUpName());
			
			i=ps.executeUpdate();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return i;
	}

	public int upPrizeItem(ShoppingItems s1) {
		// TODO Auto-generated method stub
		int i=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dao","root","root");
			PreparedStatement ps=con.prepareStatement("UPDATE shoppingitems SET item_prize=? WHERE item_name=?");
			ps.setInt(1, s1.getUpPrize());
			ps.setString(2, s1.getIname());
			
			i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public int upCat(ShoppingItems s1) {
		// TODO Auto-generated method stub
		int i=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dao","root","root");
			PreparedStatement ps=con.prepareStatement("UPDATE shoppingitems SET item_category=? WHERE item_name=?");
			ps.setString(1, s1.getUpCat());
			ps.setString(2, s1.getIname());
			
			i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public List viewAllItems() {
		// TODO Auto-generated method stub
		List<ShoppingItems> li=new ArrayList();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dao","root","root");
			PreparedStatement ps=con.prepareStatement("Select * from shoppingitems");
		
			ResultSet res=ps.executeQuery();
			while(res.next()) {
				String n=res.getString(1);
				int ip=res.getInt(2);
				float ir=res.getFloat(3);
				String ic=res.getString(4);
				ShoppingItems si=new ShoppingItems();
				si.setIname(n);
				si.setIprize(ip);
				si.setRating(ir);
				si.setIcat(ic);
				
				li.add(si);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
	}

	@Override
	public int irating(ShoppingItems si) {
		// TODO Auto-generated method stub
		int i=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dao","root","root");
			PreparedStatement ps=con.prepareStatement("update shoppingitems set item_rating=? where item_name=?");
			ps.setString(2, si.getIname());
			ps.setFloat(1, si.getRating());
			i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return i;
	}

	public List<ShoppingItems> sortP() {
		// TODO Auto-generated method stub
		List<ShoppingItems> li=new ArrayList();
		System.out.println("Select 1 to sort based on price");
		System.out.println("Select 2 to sort based on rating");
		int opt=scan.nextInt();
		if(opt==1) {
			try {
				ResultSet res=null;
				System.out.println("Select 1 to sort item_prize in ascending order");
				System.out.println("Select 2 to sort item_prize in descending order");
				int or=scan.nextInt();
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dao","root","root");
				if(or==1) {	
					PreparedStatement ps=con.prepareStatement("SELECT * FROM shoppingitems ORDER BY item_prize");
					res=ps.executeQuery();
					
				}
				else if(or==2) {
					PreparedStatement ps=con.prepareStatement("SELECT * FROM shoppingitems ORDER BY item_prize desc");
					res=ps.executeQuery();

				}
				while(res.next()) {
					String in=res.getString(1);
					int ip=res.getInt(2);
					float ir=res.getFloat(3);
					String ic=res.getString(4);
					ShoppingItems si=new ShoppingItems();

					si.setIname(in);
					si.setIprize(ip);
					si.setRating(ir);
					si.setIcat(ic);
					
					li.add(si);
				}
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(opt==2) {
			try {
				ResultSet res=null;
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dao","root","root");
				PreparedStatement ps=con.prepareStatement("Select * from shoppingitems order by item_rating desc");
				res=ps.executeQuery();
				while(res.next()) {
					String in=res.getString(1);
					int ip=res.getInt(2);
					float ir=res.getFloat(3);
					String ic=res.getString(4);
					ShoppingItems si=new ShoppingItems();

					si.setIname(in);
					si.setIprize(ip);
					si.setRating(ir);
					si.setIcat(ic);
					
					li.add(si);

			}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		return li;
	}

}