package com.DBVerification;

import java.sql.*;  
import com.Utilities.Queries;
import com.Utilities.EstbConnection;

import junit.framework.Assert;
public class DBAccess
{  
	public static String Query1 = Queries.InsertValuesToEmp;   //"Insert into emp (id,name,age) values (123123 , 'Raj ',68)";
	public static String Query2  = "Select * from emp where id = 124050" ;
	public static String Query3 = Queries.InsertValuesIntoSalary;
	//public static String Query3 = "Select "
	
	
	
	
	public static void WriteDataToDB()
	{
		try
		{  
		
			Connection Conn = EstbConnection.getConnection();
	   Statement stmt=Conn.createStatement();  
	   // Statement retrieve =con.createStatement();
	
	    stmt.executeUpdate(Query3);
		} catch (Exception  Err)
		{
			System.out.println("Caught Exception :"+Err);
			
			
		}
	}
	

	@SuppressWarnings("deprecation")
	public static void ReadDataFromDB()
	{
		
		int ID ;
		String name = null ;
		String Age;
		try
		{  
		
			Connection Conn = EstbConnection.getConnection();
			   //Statement stmt=Conn.createStatement();  
	    Statement retrieve =Conn.createStatement();
	
	    ResultSet rs=retrieve.executeQuery(Query2); 
	    while(rs.next())  
	    	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
	    		  ID = rs.getInt(1);
	    		 name = rs.getString(2);
	    		 Age  = rs.getString(3);
	  //  Conn.close();  
	    		 Assert.assertEquals("Ravikiran HM",""+name);
	    			
		} 
		
		catch (Exception  Err)
		{
			
			System.out.println("Caught Exception :"+Err);
			
		}
		
		
		
	}
		
	//Conn.clos
	public void AssertDBData()
	{
		
		
		
		
		
		
		
	}
	
public static void main(String args[])
{  
	
	WriteDataToDB();
	
	//ReadDataFromDB();

}

 
}


 