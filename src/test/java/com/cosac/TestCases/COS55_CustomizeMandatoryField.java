package com.cosac.TestCases;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.event.KeyEvent;
//Here we are Creating and Verifying New Store Location in Country
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.ToolTipUI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.WiniumDriver;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Id;
import com.cosac.Locators.Name;
import com.cosac.Locators.Xpath;

import com.cosac.PageObject.Library;
import com.cosac.PageObject.LoginPage;
import com.cosac.Utilities.JsonParser;

public class COS55_CustomizeMandatoryField extends LoginPage {
	
	
	LoginPage login=new LoginPage();
	Screen s;
	
    //Verifying Create--> Location.
	@Test
	public void Client() throws Throwable
	{
		try {
			
			login.LoginCosacClient();
            Thread.sleep(11000);
            s = new Screen();
			Robot robo1 = new Robot();
			robo1.keyPress(KeyEvent.VK_ALT);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_W);
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_W);
			Thread.sleep(500);
			robo1.keyRelease(KeyEvent.VK_ALT);
			Thread.sleep(3000);
			robo1.keyPress(KeyEvent.VK_RIGHT);
			Thread.sleep(2000);
			s.find(JsonParser.getSikuliScreePath("SystemConfig.CustomizeMandField.CustomMandField"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(3000);
			//Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_UP);
			Thread.sleep(2000);
			s.find(JsonParser.getSikuliScreePath("SystemConfig.CustomizeMandField.Enable"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(500);
			s.click();
			Thread.sleep(1000);
			s.find(JsonParser.getSikuliScreePath("SystemConfig.CustomizeMandField.Visible"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(500);
			s.click();
			Thread.sleep(1000);
			s.find(JsonParser.getSikuliScreePath("SystemConfig.CustomizeMandField.SaveIcon"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Library.Interaction.print("User is able to De-Select 'Enable and Visible' for (Applicant1: Name of Bank)");
			Thread.sleep(1000);
			s.find(JsonParser.getSikuliScreePath("SystemConfig.CustomizeMandField.selectEnable"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(500);
			s.click();
			Thread.sleep(1000);
			s.find(JsonParser.getSikuliScreePath("SystemConfig.CustomizeMandField.selectVisible"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(500);
			s.click();
			
			Thread.sleep(1000);
			s.find(JsonParser.getSikuliScreePath("SystemConfig.CustomizeMandField.SaveIcon"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Library.Interaction.print("User is able to Select 'Enable and Visible' for (Applicant1: Name of Bank)");
			
			//+++++++++++++++++++++++++
			Thread.sleep(700);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			s.find(JsonParser.getSikuliScreePath("SystemConfig.CustomizeMandField.Enable"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(500);
			s.click();
			Thread.sleep(1000);
			s.find(JsonParser.getSikuliScreePath("SystemConfig.CustomizeMandField.Visible"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(500);
			s.click();
			Thread.sleep(1000);
			s.find(JsonParser.getSikuliScreePath("SystemConfig.CustomizeMandField.SaveIcon"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Library.Interaction.print("User is able to De-Select 'Enable and Visible' for (A1 employer address line 1)");
			Thread.sleep(1000);
			s.find(JsonParser.getSikuliScreePath("SystemConfig.CustomizeMandField.selectEnable"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(500);
			s.click();
			Thread.sleep(1000);
			s.find(JsonParser.getSikuliScreePath("SystemConfig.CustomizeMandField.selectVisible"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(500);
			s.click();
			
			Thread.sleep(1000);
			s.find(JsonParser.getSikuliScreePath("SystemConfig.CustomizeMandField.SaveIcon"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Library.Interaction.print("User is able to Select 'Enable and Visible' for (A1 employer address line 1)");
			
			//+++++++++++++++++++++++++
			Thread.sleep(700);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			s.find(JsonParser.getSikuliScreePath("SystemConfig.CustomizeMandField.Enable"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(500);
			s.click();
			Thread.sleep(1000);
			s.find(JsonParser.getSikuliScreePath("SystemConfig.CustomizeMandField.Visible"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(500);
			s.click();
			Thread.sleep(1000);
			s.find(JsonParser.getSikuliScreePath("SystemConfig.CustomizeMandField.SaveIcon"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Library.Interaction.print("User is able to De-Select 'Enable and Visible' for (Ref Check)");
			Thread.sleep(1000);
			s.find(JsonParser.getSikuliScreePath("SystemConfig.CustomizeMandField.selectEnable"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(500);
			s.click();
			Thread.sleep(1000);
			s.find(JsonParser.getSikuliScreePath("SystemConfig.CustomizeMandField.selectVisible"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(500);
			s.click();
			
			Thread.sleep(1000);
			s.find(JsonParser.getSikuliScreePath("SystemConfig.CustomizeMandField.SaveIcon"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Library.Interaction.print("User is able to Select 'Enable and Visible' for (Ref Check)");
			Thread.sleep(4000);
			s.find("C:\\Users\\InfoGlobal_Tech3\\eclipse-workspace\\COSAC_CLIENT\\target\\CloseClient.png");
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
		
		    Thread.sleep(10000);
		    

		} catch (Exception e) {
			windriver.close();
			e.printStackTrace();
			Assert.assertTrue(false);
		}
		
		
	}
     
 }

