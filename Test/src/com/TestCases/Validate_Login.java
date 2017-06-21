package com.TestCases;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import com.PageFactory.*;
import com.SetUp.*;
import com.Utilities.Log;
//import com.PageFactory.*;
import com.PageFactory.AqureLoginPage;

public class Validate_Login 
{

//	AqureLoginPage AQLg = new AqureLoginPage();
	
	
	
	
	public Validate_Login(WebDriver driver) 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public static String URL = null;
	public static String UserName = null;
	public static String Password = null;
	public static String Browser = null;
	
	
	static WebDriver driver ; //= new FirefoxDriver(); // Do not Uncomment here , else one more browser instance will be invoked 
//	static AqureLoginPage ALP = new AqureLoginPage(driver);
	
public static void ReadDataFromPropFile()
{
	File file = new File("K:/MySeleniumWork/SeleniumWorks/src/com/SetUp/DataFile.properties");
	
	FileInputStream fileInput = null ;
	try 
	{
		fileInput = new FileInputStream(file);
	} 
	catch (FileNotFoundException FileNotFound)
	{
		FileNotFound.printStackTrace();
		Log.error("File Not Found");
	}
	Properties prop = new Properties();
	try 
	{
		prop.load(fileInput);
	} catch (IOException IOExcep)
	{
		IOExcep.printStackTrace();
	}
		Log.info("File Found , started Reading");
		
		 URL = prop.getProperty("URL");
	 //System.out.println("URL after Reading From File "+URL);
		UserName = prop.getProperty("UserName");
		// System.out.println(""+UserName);
		 Password = prop.getProperty("Password");
		// System.out.println(""+Password);
		 
	 Browser = prop.getProperty("Browser");
	 Log.info("ReadDataFromPropFile() Executed  :  URL :"+URL+"\n Username : "+UserName+"\n Password "+Password+"\n Browser :"+Browser);

}



public static void SetCredential()
{
	
	String StrUserName = UserName;
	AqureLoginPage.SetUserName();
	String Pswd = Password;
	AqureLoginPage.SetPassword(Pswd);
	//WebElement LoginBtn = AqureLoginPage.
	//ALP.ClickOnBtn();



}

public static void Verify_Err_Msg()
{
	
	AqureLoginPage.GetErrMsgs();


}

public static void Verify_UserName_ErrMsg()
{
	String Pswd = Password;
	AqureLoginPage.SetPassword(Pswd);
	Assert.assertTrue(AqureLoginPage.StringErrMsg.contains("Enter the user name"));


}
public static void Verify_Password_ErrMsg() 
{
	
	String StrUserName = UserName;
	AqureLoginPage.SetUserName();
	Assert.assertTrue(AqureLoginPage.StringErrMsg.contains("Enter the password!!"));

}
public static void main (String A[])
{
	//Validate_Login ValidateLogin = new Validate_Login();
	Log.startTestCase("Validate_Login");
	Validate_Login.ReadDataFromPropFile();
//	System.out.println("URL :" +URL);
	//System.setProperty(,"");
	//System.setProperty("webdriver.gecko.driver","K:\\SeleniumRelatedFiles\\geckodriver-v0.15.0-win64\\geckodriver.exe");
	AqureLoginPage.LaunchBrowser(URL);
//	AqureLoginPage.//	ALP.ClickOnLoginBtn();
	//Validate_Login.SetCredential();
	//Verify_Err_Msg();
	Log.endTestCase("Validate_Login");
}

}
