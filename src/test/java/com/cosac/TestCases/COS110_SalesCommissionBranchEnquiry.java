package com.cosac.TestCases;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.PageObject.Library;
import com.cosac.PageObject.LoginPage;

public class COS110_SalesCommissionBranchEnquiry extends LoginPage {
	public String Reports = "./target\\Reports.png";
	public String Search = "./target\\Search.png";
	public String Excel = "./target\\Excel.png";
	public static String dayFrom="10";
	public static String dayTo="10";
	public static String monthFrom="10";
	public static String monthTo="10";
	public static String yearFrom="2005";
	public static String yearTo="2020";
	public static String  excelFileName = "Testing123";
	public static String FileName = "./target\\Filename.png";

	LoginPage login = new LoginPage();
	// Verifying Reports--> Sales Commission Branch Enquiry.
	@Test
	public void Client_COS110() throws Throwable {
		try {
			login.LoginCosacClient();
			Thread.sleep(15000);
			Screen s = new Screen();
			s.find(Reports);
			s.click();
			log.info("User clicked on Reports menu");
			Thread.sleep(1000);
			Robot robo=new Robot();
			robo.keyPress(KeyEvent.VK_UP);
			robo.keyPress(KeyEvent.VK_ENTER);
			log.info("User clicked on Sales Commission Branch Enquiry");
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			//Enter FROM date
			log.info("Enter FROM date");
			Library.Interaction.writeKeyboard(robo, dayFrom);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_RIGHT);
			Library.Interaction.writeKeyboard(robo, monthFrom);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_RIGHT);
			Library.Interaction.writeKeyboard(robo, yearFrom);
			log.info("User entered TO date");
			System.out.println("Enter TO date");
			robo.keyPress(KeyEvent.VK_TAB);
			Library.Interaction.writeKeyboard(robo, dayTo);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_RIGHT);
			Library.Interaction.writeKeyboard(robo, monthTo);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_RIGHT);
			Library.Interaction.writeKeyboard(robo, yearTo);
			log.info("User clicked on Search button");
			System.out.println("User clicked on Search button");
 			s.find(Search);
			s.click();
			Thread.sleep(3000);
			log.info("User clicked on export excel button");
			System.out.println("User clicked on export excel button");
			s.find(Excel);
			s.click();
			Thread.sleep(1000);
			s.find(FileName);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_A);
			robo.keyRelease(KeyEvent.VK_A);
			robo.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			Library.Interaction.writeKeyboard(robo, excelFileName);
			System.out.println("User entered excel sheet name");
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_ENTER);
			
		} catch (Exception e) {
			driver.close();
			e.printStackTrace();
			Assert.assertFalse(false);
		}

	}

}
