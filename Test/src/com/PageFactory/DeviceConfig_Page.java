package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class DeviceConfig_Page

{

	@FindBy(xpath= "id('deviceconfiguration-body')/x:div[2]/x:section/x:div/x:section[2]/x:div/x:div[41]/x:input")public static WebElement PatientRapidDATTestSettings;


	WebDriver driver =  AqureLoginPage.driver;
	static int	TimeoutValue = 30;

	public DeviceConfig_Page()
	{
		 
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeoutValue), this);

	}


}
