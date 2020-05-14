package com.cosac.TestCases;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.PageObject.Library;
import com.cosac.PageObject.LoginPage;

public class COS108_SummaryUpdateControlReport extends LoginPage {
	public String Reports = ".\\target\\COS30_CreditSaction\\Reports.png";
	public String FindButton = ".\\target\\COS30_CreditSaction\\FindButton.png";
	public static String firstBatchNo = "5500";
	public static String lastBatchNo = "5600";
	public String SelectRow = ".\\target\\COS30_CreditSaction\\SelectRow.png";
	public String BranchFiguresBTN = ".\\target\\COS30_CreditSaction\\BranchFiguresBTN.png";
	public static String BranchTotals = ".\\target\\COS30_CreditSaction\\BranchTotals.png";
	public static String CompanyTotals = ".\\target\\COS30_CreditSaction\\CompanyTotals.png";
	public static String Excel = ".\\target\\COS30_CreditSaction\\Excel.png";
	public static String excelFileName = "filetest1";
	public static String excelFileName1 = "filetest22";
	public static String CloseTab = ".\\target\\COS30_CreditSaction\\CloseTab.png";
	public static String FileName = ".\\target\\COS30_CreditSaction\\Filename.png";
	LoginPage login = new LoginPage();
	Robot robo;

	// Verifying Reports--> Summary Update Control Report
	@Test
	public void Client_COS108() throws Throwable {

		try {
			login.LoginCosacClient();
			Thread.sleep(13000);
			Screen s = new Screen();
			s.find(Reports);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			log.info("User clicked on Reports menu");
			Thread.sleep(2000);
			Robot robo = new Robot();
			robo.keyPress(KeyEvent.VK_UP);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_UP);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_UP);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_UP);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_ENTER);
			log.info("User clicked on Summary Update Control Report");
			Thread.sleep(4000);
			s.find(FindButton);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_A);
			robo.keyRelease(KeyEvent.VK_A);
			Thread.sleep(1000);
			robo.keyRelease(KeyEvent.VK_CONTROL);
			Library.Interaction.writeKeyboard(robo, firstBatchNo);
			log.info("User entered firstBatchNo");
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_A);
			robo.keyRelease(KeyEvent.VK_A);
			Thread.sleep(1000);
			robo.keyRelease(KeyEvent.VK_CONTROL);
			Library.Interaction.writeKeyboard(robo, lastBatchNo);
			log.info("User entered lastBatchNo");
			s.find(FindButton);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			log.info("User clicked on Find button");
			Thread.sleep(2000);
			s.find(SelectRow);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			log.info("user selected row");
			s.find(BranchFiguresBTN).click();
			log.info("User clicked on BranchFigures button");
			Thread.sleep(2000);
			s.find(SelectRow);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			log.info("user selected row");
			s.find(BranchTotals);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			log.info("user clicked on Branch Totals");
			s.find(Excel);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			System.out.println("User clicked on export excel button");
			s.find(Excel);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(3000);
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
			System.out.println("1st");
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_ENTER);
			System.out.println("2nd");
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_ENTER);
			System.out.println("3rd");
			Thread.sleep(2000);
			s.find(CloseTab);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(3000);
			s.find(CompanyTotals);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			s.find(Excel);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			System.out.println("User clicked on export excel button");
			s.find(Excel);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			s.find(FileName);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_A);
			robo.keyRelease(KeyEvent.VK_A);
			robo.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			Library.Interaction.writeKeyboard(robo, excelFileName1);
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
