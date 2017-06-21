package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import com.PageFactory.AqureLoginPage;
public class AqureMainPage
{
	// Elements in AqureMain Page
	@FindBy(id= "menuitem-administration")private static WebElement AdminTab;
	
	@FindBy(id= "menuitem-device")private static WebElement DeviceCenterTab;
	
	@FindBy(id= "menuitem-issue")private static WebElement IssueTab;
	
	@FindBy(id= "menuitem-operator")public static WebElement OperatorsTab;
	
	@FindBy(id= "menuitem-patientview")public static WebElement PatientViewTab;
	
	@FindBy(id= "menuitem-reporting")public static WebElement InsepectionReadyTab;
	
	@FindBy(id= "menuitem-reporting")public static WebElement DashBoardTab;
	
	WebDriver driver =  AqureLoginPage.driver;
	
	//driver = AqureLoginPage


	static int	TimeoutValue = 30;




public AqureMainPage()
{
	 
	PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeoutValue), this);

}

public static void Click_AdminTab()
{
	
	AdminTab.click();
	
}






}
