package com.cosac.TestCases;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.cosac.PageObject.Library;
import com.cosac.PageObject.LoginPage;

public class COS107_Reports_CommissionEnquiry extends LoginPage {

	
	public String Reports=".\\target\\COS42_68_69_70_106_107\\Reports.PNG";
	public String Load=".\\target\\COS42_68_69_70_106_107\\Load.PNG";
	public String Blank=".\\target\\COS42_68_69_70_106_107\\Blank.PNG";
	public String BlueArrow=".\\target\\COS42_68_69_70_106_107\\BlueArrow.PNG";
	public String ExporttoExcel=".\\target\\COS42_68_69_70_106_107\\ExporttoExcel.PNG";


	@Test
	public void CommissionEnquiry() throws Throwable
	{

		try
		{

            Screen s = new Screen();
            Thread.sleep(5000);
			s.find(Reports);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(3000);
			Library.Interaction.print("User clicked on Reports");
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
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			Library.Interaction.print("User clicked on Sales Commission Enquiry");
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(3000);
			Library.Interaction.writeKeyboard(robo1, "1");
			Thread.sleep(2000);
			Library.Interaction.print("User Entered January Month");
			robo1.keyPress(KeyEvent.VK_RIGHT);
			robo1.setAutoDelay(50);
			Thread.sleep(2000);
			Library.Interaction.writeKeyboard(robo1, "1");
			Thread.sleep(2000);
			Library.Interaction.print("User Selected 1st January");
			robo1.keyPress(KeyEvent.VK_RIGHT);
			robo1.setAutoDelay(50);
			Thread.sleep(2000);
			Library.Interaction.writeKeyboard(robo1, "2017");
			Thread.sleep(2000);
			Library.Interaction.print("User Selected 2017");
			s.find(Load);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(20000);
			Library.Interaction.print("User Clicked on Load Button");
			 s.find(Blank);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(5000);
			Library.Interaction.print("User Clicked on Blank Button");
		    s.find(BlueArrow);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(5000);
			Library.Interaction.print("User Clicked on BlueArrow Button");
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
