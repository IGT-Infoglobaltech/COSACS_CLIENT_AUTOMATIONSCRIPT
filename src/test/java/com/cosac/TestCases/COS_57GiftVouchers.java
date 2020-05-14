package com.cosac.TestCases;
import java.awt.Robot;
import java.awt.event.KeyEvent;
//Here we are Creating and Verifying New Store Location in Country
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Name;
import com.cosac.Locators.Xpath;

import com.cosac.PageObject.Library;
import com.cosac.PageObject.LoginPage;

public class COS_57GiftVouchers extends LoginPage {
	


	//voucher name changes all the time
	String VoucherName="0100";
	String VoucherValue="0093";
	String AccountNum="910443648210";
	//file name changes all the time
	String FileName="1234";
	LoginPage login=new LoginPage();
    //Verifying Transaction--> GiftVoucher.
	@Test
	public void Client() throws Throwable
	{
		try {
			login.LoginCosacClient();
			Thread.sleep(15000);
			Robot robot=new Robot();
			//user click on the gift voucher
			System.out.println("User clicked on the Transaction");
			//user enters the name  of the gift voucher
			robot.keyPress(KeyEvent.VK_ALT);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_T);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_ALT);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_T);
			
	        System.out.println("User clicked on the GiftVoucher");
	        robot.keyPress(KeyEvent.VK_SHIFT);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_V);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_SHIFT);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_V);
	     // user enters the referance name
	        Library.Interaction.writeKeyboard(robot, VoucherName);
	        
	        
	        
	        //user selects the check box
			robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_TAB);
			//user click on the check box
	        robot.keyPress(KeyEvent.VK_ENTER);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_ENTER);
			//user Moves to expiry date 
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_TAB);
	        //user enters the voucher value
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_TAB);
	        //user enters the value
	        Library.Interaction.writeKeyboard(robot, VoucherValue);
	        
			//user click on the enter
			robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_TAB);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_ENTER);
            //user clicked on the Transactions
			robot.keyPress(KeyEvent.VK_ALT);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_T);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_ALT);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_T);
	        //user enters the payment screen
	        robot.keyPress(KeyEvent.VK_SHIFT);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_P);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_SHIFT);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_P);
	        Thread.sleep(5000);
	        //user enters the account number
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_TAB);
	        Library.Interaction.writeKeyboard(robot, AccountNum);
	        Thread.sleep(5000);
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_TAB);
	        Thread.sleep(3000);
	        //user selects the gift voucher from the list
	        robot.keyPress(KeyEvent.VK_SHIFT);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_SHIFT);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_TAB);
            //user sell the  voucher
	        //user selects the gift voucher as the payment option
	        robot.keyPress(KeyEvent.VK_G);
			Thread.sleep(500);
			robot.keyRelease(KeyEvent.VK_G);
			robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_TAB);
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_TAB);
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_TAB);
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_TAB);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        robot.keyPress(KeyEvent.VK_G);
			Thread.sleep(500);
			robot.keyRelease(KeyEvent.VK_G);
			//user enters the gift voucher name
			robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_TAB);
	        Library.Interaction.writeKeyboard(robot, VoucherName);
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_TAB);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_TAB);
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_TAB);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        //user click on pay button
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_TAB);
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_TAB);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	       
		
		} catch (Exception e) {
			driver.close();
		}
		
		
	}
     
 }

