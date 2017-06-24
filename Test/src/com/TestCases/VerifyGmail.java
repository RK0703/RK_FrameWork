package com.TestCases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.PageFactory.AqureLoginPage;
import com.SetUp.ReadSetUpData;
import com.Utilities.Gmail;

public class VerifyGmail 
{
	@Before
	public void setUp() throws Exception
	{
		Gmail.Launch_Gmail();
		Gmail.Click_FirstRowOfGmail();
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
		Gmail gm =new Gmail();
		String ExpectedSting = "The password for your Google Account ravikiran.mallappa@gmail.com was recently changed";
		String ActualString = Gmail.GmailDriver.getPageSource();
		if (ActualString.contains(ExpectedSting))
			{
			
			System.out.println("Pass");
			
			
			}
		else 
		{
			System.out.println("Fail");
			
		}
	}

}
