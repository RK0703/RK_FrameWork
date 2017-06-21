package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import com.GlobalVariables.GlobalVariables;

public class Add_Operator_Page
{

	public static String OpName = "Op_"+GlobalVariables.GetCurrentTimeStamp();
	
	WebDriver driver =  AqureLoginPage.driver;

	@FindBy(id= "ltbInputOperator_FirstName")private static WebElement TxtBx_FirstName;
	
	@FindBy(id= "ltbInputOperator_Username")private static WebElement TxtBx_UserName;

	@FindBy(id= "ltbInputOperator_Email")private static WebElement TxtBx_EmailId;
//
	@FindBy(id= "lddInputHospitals")private static WebElement SetHospital;
	
	@FindBy(id= "lddInputHomeDepartments")private static WebElement SetDept;
	
	
	@FindBy(id= "btnCancel")private static WebElement Btn_Cancel;
	@FindBy(id= "btnSave")private static WebElement Btn_Save;

	@FindBy(id= "btnBackToOperators")private static WebElement Btn_BackToOperator;
	
	//
	public Add_Operator_Page()
	{
		
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, AqureLoginPage.TimeoutValue), this);	
		
	}
	
	
	public static void Click_BackToOperatorButton()
	{
		
		Btn_BackToOperator.click();
		
	}
	
public static void SetFirstName()
{
	
	TxtBx_FirstName.sendKeys(OpName);
	
	
}

public static void SetEmailID()
{
	TxtBx_EmailId.sendKeys(GlobalVariables.Email_Id);


}

	public static void AssigneHospital()
	{
	Select DropDown = new Select (SetHospital);
	
	DropDown.selectByValue(GlobalVariables.OpHomeHosp);


	}

public static void AssigneDept()
{
	
	Select DropDown = new Select (SetDept);
	DropDown.selectByValue(GlobalVariables.OpHomeDept);
}

public static void Click_Save()
{
	
	Btn_Save.click();
	
	
}

public static void Click_Cancel()
{
	Btn_Cancel.click();

}


}
