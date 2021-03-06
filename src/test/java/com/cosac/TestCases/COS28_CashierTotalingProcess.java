package com.cosac.TestCases;

import org.testng.annotations.Test;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.cosac.Locators.Id;
import com.cosac.Locators.Name;
import com.cosac.PageObject.Library;
import com.cosac.PageObject.LoginPage;

public class COS28_CashierTotalingProcess extends LoginPage {

	public String CustomerMenu = System.getProperty("user.dir") + "\\target\\COS28_COS89_COS111\\customer.PNG";
	public String SearchBTN = System.getProperty("user.dir") + "\\target\\SearchBTN.PNG";
	public String AccountNoBar = System.getProperty("user.dir") + "\\target\\AccountNoBar.png";
	public String CloseTab = System.getProperty("user.dir") + "\\target\\CloseTab.png";
	public String Transaction = System.getProperty("user.dir") + "\\target\\Transaction.png";
	public String PaymentCustID = System.getProperty("user.dir") + "\\target\\PaymentCustID.png";
	public String PaymentAmount = System.getProperty("user.dir") + "\\target\\paymentamount.png";
	public String Load = System.getProperty("user.dir") + "\\target\\Load.PNG";
	public String SaveIcon = System.getProperty("user.dir") + "\\target\\SaveIcon.png";
	public String Name = System.getProperty("user.dir") + "\\target\\Name.PNG";
	public String TestBoss = System.getProperty("user.dir") + "\\target\\TestBoss.PNG";
	public String cash = System.getProperty("user.dir") + "\\target\\cash.PNG";
	public String saveAmount = System.getProperty("user.dir") + "\\target\\saveAmount.PNG";
	
	
	String Amount="10";
	String paidAmount="5";
	String Comment="Done";
	String Reference="hebbalrefnce";

	@Test
	public void Client() throws Throwable {
		try {
			Screen s = new Screen();
			Thread.sleep(1000);
			/*s.find(CustomerMenu);
			s.click();*/
			Robot robo = new Robot();
			robo.keyPress(KeyEvent.VK_ALT);
			robo.keyPress(KeyEvent.VK_C);
			robo.keyRelease(KeyEvent.VK_C);
			robo.keyRelease(KeyEvent.VK_ALT);
			Thread.sleep(1000);
			log.info("User clicked on Customermenu successfully");
			//robo.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_ENTER);
			log.info("User Selected Search Customer");
			Thread.sleep(8000);
			s.find(SearchBTN);
			s.click();
			log.info("User clicked on SearchBTN");
			Thread.sleep(10000);
			s.find(AccountNoBar);
			s.mouseMove();
			Thread.sleep(2000);
			s.click();
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(100);
			robo.keyPress(KeyEvent.VK_C);
			Thread.sleep(100);
			robo.keyRelease(KeyEvent.VK_C);
			Thread.sleep(100);
			robo.keyRelease(KeyEvent.VK_CONTROL);
			log.info("User Copied the account No successfully");
			Thread.sleep(1000);
			s.find(CloseTab);
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_ALT);
			robo.keyPress(KeyEvent.VK_T);
			robo.keyRelease(KeyEvent.VK_T);
			robo.keyRelease(KeyEvent.VK_ALT);
			
			log.info("User clicked on Transaction successfully");
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_ENTER);
			log.info("User clicked on payment successfully");
			Thread.sleep(25000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_V);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_V);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			log.info("User pasted the account No successfully");
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			s.find(PaymentCustID);
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			Thread.sleep(25000);
			s.find(PaymentAmount);
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_A);
			Thread.sleep(1000);
			robo.keyRelease(KeyEvent.VK_A);
			robo.keyRelease(KeyEvent.VK_BACK_SPACE);
			Thread.sleep(1000);
			robo.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			Library.Interaction.writeKeyboard(robo, Amount);
			Thread.sleep(1000);
			log.info("User entered the Amount successfully");
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(10000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(7000);
			s.find(CloseTab);
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			log.info("User clicked on CloseBTN successfully");
			Thread.sleep(2000);
			s.find(Transaction);
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			log.info("User clicked on Transaction successfully");
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(20000);
			s.find(Load);
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			Thread.sleep(15000);
			log.info("User clicked on LoadBTN");
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(100);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(100);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(100);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(100);
			Library.Interaction.writeKeyboard(robo, paidAmount);
			Thread.sleep(100);
			s.find(SaveIcon);
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			log.info("User clicked on saveBTN successfully");
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
//			driver.findElementById(Id.LoginPage.userName).sendKeys(windowsuserName);
			Thread.sleep(1000);
			log.info("User Entered the UserName To Authorize");
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
//			driver.findElementById(Id.LoginPage.passWord).sendKeys(WindowspassWord);
			log.info("User Entered the password To Authorize");
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_ENTER);
			log.info("User clicked on AuthorizeBTN successfully");
			Thread.sleep(5000);
			// robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			Library.Interaction.writeKeyboard(robo, paidAmount);
			Thread.sleep(100);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(100);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(100);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(100);
			Library.Interaction.writeKeyboard(robo, Comment);
			log.info("User Entered the comment");
			Thread.sleep(1000);
			s.find(SaveIcon);
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			log.info("User clicked on saveBTN successfully");
			Thread.sleep(8000);
			robo.keyPress(KeyEvent.VK_ESCAPE);
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_ESCAPE);
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_ESCAPE);
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_ESCAPE);
			Thread.sleep(20000);
			Thread.sleep(1000);
			s.find(Name);
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			Thread.sleep(10000);
			s.find(Name);
			Thread.sleep(1000);
			s.click();
			Thread.sleep(3000);
			s.find(TestBoss);
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			Thread.sleep(10000);
			robo.keyPress(KeyEvent.VK_RIGHT);
			Thread.sleep(2000);	
			robo.keyPress(KeyEvent.VK_CONTROL);
			 Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_C);
			 Thread.sleep(500);
			robo.keyRelease(KeyEvent.VK_C);
			 Thread.sleep(500);
			robo.keyRelease(KeyEvent.VK_CONTROL);	
			Thread.sleep(1000);
			s.find(cash);
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_RIGHT);
			Thread.sleep(200);
			robo.keyPress(KeyEvent.VK_RIGHT);
			Thread.sleep(1000);
			  robo.keyPress(KeyEvent.VK_CONTROL);
			  Thread.sleep(1000);
			  robo.keyPress(KeyEvent.VK_V);
			  Thread.sleep(1000);
			  robo.keyRelease(KeyEvent.VK_V);
			  Thread.sleep(1000);
			  robo.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_RIGHT);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_RIGHT);
			Thread.sleep(1000);
			Library.Interaction.writeKeyboard(robo, Reference);
			Thread.sleep(1000);
			s.find(saveAmount);
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			Thread.sleep(15000);
			log.info("cashier paid amount to maincashier successfully");
			Thread.sleep(5000);
			

		} catch (Exception e) {
			e.printStackTrace();
			driver.close();
		}
	}

}
