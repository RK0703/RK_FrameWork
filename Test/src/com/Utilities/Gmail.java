package com.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import com.GlobalVariables.GlobalVariables;
import com.PageFactory.Add_Operator_Page;
import com.PageFactory.AqureLoginPage;

public class Gmail
{
		
	
	
	//xY a4W
	@FindBy(id= "gbqfq")private static WebElement TxtBx_Gmail_Search;
	
	
	@FindBy(id= "gbqfb")private static WebElement Btn_Gmail_Search;
	
	@FindBy(id= "xY a4W")private static WebElement Gmail_FirstRow;
	//AqureLoginPage ap = new AqureLoginPage();
	
	public static WebDriver GmailDriver = AqureLoginPage.driver;
	
	public Gmail()
	{
		AqureLoginPage ap = new AqureLoginPage();
		
		PageFactory.initElements(new AjaxElementLocatorFactory(AqureLoginPage.driver, AqureLoginPage.TimeoutValue), this);

	}
	
	
public static void Launch_Gmail()
{
		
		GmailDriver.get(GlobalVariables.Gmail_URL);

}
	public static void SearchOPName()
	{
		
		TxtBx_Gmail_Search.sendKeys(Add_Operator_Page.OpName);
		Btn_Gmail_Search.click();
	}

	
	public static void Click_FirstRowOfGmail()
	{
		
		
		Gmail_FirstRow.click();
		
		
	}
	
	public static void Verify_TextIn_Gmail(String ActualString , String ExpectedStirng)
	{
		
		Assert.assertEquals(ActualString,ExpectedStirng);
		
		
		
	}

}
