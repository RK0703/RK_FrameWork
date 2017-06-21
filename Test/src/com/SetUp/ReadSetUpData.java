package com.SetUp;

import org.junit.Before;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class ReadSetUpData 

{

	public static String URL = "http://localhost/Aqure";
	public static String BrowserName ;
	public static String driverPath = "K://SeleniumRelatedFiles//Drivers//";
	public static String UserName = "admin";
	public static String Password = "P@ssw0rd";
	
	public static void ReadData()
	{
	
		
			File file = new File("K:/MySeleniumWork/SeleniumWorks/src/com/SetUp/DataFile.properties");
			//K:\MySeleniumWork\SeleniumWorks\src\com\SetUp\DataFile.properties
			FileInputStream fileInput = null ;
			try 
			{
				fileInput = new FileInputStream(file);
			} 
			catch (FileNotFoundException FileNotFound)
			{
				FileNotFound.printStackTrace();
			}
			Properties prop = new Properties();
			try 
			{
				prop.load(fileInput);
			} catch (IOException IOExcep)
			{
				IOExcep.printStackTrace();
			}
			
				
				 UserName = "admin";//prop.getProperty("UserName");
				 Password = "P@ssw0rd";//prop.getProperty("Password");
				 BrowserName = prop.getProperty("Browser");
				System.out.println("BrowserName Receive is : "+BrowserName);
				System.out.println("UserName : "+UserName);
				System.out.println("Password  : "+Password);
				
				switch (BrowserName)
				{
				case "IE" :
					{
						System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe");
					}
					break;
				case "CH":
				{
					System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
				}
				break;
				} // end of Switch and Case
				
				
				
				//System.out.println("Browser " + ":- " + Browser);
			
			/*
			Enumeration KeyValues = prop.keys();
			while (KeyValues.hasMoreElements())
			{
				String key = (String) KeyValues.nextElement();
				String value = prop.getProperty(key);
				System.out.println(key + ":- " + value);
			}
	*/
	}}

