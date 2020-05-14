package com.cosac.TestCases;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.cosac.PageObject.Library;
import com.cosac.PageObject.LoginPage;

public class COS43_Bailiffcollector extends LoginPage {

	
	
	public static Screen s;
	public static Robot r;
	
static String accountdetailbut="./target/accountdetailsbut.png";
static String bailiff="./target/bailifftab.png";
static String actioncode="./target/actioncode.png";
static String saveicon="./target/saveicon.png";
static String accountstabbailiff="./target/accountstabbailiff.png";
static String custarrow="./target/rightarrow.png";
static String accounttab="./target/accounttab.png";
static String searchicon="./target/searchicon.png";
static String followup="./target/followup";
	
	@Test
	public static void verifybailiff() throws Exception{
	
		s=new Screen();
		r=new Robot();
		
		
		
		r.keyPress(KeyEvent.VK_ALT);
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_R);
		Thread.sleep(500);
		r.keyRelease(KeyEvent.VK_R);
		Thread.sleep(500);
		log.info("User selected credit tab");
		r.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_B);
		r.keyRelease(KeyEvent.VK_B);
		log.info("User selected bailiff review option");
		
		
		Thread.sleep(6000);
		
		r.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_TAB);
	
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_DOWN);
		
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_DOWN);
	
		Thread.sleep(500);				
		log.info("User selected Employee type");
		r.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(500);	
		r.keyPress(KeyEvent.VK_DOWN);
		
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);	
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);	
		log.info("User selected bailiff collector");
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);	
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);	
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		log.info("User clicked search icon");
		
		Thread.sleep(8000);
		
		s.find(accountdetailbut);
		Thread.sleep(1000);	
		
		s.click();
		log.info("User clicked on account details");
		Thread.sleep(10000);
		
		
		r.mouseMove(575, 221);
        Thread.sleep(2000);
        
        r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        
        r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        
		log.info("User clicked on bailiff review tab");
		Thread.sleep(12000);
		
		
		r.mouseMove(625, 493);
        Thread.sleep(200);
        
        r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        
        r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        
		
	
		log.info("USer cliked on accounts tab for account number");
		Thread.sleep(5000);
		
		s.find(custarrow);
		Thread.sleep(500);
		s.mouseMove();
		s.click();
		Thread.sleep(500);
		Thread.sleep(1000);
		


		
		
		r.keyPress(KeyEvent.VK_RIGHT);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_RIGHT);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_RIGHT);
        Thread.sleep(500);
        
        r.keyPress(KeyEvent.VK_LEFT);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_LEFT);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_LEFT);
        Thread.sleep(500);
        
        r.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_C);
        r.keyRelease(KeyEvent.VK_C);
        r.keyRelease(KeyEvent.VK_CONTROL);
        
        log.info("User copied the account number");
        
        
        
        Thread.sleep(5000);
        s.find(actioncode);
		Thread.sleep(1000);
		
		s.click();
	
        Thread.sleep(3000);

        
		
		log.info("USer selected  action code");
		
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		Library.Interaction.keyboardString("commentingisdone");
		Thread.sleep(4000);
		log.info("User done with action code and commented ");
		
		s.find(saveicon);
		Thread.sleep(500);
		
		s.click();
		log.info("User cliecked on save icon");
		
	
		Thread.sleep(12000);
		r.mouseMove(475, 221);
        Thread.sleep(2000);
        
        r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        
        r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        
        log.info("User clicked on main menu");
        Thread.sleep(2000);
        
        r.keyPress(KeyEvent.VK_ALT);
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_A);
		Thread.sleep(500);
		r.keyRelease(KeyEvent.VK_A);
		Thread.sleep(500);
		log.info("User selected Account tab");
		r.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		log.info("User selected Account search option");
		
		Thread.sleep(5000);
		
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		 r.keyPress(KeyEvent.VK_CONTROL);
	        Thread.sleep(500);
	        r.keyPress(KeyEvent.VK_V);
	        r.keyRelease(KeyEvent.VK_V);
	        r.keyRelease(KeyEvent.VK_CONTROL);
	        Thread.sleep(4000);
	        log.info("USer entered the customer account number");
	        
	        s.find(searchicon);	        
	        Thread.sleep(1000);
	       s.mouseMove();
	       
	       s.click();
	       log.info("USer clicked on search icon");
	       Thread.sleep(8000);	
	       
	       s.find(followup);
	       Thread.sleep(1000);
	       s.mouseMove();
	       Thread.sleep(2000);
	       s.click();
	       
	       Thread.sleep(4000);
			r.mouseMove(1285, 472);
	        Thread.sleep(2000);
	        
	        r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	        
	        r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			log.info("User clicked on follow up option for verification");
	}
	
}
