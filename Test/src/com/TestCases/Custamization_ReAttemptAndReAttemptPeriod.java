package com.TestCases;

import static org.junit.Assert.*;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Date;

import com.GlobalVariables.GlobalVariables;
import com.PageFactory.Add_Operator_Page;
import com.PageFactory.Adminstrative_Page;
 

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.PageFactory.AqureLoginPage;
import com.PageFactory.AqureMainPage;
import com.SetUp.ReadSetUpData;

import com.PageFactory.DeviceConfig_Page;
import com.PageFactory.ManageCourse_Page;
import com.PageFactory.Operator_Page;





public class Custamization_ReAttemptAndReAttemptPeriod

{
	//public WebDriver driver;
	
//	public static String driverPath = "K://SeleniumRelatedFiles//IEDriverServer_x64_3.3.0//";
	
	@Before
	public void setUp() throws Exception
	{
		ReadSetUpData.ReadData();
		System.out.println("ReadData () Browser name  :" +ReadSetUpData.BrowserName);
		String BaseURL = ReadSetUpData.URL;
		
		AqureLoginPage.driver.get(BaseURL);
	}

	@After
	public void tearDown() throws Exception
	{
		if(AqureLoginPage.driver!=null) 
		{
			System.out.println("Closing IE browser");
			//AqureLoginPage.driver.quit();
		}
	}

	@Test
	public void test() 
	{
		AqureLoginPage ap = new AqureLoginPage();
		String CourseTitle = "Course"+GlobalVariables.GetCurrentTimeStamp();
		String CourseFileLocation = "K:/Aqure_E2E_Framwork/Courses/Passing SCORM_AutoIt.exe";
		ReadSetUpData.ReadData();
		AqureLoginPage.driver.manage().window().maximize();
	//	AqureLoginPage.ClearFileds();
		AqureLoginPage.SetUserName();
		//AqureLoginPage.Password.clear();
		AqureLoginPage.SetPassword(ReadSetUpData.Password);
		AqureLoginPage.Click_LoginBtn();
		AqureMainPage AMP = new AqureMainPage();
		AqureMainPage.Click_AdminTab();
		Adminstrative_Page AP = new Adminstrative_Page();
		Adminstrative_Page.Click_ManageCourse();
		ManageCourse_Page  Mp = new ManageCourse_Page();
		ManageCourse_Page.Click_AddButton();
		ManageCourse_Page.Check_UseTitleCkeckBox();
		ManageCourse_Page.EnterCourse_Title(CourseTitle);
		ManageCourse_Page.Click_BtnBrowse();
		ManageCourse_Page.FlieUpload(CourseFileLocation);
		ManageCourse_Page.SelectDeviceType();
		ManageCourse_Page.SetNumberOfReAttempts("1");
		ManageCourse_Page.Click_OKbutton();
		ManageCourse_Page.Click_OnPublisButton();
		Operator_Page.Click_AddOperator();
		Add_Operator_Page AddOp = new Add_Operator_Page();
		Add_Operator_Page.SetFirstName();
		Add_Operator_Page.SetEmailID();
		Add_Operator_Page.AssigneHospital();
		Add_Operator_Page.AssigneDept();
		Add_Operator_Page.Click_Save();
		Add_Operator_Page.Click_BackToOperatorButton();
		Operator_Page OpPage = new Operator_Page();
		Operator_Page.SearchIn_Operator();
		Operator_Page.Check_AllOperatorCheckBox();
		Operator_Page.Click_AssignCourse_Button();
		Operator_Page.SetDueDate();
	}
	

}
