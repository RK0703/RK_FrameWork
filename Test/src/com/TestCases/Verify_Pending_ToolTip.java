package com.TestCases;

import static org.junit.Assert.*;

import org.junit.Test;
import com.PageFactory.Operator_Page;

import junit.framework.Assert;
public class Verify_Pending_ToolTip {

	@SuppressWarnings("deprecation")
	@Test
	public void test()
	{
		
		String ToolTipText = Operator_Page.PendingCourseToolTip.getText();
		//String Actualtitle = ToolTipText.contains("Courses Pending");
		String ExpectedTitle = "Courses Pending";
	//	Assert.assertEquals(ExpectedTitle, Actualtitle);
		
	
	}

}
