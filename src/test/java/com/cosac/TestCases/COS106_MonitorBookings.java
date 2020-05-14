package com.cosac.TestCases;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.cosac.Locators.Id;
import com.cosac.PageObject.Library;
import com.cosac.PageObject.LoginPage;

public class COS106_MonitorBookings extends LoginPage {


	public String Reports=".\\target\\COS42_68_69_70_106_107\\Reports.PNG";
	public String Search2=".\\target\\COS42_68_69_70_106_107\\Search2.PNG";
	public String ExporttoExcel=".\\target\\COS42_68_69_70_106_107\\ExporttoExcel.PNG";

    String day="1";
	String Month="4";
	String data="Datafile";


	@Test
	public void MonitorBookings() throws Throwable
	{


		try
		{
			Screen s = new Screen();
			Thread.sleep(5000);
			s.find(Reports);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Library.Interaction.print("User clicked on Reports");
			Thread.sleep(2000);
			Robot robo1=new Robot();
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			Library.Interaction.print("User clicked on Monitor Bookings");
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(3000);
			Library.Interaction.writeKeyboard(robo1, day);
            Library.Interaction.print("User Entered Day");
			Library.Interaction.userWait();
            robo1.keyPress(KeyEvent.VK_RIGHT);
			Thread.sleep(1000);
			Library.Interaction.writeKeyboard(robo1, Month);
			Library.Interaction.print("User Entered Month");
			Library.Interaction.userWait();
			s.find(Search2);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Library.Interaction.print("User clicked on Search button");
			Thread.sleep(7000);
			s.find(ExporttoExcel);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Library.Interaction.print("User clicked on Export to Excel button");
			Thread.sleep(5000);
			Library.Interaction.writeKeyboard(robo1, data);
			Thread.sleep(3000);
			robo1.keyPress(KeyEvent.VK_CONTROL); 
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_A); 
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_A); 
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_CONTROL);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_CONTROL); 
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_C); 
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_C); 
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_CONTROL);
			Library.Interaction.print("User Copy the Account Number");
			Library.Interaction.userWait();
			String FileName=Library.Interaction.captureText();
			Library.Interaction.print("File Name is:"+FileName);
	        Library.Interaction.userWait();
			Library.Interaction.print("User Entered file name");
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			Library.Interaction.print("User Clicked on save button");
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			robo1.keyPress(KeyEvent.VK_ALT); 
			robo1.keyPress(KeyEvent.VK_SPACE);
			robo1.keyPress(KeyEvent.VK_C); 
			robo1.keyRelease(KeyEvent.VK_C);
			robo1.keyRelease(KeyEvent.VK_SPACE); 
			robo1.keyRelease(KeyEvent.VK_ALT);
			Library.Interaction.print("User clicked on Close Window"); 

		}catch(Exception e)
		{
			e.printStackTrace();
			driver.close();
		}

	}

}