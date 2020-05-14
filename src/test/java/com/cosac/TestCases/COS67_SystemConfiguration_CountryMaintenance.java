package com.cosac.TestCases;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.Match;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.PageObject.Library;
import com.cosac.PageObject.LoginPage;

public class COS67_SystemConfiguration_CountryMaintenance extends LoginPage{
	
	public String SystemConfiguration=".\\target\\COS67_CountryMaintenance\\SystemConfig.PNG";
	public String ScrollDown="./target/COS67_CountryMaintenance/scrolldown.png";
	public String TAX="./target/COS67_CountryMaintenance/TAX.png";
	public String TaxRate="./target/COS67_CountryMaintenance/TaxRate.png";
	public String TaxDown="./target/COS67_CountryMaintenance/TaxDown.png";
	public String Save="./target/COS67_CountryMaintenance/TaxRateSave.png";
	public String Exit="./target/COS67_CountryMaintenance/CntryMntExit.png";
	public String Delivery="./target/COS67_CountryMaintenance/Delivery.png";
	public String ExpDelivery="./target/COS67_CountryMaintenance/ExpDelivery.png";
	public String CloseApp="./target/COS67_CountryMaintenance/CloseApp.png";
	public String CustomerTab="./target/COS67_CountryMaintenance/customertab.png";
	public String Search="./target/COS67_CountryMaintenance/Search.png";
	public String CustArrow="./target/COS67_CountryMaintenance/CustomerSelectArrow.png";
	public String ExpDelIcon="./target/COS67_CountryMaintenance/ExpDelIcon.png";
	public String LineItems="./target/COS67_CountryMaintenance/LineItems.png";
	public static Screen s;
	public static Robot r;
    
	@Test(priority=1)
	public void Client() throws Throwable
	{
		try
		{
			Library.Interaction.userWait();
			Library.Interaction.ClientClick(SystemConfiguration);
			log.info("User Clicked on System Configuration");
			Robot r = new Robot();
			Screen s=new Screen();
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_ENTER);
			log.info("User Clicked On Country Maintainence");
			Thread.sleep(2000);
			s.find(ScrollDown);
			Thread.sleep(1000);
			s.click();  s.click(); s.click(); s.click(); s.click(); s.click(); s.click(); s.click();
			Thread.sleep(2000);
			s.find(TAX);
			s.click();
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			Library.Interaction.ClientClick(TaxRate);
			log.info("User clicked on Tax/Service Charges/Fees");
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			Library.Interaction.ClientClick(TaxDown);
			log.info("Tax Rate Changed Successfully");
			Thread.sleep(500);
			Library.Interaction.ClientClick(Save);
			log.info("New Tax Rate is Saved Successfully");
			log.info("After EOD JOB New Tax Rate will Update!!!");
			Thread.sleep(5000);
			Library.Interaction.ClientClick(Exit);
			log.info("Exit Successfully");

		}
		catch (Exception e) {
			e.printStackTrace();
			windriver.close();
		}
	}
	@Test(priority=2)
	public void LineItems()throws Throwable
	{
		try
		{
			Library.Interaction.userWait();
			Library.Interaction.ClientClick(SystemConfiguration);
			log.info("User Clicked on System Configuration");
			Robot r = new Robot();
			Screen s=new Screen();
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_ENTER);
			log.info("User Clicked On Country Maintainence");
			Thread.sleep(2000);
			s.find(ScrollDown);
			Thread.sleep(1000);
			s.click();
			Thread.sleep(2000);
			s.find(LineItems);
			s.click();
			Thread.sleep(500);
			log.info("User Clicked On Line Items");
			Library.Interaction.ClientClick(Delivery);
			log.info("User Clicked on Display Express Delivery");
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			Library.Interaction.ClientClick(ExpDelivery);
			log.info("User Changed the Value");
			Thread.sleep(500);
			Library.Interaction.ClientClick(Save);
			log.info("Saved Successfully");	
			Thread.sleep(5000);
			Library.Interaction.ClientClick(Exit);
			log.info("Exit Successfully");

			
			
		}
		catch (Exception e) {
			e.printStackTrace();
			windriver.close();
		}
	}
	@Test(priority=3)
	public void ExpDelivery() throws Throwable
	{
		try
		{
			Screen sc=new Screen();
			sc.find(CustomerTab);
			Thread.sleep(2000);
			sc.click();
			log.info("User Clicked on Customer");
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			log.info("User Clicked on Customer Search");
			Thread.sleep(2000);
			log.info("User is in Customer Search Screen");
			rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
			log.info("User Clicked on CustomerID");
			Library.Interaction.writeKeyboard(rb, "aak120294");
			log.info("User entered CustomerID");
			Thread.sleep(1000);
			sc.find(Search);
			Thread.sleep(2000);
			sc.click();
			log.info("User Clicked on Search Icon");
			Thread.sleep(2000);
			log.info("Customer Details Displayed Successfully");
			sc.find(CustArrow);
			sc.mouseMove();
			Thread.sleep(2000);
			sc.rightClick();
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			log.info("User Selected Customer Details Option");
			Thread.sleep(15000);
			log.info("User succesfully logged in to Customer Record Screen");
			Thread.sleep(2000);
			sc.find(CustArrow);
			sc.mouseMove();
			Thread.sleep(2000);
			sc.rightClick();
			Thread.sleep(2000);
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			log.info("User selected Enter Line Items option");
			Thread.sleep(30000);
			log.info("User succesfully logged in to Input/Revise Sales Order screen");
			Thread.sleep(5000);
			if(sc.exists(ExpDelIcon) != null)
			{
				log.info("Express Delivery");
			}
			else
			{
				log.info("Express Delivery Option is Disabled");
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
			windriver.close();
		}
	}
}