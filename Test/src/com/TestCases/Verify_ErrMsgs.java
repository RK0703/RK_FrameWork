package com.TestCases;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import com.SetUp.ReadSetUpData;
import com.PageFactory.AqureLoginPage;
import com.TestCases.Validate_Login;

public class Verify_ErrMsgs
{
	
	static WebDriver driver ; //= new FirefoxDriver();
	
	static Validate_Login VL = new Validate_Login(driver);
	
	//static AqureLoginPage ALP = new AqureLoginPage(driver);
	
	static ReadSetUpData Rd = new ReadSetUpData();
	
	@FindBy(id= "btnLogIn")
	static
	WebElement loginBtn;
	
	public static void Verify_UserName_ErrMsg()
	{
		
		String Pswd = Validate_Login.Password;
		AqureLoginPage.SetPassword(Pswd);
		AqureLoginPage.ClickOnBtn(loginBtn);
		AqureLoginPage.GetErrMsgs();
		String ExpectedUserNameErrString = "Enter the user name";
		try 
		{
		Assert.assertTrue(AqureLoginPage.StringErrMsg.contains(ExpectedUserNameErrString));
		} catch (AssertionError UsernameErr)
		{
			
			System.out.println("Assertion Failed Expected : "+ ExpectedUserNameErrString+ " Actual String :"+UsernameErr );
		}
		

	}
	public static  void Verify_Password_ErrMsg() 
	{
		
		String StrUserName = Validate_Login.UserName;
		AqureLoginPage.SetUserName();
		System.out.println("ID of LoginButton: "+loginBtn);
		AqureLoginPage.ClickOnBtn(loginBtn);
		AqureLoginPage.GetErrMsgs();
		String ExpectedPswdErrString = "Enter the password!!";
		try
		{
		Assert.assertTrue(AqureLoginPage.StringErrMsg.contains(ExpectedPswdErrString ));

		} catch (AssertionError PasswordErr)
		{
			
			System.out.println("Assertion Failed Expected : "+ ExpectedPswdErrString+ " Actual String :"+PasswordErr );
		}
	}
	
	
	public static void main (String A[])
	{
		
		AqureLoginPage ALP = new AqureLoginPage();
		Validate_Login.ReadDataFromPropFile();
		AqureLoginPage.LaunchBrowser(Validate_Login.URL);
		Verify_ErrMsgs.Verify_Password_ErrMsg();
		AqureLoginPage.ClearFileds();
		Verify_ErrMsgs.Verify_UserName_ErrMsg();
		
	}
	
}
