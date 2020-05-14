package com.cosac.TestCases;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.cosac.PageObject.LoginPage;

public class COS111_FinacialinterefaceReport extends LoginPage {
	
	public String Reports = System.getProperty("user.dir") + "\\target\\COS28_COS89_COS111\\Reports.PNG";
	public String Interface = System.getProperty("user.dir") + "\\target\\COS28_COS89_COS111\\interface.PNG";
	public String value = System.getProperty("user.dir") + "\\target\\COS28_COS89_COS111\\value.PNG";
	
	
	@Test
	public void Client() throws Throwable {
		try {
			Screen s = new Screen();
			Robot robo = new Robot();
			Thread.sleep(7000);
			s.find(Reports);
			s.click();
			log.info("User clicked on Reports successfully");
			robo.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_ENTER);
			log.info("User clicked on finacial interface reports ");
			Thread.sleep(8000);
			s.find(Interface);
			s.click();
			log.info("User clicked on interface reports ");
			log.info("Summary update interface reports is shown");
			Thread.sleep(15000);
			s.find(value);
			s.click();
			log.info("User right clicked on  Summary update Deatails");
			Thread.sleep(45000);
			 robo.mousePress(InputEvent.BUTTON3_MASK);
		        robo.mouseRelease(InputEvent.BUTTON3_MASK);
		        robo.delay(200);
				Thread.sleep(3000);
				robo.keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(1000);
				robo.keyPress(KeyEvent.VK_ENTER);
				log.info("User clicked on Download BTN");
				
				
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
