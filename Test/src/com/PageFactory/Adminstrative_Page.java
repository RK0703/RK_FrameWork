package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Adminstrative_Page 
{

	// Elements in Admin Page
		@FindBy(id= "spaitem-confmgmt")private static WebElement Link_ConfigMgmt;
		
		@FindBy(id= "spaitem-hospitals")private static WebElement Link_EditHosp_Dept;
		
		@FindBy(id= "menuitem-issue")private static WebElement Link_ConfigParameterProfile;
		
		@FindBy(id= "menuitem-operator")private static WebElement Link_Reporting;
		
		@FindBy(id= "menuitem-patientview")private static WebElement Link_ManageUsers;
		
		@FindBy(id= "menuitem-reporting")private static WebElement Link_AddUsers;
		
		@FindBy(id= "spaitem-lotmgmt")private static WebElement Link_LotManagement;
		
		@FindBy(id= "spaitem-courses")private static WebElement Link_ManageCourse;
		
		
		WebDriver driver =  AqureLoginPage.driver;
		static int	TimeoutValue = 30;

		public Adminstrative_Page()
		{
			 
			PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeoutValue), this);

		}

		public static void Click_EditHosp_Dept()
		{
			
			Link_EditHosp_Dept.click();
			
		}
		
		public static void Click_AddUser()
		{
			
			Link_AddUsers.click();
			
			
		}
		public static void Click_ManageCourse()
		{
			Link_ManageCourse.click();
	
		}
		


		public static void Click_ConfigMgmtBtn()
		{
			
			Link_ConfigMgmt.click();
			
			
		}


}
