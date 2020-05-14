package com.cosac.TestCases;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.event.InputEvent;
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


public class COS27_Customer extends LoginPage {
	
	
	LoginPage login=new LoginPage();
	Screen s;
	
    //Verifying Create--> Location.
	@Test
	public void Client() throws Throwable
	{
		try {
			
		login.LoginCosacClient();

            Thread.sleep(12000);
            s = new Screen();
			

			Robot robo1 = new Robot();
			
			
		    robo1.keyPress(KeyEvent.VK_ALT);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_C);
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_C);
			Thread.sleep(500);
			robo1.keyRelease(KeyEvent.VK_ALT);
			


			//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_ENTER);
			// log.info("User is able to click to New Customer");
			Thread.sleep(4000);

			s.find(JsonParser.getSikuliScreePath("cos27.CashAndLoan.CustomerID"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(700);
			// System.out.println(JsonParser.getLocation_Data("locationData.cos01.CustomerID"));
			Library.Interaction.writeKeyboard(robo1, JsonParser.Data("COS27.CashAndLoan.PersonalID"));
			Thread.sleep(2000);
			s.find(JsonParser.getSikuliScreePath("cos27.CashAndLoan.LinkingAccount"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			// s.mouseMove();
			Thread.sleep(1000);
			// robo1.keyPress(KeyEvent.VK_TAB);
			// Thread.sleep(3000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			// Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_RIGHT);
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_RIGHT);
			Thread.sleep(300);
			Library.Interaction.userWait();
			Library.Interaction.writeKeyboard(robo1, JsonParser.Data("COS27.CashAndLoan.DOB"));
			Thread.sleep(1000);
			// Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			// Thread.sleep(1000);
			Library.Interaction.userWait();
			Library.Interaction.writeKeyboard(robo1, JsonParser.Data("COS27.CashAndLoan.FirstName"));
			Thread.sleep(1000);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			// Thread.sleep(1000);
			Library.Interaction.userWait();
			Library.Interaction.writeKeyboard(robo1, JsonParser.Data("COS27.CashAndLoan.LastName"));
			// Thread.sleep(1000);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			s.find(JsonParser.getSikuliScreePath("cos27.CashAndLoan.AddressAdd"));
			s.mouseMove();
			Thread.sleep(500);
			//Library.Interaction.userWait();
			s.click();
			Thread.sleep(4000);
			robo1.keyPress(KeyEvent.VK_TAB);
			// Thread.sleep(1000);
			Library.Interaction.userWait();
			Library.Interaction.writeKeyboardString(robo1, JsonParser.Data("COS27.CashAndLoan.Address1"));
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Library.Interaction.userWait();
			Library.Interaction.writeKeyboardString(robo1, JsonParser.Data("COS27.CashAndLoan.Address2"));
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			// Thread.sleep(1000);
			Library.Interaction.userWait();
			Library.Interaction.writeKeyboardString(robo1, JsonParser.Data("COS27.CashAndLoan.Address3"));
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			// Thread.sleep(1000);
			Library.Interaction.userWait();
			Library.Interaction.writeKeyboard(robo1, JsonParser.Data("COS27.CashAndLoan.PostalCode"));
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			//Library.Interaction.writeKeyboard(robo1, JsonParser.Data("COS27.CashAndLoan.PhoneAreaCode"));
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			//Library.Interaction.userWait();
			//Library.Interaction.writeKeyboard(robo1, JsonParser.Data("COS27.CashAndLoan.PhoneNumber"));
			Thread.sleep(500);
			// Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			// Thread.sleep(1000);
			// Library.Interaction.userWait();
			// Library.Interaction.writeKeyboard(robo1,
			// JsonParser.CashAccount_Data("CashAndGo.NewCustomerCASHAccount.Extenssion"));
			Thread.sleep(500);
			// Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);

			Library.Interaction.writeKeyboardString(robo1, JsonParser.Data("COS27.CashAndLoan.Email"));
			Thread.sleep(300);
			// Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			// Thread.sleep(1000);
			// Library.Interaction.userWait();
			// Library.Interaction.writeKeyboard(robo1,
			// JsonParser.CashAccount_Data("CashAndGo.NewCustomerCASHAccount.Mobile"));
			// s.mouseMove();
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(4000);
			s.find(JsonParser.getSikuliScreePath("cos27.CashAndLoan.CreateReadyFinance"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(5000);
			s.find("C:\\Users\\InfoGlobal_Tech3\\eclipse-workspace\\COSAC_CLIENT\\target\\COS27_CashAndLoan\\MatchingRecord.png");
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			//s.rightClick();
			Thread.sleep(1000);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			String AcountNum=Library.Interaction.copyText(robo1).replace("-","");
			System.out.println(AcountNum);
			Thread.sleep(700);
			robo1.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        	robo1.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        	Thread.sleep(700);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(7000);
			Thread.sleep(300);
			//Personal
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(4000);
			//Residential
			s.find(JsonParser.getSikuliScreePath("cos27.CashAndLoan.ResidentialButton"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(700);
			robo1.keyPress(KeyEvent.VK_DELETE);
			Thread.sleep(500);
			Library.Interaction.writeKeyboard(robo1,"5");
			robo1.keyPress(KeyEvent.VK_ENTER);
			System.out.println("Data ENtered");
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_TAB);
			System.out.println("Tab Pressed");
			Thread.sleep(4000);
			s.find("C:\\Users\\InfoGlobal_Tech3\\eclipse-workspace\\COSAC_CLIENT\\target\\COS27_CashAndLoan\\CurrResidentialSt.png");
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(700);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(4000);
			s.find(JsonParser.getSikuliScreePath("cos27.CashAndLoan.Employment"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(700);
			robo1.keyPress(KeyEvent.VK_DELETE);
			Thread.sleep(500);
			Library.Interaction.writeKeyboard(robo1,"5");
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(4000);
			s.find(JsonParser.getSikuliScreePath("cos27.CashAndLoan.EmployeeStatus"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(700);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			//Pay Frequency
			Thread.sleep(2000);
			s.find(JsonParser.getSikuliScreePath("cos27.CashAndLoan.Finnancial"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(700);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			Library.Interaction.writeKeyboardString(robo1, "100000");
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			Library.Interaction.writeKeyboardString(robo1, "1000");
			Thread.sleep(2000);
			s.find(JsonParser.getSikuliScreePath("cos27.CashAndLoan.Category"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(2000);
			s.find("C:\\Users\\InfoGlobal_Tech3\\eclipse-workspace\\COSAC_CLIENT\\target\\COS27_CashAndLoan\\ProductCategory1.png");
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(700);
			//Thread.sleep(700);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2500);
			s.find(JsonParser.getSikuliScreePath("cos27.CashAndLoan.GreenButton"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(1500);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			s.find(JsonParser.getSikuliScreePath("cos27.CashAndLoan.S2"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(5000);
			s.find(JsonParser.getSikuliScreePath("cos27.CashAndLoan.EmployerDetals"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(700);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, "Jerry");
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, "Street1");
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, "Street2");
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, "234567");
			Thread.sleep(3000);
			s.find(JsonParser.getSikuliScreePath("cos27.CashAndLoan.References"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(700);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, "Jack");
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, "Luis");
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, "HomeAdress1");
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, "HomeAdress2");
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, "8976554");
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			s.find(JsonParser.getSikuliScreePath("cos27.CashAndLoan.Reference2"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(700);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, "JackSecond");
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, "Luis");
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, "HomeAdress3");
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, "HomeAdress4");
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, "8976558");
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			s.find(JsonParser.getSikuliScreePath("cos27.CashAndLoan.Comments"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(2000);
			s.find(JsonParser.getSikuliScreePath("cos27.CashAndLoan.GreenButton"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			//********************************************
			Thread.sleep(3000);
			s.find(JsonParser.getSikuliScreePath("cos27.CashAndLoan.DD"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(700);
			//Proof Of ID
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
		    Library.Interaction.writeKeyboardString(robo1, "23456780");
			Thread.sleep(300);
			//Proof of Income
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, "kl097654");
			//Proof Of Address
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, "kl09765hg");
			Thread.sleep(2000);
			s.find(JsonParser.getSikuliScreePath("cos27.CashAndLoan.GreenButton"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(3000);
			s.find(JsonParser.getSikuliScreePath("cos27.CashAndLoan.UW"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(3000);
			s.find(JsonParser.getSikuliScreePath("cos27.CashAndLoan.Approve"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(2000);
			s.find(JsonParser.getSikuliScreePath("cos27.CashAndLoan.GreenButton"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			
			
			//******************************************************************
			Thread.sleep(4000);
			s.find("C:\\Users\\InfoGlobal_Tech3\\eclipse-workspace\\COSAC_CLIENT\\target\\COS27_CashAndLoan\\Main.png");
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(1500);
			robo1.keyPress(KeyEvent.VK_ALT);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_C);
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_C);
			Thread.sleep(500);
			robo1.keyRelease(KeyEvent.VK_ALT);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_UP);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_UP);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_UP);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			Library.Interaction.writeKeyboard(robo1, JsonParser.Data("COS27.CashAndLoan.PersonalID"));
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_ENTER);
			
			Thread.sleep(4000);
			s.find("C:\\Users\\InfoGlobal_Tech3\\eclipse-workspace\\COSAC_CLIENT\\target\\COS27_CashAndLoan\\PurposeForCashLoan.png");
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(700);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(400);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(4000);
			s.find("C:\\Users\\InfoGlobal_Tech3\\eclipse-workspace\\COSAC_CLIENT\\target\\COS27_CashAndLoan\\Accept.png");
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(7000);
			//Document Confirmation DC
			Thread.sleep(700);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, "8976558");
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, "897655800");
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, "8976558");
			Thread.sleep(2500);
			s.find(JsonParser.getSikuliScreePath("cos27.CashAndLoan.GreenButton"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(2500);
			s.find("C:\\Users\\InfoGlobal_Tech3\\eclipse-workspace\\COSAC_CLIENT\\target\\COS27_CashAndLoan\\CloseTab.png");
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			
			
			
			s.find("C:\\Users\\InfoGlobal_Tech3\\eclipse-workspace\\COSAC_CLIENT\\target\\COS27_CashAndLoan\\Main.png");
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			
			
			
			//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			
			Thread.sleep(1500);
			robo1.keyPress(KeyEvent.VK_ALT);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_C);
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_C);
			Thread.sleep(500);
			robo1.keyRelease(KeyEvent.VK_ALT);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_DOWN);
			//Thread.sleep(500);
			//robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(4000);
			s.find("C:\\Users\\InfoGlobal_Tech3\\eclipse-workspace\\COSAC_CLIENT\\target\\COS27_CashAndLoan\\IncludeCash.png");
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(2000);
			s.find("C:\\Users\\InfoGlobal_Tech3\\eclipse-workspace\\COSAC_CLIENT\\target\\COS27_CashAndLoan\\Both.png");
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(2000);
			s.find("C:\\Users\\InfoGlobal_Tech3\\eclipse-workspace\\COSAC_CLIENT\\target\\COS27_CashAndLoan\\ExcludeAccount.png");
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(7000);
			s.find("C:\\Users\\InfoGlobal_Tech3\\eclipse-workspace\\COSAC_CLIENT\\target\\CustSearch\\AccountCLick.png");
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_LEFT);
			Thread.sleep(500);
			String str=AcountNum;
			String previous_str = "";
			Boolean flag_one = true;
			while (flag_one) {
				String result1=Library.Interaction.copyText(robo1);
				System.out.println(result1);
				
				if(previous_str.equals(result1))
				{
					flag_one = false;
				}
				if (flag_one) {
                if (str.equals(result1)) {
                	System.out.println("Entered the result="+result1);
                	robo1.keyPress(KeyEvent.VK_ENTER);
                	
                	robo1.mousePress(InputEvent.BUTTON2_DOWN_MASK);
                	robo1.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
                	//robo1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                	//robo1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                	Thread.sleep(100);
                	break;
                }
                else {
                	robo1.keyPress(KeyEvent.VK_DOWN);
                	previous_str = result1;
				}
				}
				else
				{
					break;
				}
			}
			System.out.println("Execution Ended");

			//Thread.sleep(10000);
			
			Thread.sleep(5000);
			s.find("C:\\Users\\InfoGlobal_Tech3\\eclipse-workspace\\COSAC_CLIENT\\target\\COS27_CashAndLoan\\Flag.png");
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_TAB);
			
			
			String str1="(null)";
			//String str="910002767921";
			//String str="910002763241";
			String previous_flag = "";
			flag_one = true;
			while (flag_one) {
				
				Thread.sleep(300);
				robo1.keyPress(KeyEvent.VK_LEFT);
				Thread.sleep(300);
				String current_flag=Library.Interaction.copyText(robo1);
				robo1.keyPress(KeyEvent.VK_RIGHT);
				Thread.sleep(300);
				
				String result=Library.Interaction.copyText(robo1);
				System.out.println(result);
				
				if(previous_flag.equals(current_flag))
				{
					flag_one = false;
				}
				if (flag_one) {
                if (str1.equals(result)) {
                	System.out.println("Entered the result1="+result);
                	robo1.keyPress(KeyEvent.VK_ENTER);
                	
                	robo1.mousePress(InputEvent.BUTTON3_DOWN_MASK);
                	robo1.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
                	robo1.keyPress(KeyEvent.VK_DOWN);
                	Thread.sleep(300);
                	robo1.keyPress(KeyEvent.VK_ENTER);
                	Thread.sleep(300);
                	robo1.keyPress(KeyEvent.VK_TAB);
                	
                }
                else {
                	robo1.keyPress(KeyEvent.VK_DOWN);
                	previous_flag = current_flag;
				}
				}
				else {
					break;
				}
			}
			System.out.println("Execution Ended");
			

		
			//Thread.sleep(10000);

		} catch (Exception e) {
			windriver.close();
			
			e.printStackTrace();
			//windriver.getErrorHandler();
		}
		
		
	}
     
 }

