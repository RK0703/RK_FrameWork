package com.PageFactory;
import com.Utilities.Log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.GlobalVariables.GlobalVariables;
import com.SetUp.ReadSetUpData;
public class AqureLoginPage

{
	
	//Elements in Login Page
 	public static WebDriver driver = new InternetExplorerDriver() ; // = new FirefoxDriver();
	
//	driver.manage().window().maximize();
	

	@FindBy(id="ltbInputUsername")private static  WebElement UserNameWebEle;
	
	@FindBy(id="ltbInputPassword") public static WebElement Password;
	
	@FindBy(id="btnLogIn")private static WebElement loginBtn;
	
	@FindBy(xpath ="id('content')/x:div/x:section/x:form/x:div[3]/x:div[1]/x:a " ) WebElement ForGotPswdLink;
	
	@FindBy(id = "ValidationSummary" )public static WebElement ErrMsg;
	
	ReadSetUpData Rd = new ReadSetUpData();
	public static int TimeoutValue = 30;
	public static String StringErrMsg ;
	
	   public AqureLoginPage()
	{
		
		//driver = new FirefoxDriver();
		//AqureLoginPage.driver = driver;
		Log.info("Browser invoked from AqureLoginPage Constructor()");
		//This initElements method will create all WebElements

		 PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeoutValue), this);

			
	}
	
	   public static void Click_LoginBtn()
	   {
		   
		   loginBtn.click();
		   
		   
	   }
	   
	   
	   
	public static void SetUserName()
	{
		
		String StrUserName = GlobalVariables.LoginUserName;
		if (StrUserName.length()!= 0)
		{
		Log.info("Received USer name in SetUSerName Method :"+StrUserName);
		System.out.println("UserName Webelement Name : "+UserNameWebEle);
		UserNameWebEle.sendKeys(StrUserName);
	
		}
		else
		{
			
			
			Log.error("Invalid !! Received"+ StrUserName+" as StrUserName ");
			
		}
		
		//Log.info("Received USer name in SetUSerName Method :"+StrUserName);
	//	UserNameWebEle.sendKeys(StrUserName);
		
		
		
	}
	
	public static void SetPassword(String Pswd)
	{
		if (Pswd.length()!= 0)
		{
		Log.info("Received USer name in SetUSerName Method :"+Pswd);
		
		Password.sendKeys(Pswd);
	
		}
		else
		{
			
			
			Log.error("Invalid !! Received"+ Pswd+ "as Password ");
			
		}
		}
	
public static void ClickOnBtn(WebElement Btn) //(WebElement loginBtn)
{
	// System.out.println("Button Address is" +ClickBtn);
	WebElement ClickBtn = Btn ;
	ClickBtn.click();
	
}
	
public static String GetErrMsgs()
{
	
	//loginBtn.click();
	return StringErrMsg = ErrMsg.getText();
	//System.out.println(ErrMsg.getText());


}
public static void LaunchBrowser(String URL)
{
	
Log.info("Received "+URL+" as Parameter in LaunchBrowser() Method");
driver.manage().window().maximize();
	System.out.println("Inside LauncBrowser Method :"+URL);
	driver.get(URL);//(URL);
	//System.out.println(UserName);
	Log.info("Exiting form LaunchBrowser Without any Issue");
}

public static void ClearFileds()
{
	
	UserNameWebEle.clear();
	Password.clear();
}



}
