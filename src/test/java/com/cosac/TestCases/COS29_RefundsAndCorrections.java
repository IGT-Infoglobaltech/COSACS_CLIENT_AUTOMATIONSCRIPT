package com.cosac.TestCases;
import java.awt.Robot;
import java.awt.event.KeyEvent;
//Here we are Creating and Verifying New Store Location in Country
import java.io.IOException;
import java.net.URL;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.WiniumDriver;

import org.openqa.selenium.winium.WiniumOptions;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Id;
import com.cosac.Locators.Name;
import com.cosac.Locators.Xpath;

import com.cosac.PageObject.Library;
import com.cosac.PageObject.LoginPage;

public class COS29_RefundsAndCorrections extends LoginPage {
	
	private static final WiniumOptions String = null;

	String AccountNum = "910000037341";
	String PaymentAccNum = "910000037341";
	String Amount = "500";
	String Filename = "Vincy";
	String CloseIcon=".\\target\\COS29_RefundAndCorrection\\CloseIcon.png";
	String DownArrow=".\\target\\COS29_RefundAndCorrection\\DownArrow.png";
	String Data=".\\target\\COS29_RefundAndCorrection\\Data.png";
	String EnterBtn=".\\target\\COS29_RefundAndCorrection\\EnterBtn.png";
	String AuthoriseBtn=".\\target\\COS29_RefundAndCorrection\\AuthoriseBtn.png";
	
	LoginPage login = new LoginPage();
   
	@Test
	public void Client() throws Throwable
	
	{
		try {
			login.LoginCosacClient();
			Thread.sleep(5000);
			Screen S = new Screen();
			
			
			//Clicking on Transactions
			Robot robo= new Robot();
			robo.keyPress(KeyEvent.VK_ALT);
			robo.keyPress(KeyEvent.VK_T);
			Thread.sleep(2000);
			//robo.keyRelease(KeyEvent.VK_ALT);
			//robo.keyRelease(KeyEvent.VK_T);
			
			//Clicking on Payments Tab
			
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(500);
			//robo.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(30000);
			Library.Interaction.print("User Clicked on Payments Tab");
			
			//Entering Account Number under Payments
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			//robo.keyRelease(KeyEvent.VK_TAB);
			Library.Interaction.writeKeyboard(robo, PaymentAccNum);
			Thread.sleep(5000);
			Library.Interaction.print("User Entered Account Number");
			
			//Entering Amount in the field
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			//robo.keyRelease(KeyEvent.VK_TAB);
			Library.Interaction.writeKeyboard(robo, Amount);
			Thread.sleep(2000);
			Library.Interaction.print("User Entered Amount");
			
			
			
			//Clicking on Pay Button
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			//robo.keyRelease(KeyEvent.VK_TAB);	
			
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			//robo.keyRelease(KeyEvent.VK_TAB);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			//robo.keyRelease(KeyEvent.VK_TAB);
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(500);
			//robo.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(20000);
			Library.Interaction.print("User Clicked on Pay Button");
			
			//Saving the file
			Library.Interaction.writeKeyboard(robo, Filename);
			
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			//robo.keyRelease(KeyEvent.VK_TAB);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			//robo.keyRelease(KeyEvent.VK_TAB);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			//robo.keyRelease(KeyEvent.VK_TAB);
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(500);
			//robo.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			Library.Interaction.print("User Entered the File Name");
			
			//Clicking on Cancel Button
			
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			//robo.keyRelease(KeyEvent.VK_TAB);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			//robo.keyRelease(KeyEvent.VK_TAB);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			//robo.keyRelease(KeyEvent.VK_TAB);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			//robo.keyRelease(KeyEvent.VK_TAB);
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(500);
			//robo.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			
			S.find(CloseIcon);
			S.mouseMove();
			Thread.sleep(200);
			S.click();
			Thread.sleep(2000);
			Library.Interaction.print("User Clicked on Close Icon");
			Thread.sleep(200);
			
			//Clicking on Transaction Tab
			robo.keyPress(KeyEvent.VK_ALT);
			robo.keyPress(KeyEvent.VK_T);
			Thread.sleep(2000);
			//robo.keyRelease(KeyEvent.VK_ALT);
			//robo.keyRelease(KeyEvent.VK_T);
			
			//Clicking on Refunds and Corrections Sub menu
			robo.keyPress(KeyEvent.VK_UP);
			Thread.sleep(500);
			//robo.keyRelease(KeyEvent.VK_UP);
			robo.keyPress(KeyEvent.VK_UP);
			Thread.sleep(500);
			//robo.keyRelease(KeyEvent.VK_UP);
			robo.keyPress(KeyEvent.VK_UP);
			Thread.sleep(500);
			//robo.keyRelease(KeyEvent.VK_UP);
			robo.keyPress(KeyEvent.VK_UP);
			Thread.sleep(500);
			//robo.keyRelease(KeyEvent.VK_UP);
			robo.keyPress(KeyEvent.VK_UP);
			Thread.sleep(500);
			//robo.keyRelease(KeyEvent.VK_UP);
			robo.keyPress(KeyEvent.VK_UP);
			Thread.sleep(500);
			//robo.keyRelease(KeyEvent.VK_UP);
			
			//click on enter
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(500);
			//robo.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(10000);
			
			//Enter the value on the account number text box
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			//robo.keyRelease(KeyEvent.VK_TAB);
			Library.Interaction.writeKeyboard(robo, AccountNum);
			Library.Interaction.print("User Entered Account Number");
			//Thread.sleep(200);
			
			//To click on the Search button
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(200);
			//robo.keyRelease(KeyEvent.VK_TAB);
			
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(500);
			//robo.keyRelease(KeyEvent.VK_ENTER);
			Library.Interaction.print("User Clicked on Search Button");
			Thread.sleep(3000);
			
			//Clicking on the down arrow
			S.find(DownArrow);
			S.mouseMove();
			Thread.sleep(200);
			S.doubleClick();
			S.doubleClick();
			S.doubleClick();
			S.doubleClick();
			S.doubleClick();
			S.doubleClick();
			S.doubleClick();
			Thread.sleep(2000);
			
			//Clicking on the Added Data
			S.find(Data);
			S.mouseMove();
			Thread.sleep(200);
			S.click();
			Thread.sleep(20000);
			
			//Clicking on the Enter Button
			S.find(EnterBtn);
			S.mouseMove();
			Thread.sleep(200);
			S.click();
			Thread.sleep(2000);
			
			//Entering the credentials for authorisation
			//Library.Interaction.writeKeyboard(robo, AuthoriseUser);
			//Thread.sleep(200);
			
			//robo.keyPress(KeyEvent.VK_TAB);
			//Thread.sleep(200);
			//robo.keyRelease(KeyEvent.VK_TAB);
			//Library.Interaction.writeKeyboard(robo, Password);
			//Thread.sleep(200);
			
			//Clicking on Authorise Button
			S.find(AuthoriseBtn);
			S.mouseMove();
			Thread.sleep(200);
			S.click();
			Thread.sleep(2000);
			
			
		} catch (Exception e) {
			driver.close();
		}
		
		
	}
	
     
 }

