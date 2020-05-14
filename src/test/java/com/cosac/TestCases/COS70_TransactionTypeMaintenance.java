package com.cosac.TestCases;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.cosac.PageObject.Library;
import com.cosac.PageObject.LoginPage;

public class COS70_TransactionTypeMaintenance extends LoginPage {


	String TransTypeCode = "136";
	String Description = "TransactionType";
	String AccountNumber="640415058310";

	public String System_Configuration = ".\\target\\COS42_68_69_70_106_107\\System-Configuration.PNG";
	public String IncludeInGeneralFinancialTransactions=".\\target\\COS42_68_69_70_106_107\\IncludeInGeneralFinancialTransactions.PNG";
	public String AllocateBranch=".\\target\\COS42_68_69_70_106_107\\AllocateBranch.PNG";
	public String ReferenceNoAsMandatory=".\\target\\COS42_68_69_70_106_107\\ReferenceNoAsMandatory.PNG";
	public String IncludeAsDepositTransaction=".\\target\\COS42_68_69_70_106_107\\IncludeAsDepositTransaction.PNG";
	public String SaveButton=".\\target\\COS42_68_69_70_106_107\\SaveButton.PNG";
	public String Codes = ".\\target\\COS42_68_69_70_106_107\\Codes.PNG";
	public String Customer = ".\\target\\COS42_68_69_70_106_107\\Customer.PNG";
	public String Close = ".\\target\\COS42_68_69_70_106_107\\Close.PNG";
	public String Search = ".\\target\\COS42_68_69_70_106_107\\Search.PNG";
	public String Play = ".\\target\\COS42_68_69_70_106_107\\Play.PNG";
	public String Main = ".\\target\\COS42_68_69_70_106_107\\Main.PNG";
	public String Transactions = ".\\target\\COS42_68_69_70_106_107\\Transactions.PNG";
	public String GeneralFinancialTransaction = ".\\target\\COS42_68_69_70_106_107\\GeneralFinancialTransactions.PNG";
	public String TransactionDropDown = ".\\target\\COS42_68_69_70_106_107\\TransactionDropdown.PNG";



	@Test
	public void TransactionType() throws Throwable {
		try {

			Screen s = new Screen();
			Thread.sleep(5000);
			s.find(System_Configuration);
			s.click();
			Thread.sleep(3000);
			Library.Interaction.print("User Clicked on System Configuration Option");
			Robot robo1 = new Robot();
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
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			Library.Interaction.print("User Clicked on TransactionTypeMaintenance Option");
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			Library.Interaction.writeKeyboard(robo1, TransTypeCode);
			Thread.sleep(3000);
			Library.Interaction.print("User Entered Transaction Type Code");
			Library.Interaction.userWait();			
			robo1.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_A);
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_A);
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(3000);
			robo1.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_C);
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_C);
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(3000);
			String TransTypeCode=Library.Interaction.captureText();
			Library.Interaction.print("Transaction Type Code is:"+TransTypeCode);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			Library.Interaction.writeKeyboard(robo1, Description);
			Thread.sleep(3000);
			Library.Interaction.print("User Entered Description");
			robo1.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_A);
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_A);
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(3000);
			robo1.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_C);
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_C);
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(3000);
			String Description=Library.Interaction.captureText();
			Library.Interaction.print("Description is:"+Description);
			s.find(IncludeInGeneralFinancialTransactions); 
			s.mouseMove();
			Thread.sleep(300); 
			s.click(); 
			Thread.sleep(2000); 
			Library.Interaction.print("User Un Checked Include InGeneral Financial Transactions");
			s.find(AllocateBranch);
			s.mouseMove();
			Thread.sleep(300); 
			s.click(); 
			Thread.sleep(3000);
			Library.Interaction.print("User Un Checked AllocateBranch");
			Thread.sleep(3000);
			s.find(ReferenceNoAsMandatory); 
			s.mouseMove(); 
			Thread.sleep(500); 
			s.click();
			Thread.sleep(2000); 
			Library.Interaction.print("User Un Checked ReferenceNoAsMandatory");
			Library.Interaction.userWait();

			/*
			 * s.find(IncludeAsDepositTransaction); s.mouseMove(); Thread.sleep(300);
			 * s.click(); Thread.sleep(2000);
			 */
			/*
			 * robo1.keyPress(KeyEvent.VK_DOWN);
			 * 
			 * Thread.sleep(500); robo1.keyPress(KeyEvent.VK_DOWN); Thread.sleep(500);
			 * robo1.keyPress(KeyEvent.VK_ENTER);
			 */

			s.find(SaveButton); 
			s.mouseMove(); 
			Thread.sleep(300);
			s.click();
			Thread.sleep(3000); 
			Library.Interaction.print("User Clicked on Save Button");      
			s.find(Close); 
			s.mouseMove(); 
			Thread.sleep(500);
			s.click();
			Thread.sleep(5000); 
			Library.Interaction.print("User Clicked on Close Button");
			s.find(Customer); 
			s.mouseMove(); 
			Thread.sleep(300);
			s.click();
			Thread.sleep(5000); 
			Library.Interaction.print("User Clicked on Save Button");
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			Library.Interaction.print("User Clicked on Customer Search");
			Library.Interaction.userWait();
			s.find(Search); 
			s.mouseMove(); 
			Thread.sleep(300);
			s.click();
			Thread.sleep(30000); 
			Library.Interaction.print("User Clicked on Search Button");
			s.find(Play); 
			s.mouseMove(); 
			Thread.sleep(300);
			s.click();
			Thread.sleep(3000); 
			Library.Interaction.print("User Clicked on Search Button");
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_CONTROL); 
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_C); 
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_C); 
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_CONTROL);
			Library.Interaction.print("User Copy the Account Number");
			Library.Interaction.userWait();
			String AccountNumber=Library.Interaction.captureText();
			System.out.println(AccountNumber);
			Thread.sleep(2000);
			s.find(Main); 
			s.mouseMove(); 
			Thread.sleep(500);
			s.click();
			Thread.sleep(3000); 
			Library.Interaction.print("User Clicked on Main Option");
			s.find(Transactions); 
			s.mouseMove(); 
			Thread.sleep(500);
			s.click();
			Thread.sleep(3000); 
			Library.Interaction.print("User Clicked on Transactions Option");
			robo1.keyPress(KeyEvent.VK_UP); 
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_UP); 
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_UP); 
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_UP); 
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(5000); 
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			Library.Interaction.writeKeyboard(robo1, AccountNumber);
			Library.Interaction.print("User Entered Account Number");
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_CONTROL); 
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_C); 
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_C); 
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_CONTROL);
			Library.Interaction.print("User Copy the Account Number");
			Library.Interaction.userWait();
			String AccountNumber2=Library.Interaction.captureText();
			Library.Interaction.print("Copied Account number is:"+AccountNumber2);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(5000); 
			s.find(GeneralFinancialTransaction); 
			s.mouseMove(); 
			Thread.sleep(500);
			s.click();
			Library.Interaction.print("User Clicked on General Financial Transaction Option");
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			Library.Interaction.print("User Showing Trasaction Type In Dropdown");

		} catch (Exception e)
		{
			e.printStackTrace();
			driver.close();
		}
	}

}
