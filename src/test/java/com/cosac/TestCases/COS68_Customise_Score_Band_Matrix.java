
package com.cosac.TestCases;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.cosac.PageObject.Library;
import com.cosac.PageObject.LoginPage;

public class COS68_Customise_Score_Band_Matrix extends LoginPage {
	
	
	
	public String System_Configuration=".\\target\\COS42_68_69_70_106_107\\System-Configuration.PNG";
	public String E=".\\target\\COS42_68_69_70_106_107\\E.PNG";
	public String StarSymbol=".\\target\\COS42_68_69_70_106_107\\StarSymbol.png";
	
    String E_Value="400";
	String F_Character="F";
	String F_Value="0";
	String Value1="399";
	String Value2="35";
	
    @Test
	public void ScoreBandMatrix() throws Throwable {
		
		try {
			
			
		    Thread.sleep(5000);
			Screen s=new Screen();
			s.find(System_Configuration);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Library.Interaction.print("User clicked on System_Configuration");
			Thread.sleep(5000);
			Robot robo1=new Robot();
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			Library.Interaction.print("User clicked on Scoring");
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(3000);
			Library.Interaction.print("User clicked on Customise Score Rules");
			s.find(E);
			s.mouseMove();
			Thread.sleep(300);
			s.click();
			Thread.sleep(2000);
			Library.Interaction.print("User clicked on E Alphabect");
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			Library.Interaction.writeKeyboard(robo1, E_Value);
			Thread.sleep(2000);
			Library.Interaction.print("User Entered E Value");
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_CONTROL); 
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_A); 
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_A); 
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_CONTROL);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_CONTROL); 
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_C); 
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_C); 
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_CONTROL);
			Library.Interaction.print("User Copy the E Value");
			Library.Interaction.userWait();
			String E_Value=Library.Interaction.captureText();
			Library.Interaction.print("E Value is:"+E_Value);
            s.find(StarSymbol);
			s.mouseMove();
			Thread.sleep(300);
			s.click();
			Thread.sleep(2000);
			Library.Interaction.print("User clicked on StarSymbol(*)");
			Thread.sleep(2000);
			Library.Interaction.writeKeyboard(robo1, F_Character);
			Thread.sleep(2000);
			Library.Interaction.print("User Entered F Character");
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_CONTROL); 
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_A); 
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_A); 
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_CONTROL);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_CONTROL); 
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_C); 
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_C); 
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_CONTROL);
			Library.Interaction.print("User Copy the F Character");
			Library.Interaction.userWait();
			String F_Character=Library.Interaction.captureText();
			Library.Interaction.print("F Character is:"+F_Character);
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			Library.Interaction.writeKeyboard(robo1, F_Value);
			Thread.sleep(2000);
			Library.Interaction.print("User Entered F Value");
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_CONTROL); 
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_A); 
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_A); 
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_CONTROL);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_CONTROL); 
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_C); 
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_C); 
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_CONTROL);
			Library.Interaction.print("User Copy the E Value");
			Library.Interaction.userWait();
			String F_Value=Library.Interaction.captureText();
			Library.Interaction.print("F Value is:"+F_Value);
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			Library.Interaction.writeKeyboard(robo1, Value1);
			Thread.sleep(2000);
			Library.Interaction.print("User Entered Value1");
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			Library.Interaction.writeKeyboard(robo1, Value2);
			Thread.sleep(2000);
			Library.Interaction.print("User Entered Value2");
			Thread.sleep(5000);
			robo1.keyPress(KeyEvent.VK_ALT); 
			robo1.keyPress(KeyEvent.VK_SPACE);
			robo1.keyPress(KeyEvent.VK_C); 
			robo1.keyRelease(KeyEvent.VK_C);
			robo1.keyRelease(KeyEvent.VK_SPACE); 
			robo1.keyRelease(KeyEvent.VK_ALT);
			Library.Interaction.print("User clicked on Close Window"); 


		} catch (Exception e) {
			e.printStackTrace();
			
			driver.close();
		}

		
	}
}
