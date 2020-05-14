package com.cosac.TestCases;

import static org.testng.Assert.assertEquals;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.Library;
import com.cosac.PageObject.LoginPage;

import junit.framework.Assert;

public class COS34_GoodsReturn extends LoginPage {
	public static String Customer = ".\\target\\COS30_CreditSaction\\Customer.png";
	public static String Collection = ".\\target\\COS30_CreditSaction\\DropDown.png";
	public static String Reason = ".\\target\\COS30_CreditSaction\\Reason.png";
	public static String SelectRow = ".\\target\\COS30_CreditSaction\\SelectRow.png";
	public static String save = ".\\target\\COS30_CreditSaction\\save.png";
	public static String accNo = "910443655700";
	public static String Notes = ".\\target\\COS30_CreditSaction\\Notes.png";
	public static String PlusBTN = ".\\target\\COS30_CreditSaction\\PlusBTN.png";
	public static String branchCode = "171";
	public static String branchName = "171 LUCKY DOLLAR MAY PEN";
	public static String CollectionValue = "e";
	public static String ReasonValue = "d";
	LoginPage login = new LoginPage();

	// Verifying Customer--> Goods Return
	@Test
	public void COS34() throws Throwable {

		try {
			
			login.LoginCosacClient();
			Thread.sleep(13000);
			log.info("Client Application Steps");
			Screen s = new Screen();
			s.find(Customer);
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			log.info("user clicked on Customer");
			Robot robo = new Robot();
			robo.keyPress(KeyEvent.VK_SHIFT);
			robo.keyPress(KeyEvent.VK_G);
			robo.keyRelease(KeyEvent.VK_G);
			robo.keyRelease(KeyEvent.VK_SHIFT);
			log.info("user clicked on Goods Return");
			Thread.sleep(5000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			// please remove hypens and enter account number
			Library.Interaction.writeKeyboard(robo, accNo);
			log.info("User entered account number");
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			log.info("user clicked on search");
			Thread.sleep(1000);
			s.find(Collection);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(2000);
			log.info("user clicked on Collection");
			Library.Interaction.writeKeyboard(robo, CollectionValue);
			log.info("user selected exchange");
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(500);
			s.find(Reason);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(1000);
			log.info("user clicked on Reason");
			Library.Interaction.writeKeyboard(robo, ReasonValue);
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(500);
			log.info("user selected damaged goods");
			Thread.sleep(2000);
			s.find(SelectRow);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			log.info("User Selected Row");
			Thread.sleep(1000);
			s.find(Notes);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Library.Interaction.writeKeyboard(robo, "Faultygoods");
			log.info("User entered notes");
			Thread.sleep(3000);
			s.find(PlusBTN);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(6000);
			log.info("User clicked on plus icon");
			s.find(save);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			log.info("User clicked on save");
			Thread.sleep(7000);

		// Web application starts
			
			Thread.sleep(5000);
			login.LoginCosacWeb();
			Library.Interaction.click(Xpath.CustomerPickUp.logistics);
			Thread.sleep(2000);
			log.info("Web Application Steps");
			log.info("user clicked on logistics");
			Library.Interaction.click(Xpath.CustomerPickUp.customerPickup);
			Thread.sleep(3000);
			log.info("user clicked on customerPickup");
			Library.Interaction.selectEle(Xpath.CustomerPickUp.ArrowdeliveryBranch,
			Xpath.CustomerPickUp.SearchdeliveryBranch, Xpath.CustomerPickUp.SelectdeliveryBranch, branchCode,branchName);
			Thread.sleep(4000);
			log.info("user selected branch code and name");
			Thread.sleep(4000);
			Library.Interaction.click(Xpath.CustomerPickUp.printReturn);
			Thread.sleep(4000);
			log.info("user clicked on printReturn");
			Library.Interaction.click(Xpath.CustomerPickUp.newPickUpLink);
			Thread.sleep(4000);
			log.info("user clicked on newPickUpLink link");
			Thread.sleep(4000);
			Library.Interaction.switchToNewWindow();
			log.info("user swiched to new window");
			WebElement text = driver.findElement(By.xpath(Xpath.CustomerPickUp.ReturnNote));
			Thread.sleep(2000);
			String Printnote = text.getText();
			System.out.println(text);
			String Id = Printnote.substring(13, 20);
			System.out.println(Id);
			log.info("user captured the id and saved in id variable");
			Thread.sleep(2000);
			driver.close();
			log.info(" window is closed after collecting ID");
			Library.Interaction.switchToParentWindow();
			Thread.sleep(3000);
			log.info("Switched to Parent window");
			Library.Interaction.click(Xpath.CustomerPickUp.okBTN);
			Thread.sleep(3000);
			log.info("user clicked on OK button");
			Library.Interaction.click(Xpath.CustomerPickUp.confirmpickUpNote);
			Thread.sleep(5000);
			log.info("user clicked on confirmpickUpNote");
			Library.Interaction.click(Xpath.CustomerPickUp.logistics);
			Thread.sleep(2000);
			log.info("user clicked on logistics");
			Library.Interaction.click(Xpath.CustomerPickUp.searchShipment);
			Thread.sleep(2000);
			log.info("clicked on searchShipment");
			Library.Interaction.setTextBoxByXpath(Xpath.CustomerPickUp.search, Id);
			Thread.sleep(2000);
			log.info("Searched id");
			WebElement status = driver.findElement(By.xpath(Xpath.CustomerPickUp.status));
			Thread.sleep(1000);
			log.info("user checked the status");
			String Expected = "Collected";
			String Actual = status.getText();
			System.out.println(Actual);
			log.info("User captued the status");
			Assert.assertEquals(Expected, Actual);

		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertFalse(false);
		}

	}
}
