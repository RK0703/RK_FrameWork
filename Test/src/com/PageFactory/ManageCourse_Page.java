package com.PageFactory;

import java.io.IOException;

import javax.swing.JComboBox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageCourse_Page 

{
	WebDriver driver =  AqureLoginPage.driver;

	@FindBy(id= "btnAdd")private static WebElement Btn_AddButton;
	
	@FindBy(id= "PackageMeta")private static WebElement ChkBx_UseTitleChkBx;
	
	@FindBy(id= "ltbInputCourseTitle")private static WebElement TxtBx_Title;
	

	@FindBy(id= "FileUpload")private static WebElement Btn_Browser;

	@FindBy(id= "SelectedDeviceTypes")private static WebElement DeviceType_DropDown;


	@FindBy(id= "AllowReattempts")private static WebElement ChkBx_AllowReAttempt;

	@FindBy(id= "NumberOfReattempts")private static WebElement NumberOfReAttempts;
	
	@FindBy(id= "ReattemptsPeriod")private static WebElement NumberOfReAttemptPeriod;
	//
	@FindBy(id= "btnAddConfirmOk")private static WebElement OkButton;
	//
	
	@FindBy(id= "btnAddConfirmCancel")private static WebElement CancelButton;
	
	@FindBy(id= "btnPublich")private static WebElement Btn_Publish;
	
	
	
	
	
	public ManageCourse_Page()
	{
		
		
		 PageFactory.initElements(new AjaxElementLocatorFactory(driver, AqureLoginPage.TimeoutValue), this);
		
	}
	
	
	public static void Click_OnPublisButton()
	{
		
		Btn_Publish.click();
		
		
	}
	
	
	public static void Click_CancelButton()
	{
		
		CancelButton.click();
		
		
	}
	
	
	public static void Click_OKbutton()
	{
		
		
		OkButton.click();
		
	}
	
	public static String GetNumberOfReAttemptPeriod()
	{
		
		
		String NumberOfReattemptPeriod = NumberOfReAttemptPeriod.getText();
		return NumberOfReattemptPeriod;
		
		
	}
	
	public static void setNumberofReAttemptPeriod(String Index)
	{
		
		
		NumberOfReAttemptPeriod.sendKeys(Index);
		
	}
	
	
	public static String GetNumberOfReAttempts()
	{
		
		String NumberOfReattempts = NumberOfReAttempts.getText();
		
		return NumberOfReattempts;
	}
	
	public static void SetNumberOfReAttempts(String Index)
	{
		
		NumberOfReAttempts.sendKeys(Index);
		
		
		
	}
	public static void Click_BtnBrowse()
	{
		
		Btn_Browser.click();
		
	}
	
	
	
	
	public static void Check_AllowReAttempts_CheckBox()
	{
		
		
		ChkBx_AllowReAttempt.click();
		
	}

	public static void Click_AddButton()
	{
		
		Btn_AddButton.click();
		
		
	}

	public static void Check_UseTitleCkeckBox()
	{
		
		ChkBx_UseTitleChkBx.click();
		
	}

	
	public static void EnterCourse_Title(String Title)
	{
		TxtBx_Title.clear();
		String TitleTxt = Title;
		TxtBx_Title.sendKeys(TitleTxt);
		
		
	}
	
	public static void FlieUpload(String AutoItFileLocation)
	{
		
		try
		{
			Runtime.getRuntime().exec(AutoItFileLocation);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void SelectDeviceType()
	{
		DeviceType_DropDown.click();
		
		Select dropdown =  new Select(DeviceType_DropDown);
		dropdown.selectByIndex(1);
		
		
		
	}
	
	
	
}
