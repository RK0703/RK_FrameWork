package com.TestCases;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import com.PageFactory.AqureLoginPage;
//import org.openqa.selenium.support.FindBy;

public class Dummytooltip
{
	public static void main (String a[])
	{
	WebDriver driver = AqureLoginPage.driver;
	driver.get("http://localhost/Aqure/Operator/Operator/List");
	AqureLoginPage.SetUserName();
	AqureLoginPage.SetPassword("Admin@123");
	AqureLoginPage.Click_LoginBtn();
	//WebElement imgLocator = FindElement(By.id("4e5d1854-5437-4586-aae0-77fd73699055_pending"));
	Actions builder = new Actions(driver);
	//builder.MoveToElement(imgLocator).Build().Perform();
	//WebElement tooltiplocator = FindElement(By.id("trainingCallout"));
}//
}