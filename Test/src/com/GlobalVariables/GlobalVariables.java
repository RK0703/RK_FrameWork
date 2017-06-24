package com.GlobalVariables;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class GlobalVariables
{


	public static String LoginUserName = "admin";
	public static String OpName;
	public static String Email_Id = "ravikiran.mallappa@gmail.com";
	public static String Gmail_Pswd = "rh028133!(**";
	public static String Op_Password = "";
	public static String User_Password;
	public static String OpHomeHosp = "Hospital1";
	public static String OpHomeDept = "Dept1";
	public static String LoginPasswrd = "P@ssw0rd";
	public static String Gmail_URL = "www.gmail.com";
	public static String GetCurrentTimeStamp()
{
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
	Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	
	return (sdf.format(timestamp));
}

	public static String GetCurrentDate()
{
	
		SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		
		return (sdf.format(timestamp));
}


}
