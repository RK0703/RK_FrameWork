package com.TestCases;

import org.openqa.selenium.WebElement;
import com.PageFactory.AqureMainPage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.PageFactory.AqureLoginPage;
import com.TestCases.*;
public class ConfigarationSetting 
{

	ConfigarationSetting()
	{
		
		
		PageFactory.initElements(new AjaxElementLocatorFactory(AqureLoginPage.driver, AqureLoginPage.TimeoutValue), this);
		
		
	}
	//@FindBy(id="btnLogIn")public static WebElement loginBtn;
public static void NavigateToAdminTab()
{
	

	AqureMainPage.Click_AdminTab();
	
	
}



public static void main(String A[])
{
	AqureLoginPage AP = new AqureLoginPage();
	//Validate_Login.ReadDataFromPropFile();
	System.out.println(Validate_Login.URL);
	AqureLoginPage.LaunchBrowser(Validate_Login.URL);
	AqureLoginPage.SetUserName();
	AqureLoginPage.SetPassword(Validate_Login.Password);
	AqureLoginPage.Click_LoginBtn();
	NavigateToAdminTab();



}








}
