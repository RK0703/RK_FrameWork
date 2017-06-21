package com.PageFactory;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import com.GlobalVariables.GlobalVariables;
import com.PageFactory.DeviceConfig_Page;

public class Operator_Page
{

	WebDriver driver =  AqureLoginPage.driver;
	static String DueDate = GlobalVariables.GetCurrentDate().toString();
			
	
	
	
	
	
	@FindBy(id= "btnAddOperator")public static WebElement Btn_AddOperator;
	
	@FindBy(id= "btnAssignCourse")private static WebElement AssignCoursBtn;
	
	@FindBy(id= "btnDeviceAccess")public static WebElement DeviceAccessBtn;
	
	@FindBy(id= "btnAccessAction")public static WebElement AccessAction;
	
	@FindBy(id= "4e5d1854-5437-4586-aae0-77fd73699055_pending")public static WebElement TrainingPendingIcon;
	
	@FindBy(id= "4e5d1854-5437-4586-aae0-77fd73699055_completed")public static WebElement TrainingCompletedIcon;
	
	@FindBy(id= "allOperatorsChk")public static WebElement SelectAllCheckBtn;
	
	//
	@FindBy(id= "trainingCallout")public static WebElement PendingCourseToolTip;
	
	@FindBy(id= "tbInputSearchString")private static WebElement TxtBx_Search;
	
	@FindBy(id= "btnSearch")private static WebElement Btn_Search;
	
	@FindBy(id= "allOperatorsChk")private static WebElement ChkBx_AllOperatorCheckBox;
	
	
	@FindBy(id= "tbInputDueDate")private static WebElement TxtBx_DueDate;
	
	@FindBy(id= "ddInputActionSelectorCourse")private static WebElement CourseList;
	
	//
	
	
	
	
	public Operator_Page()
	{
		 
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, DeviceConfig_Page.TimeoutValue), this);

	}

	public static void main(String a[])
	{
		Operator_Page op = new Operator_Page();
	//	Webelement Tooltip = FindElement(By())
		System.out.println("Tool tip text : "+PendingCourseToolTip.getText());
		
	}
	
	public static void SetDueDate()
	{
      
		TxtBx_DueDate.sendKeys(DueDate);
		
	}
	public static void Click_AssignCourse_Button()
	{
		
		
		AssignCoursBtn.click();
		
	}
	
	public static void AssigneCourse()
	{
	Select DropDown = new Select (CourseList);
	
	DropDown.selectByValue(GlobalVariables.OpHomeHosp);


	}

	
	
	
	
	public static void Check_AllOperatorCheckBox()
	{
		
		ChkBx_AllOperatorCheckBox.click();
		
		
	}
	
	
	public static void Click_AddOperator()
	{
		
		Btn_AddOperator.click();
		
	}
	
	
	public static void SearchIn_Operator()
	{
		
		TxtBx_Search.sendKeys(Add_Operator_Page.OpName);
		Btn_Search.click();
		
	}
	
}
