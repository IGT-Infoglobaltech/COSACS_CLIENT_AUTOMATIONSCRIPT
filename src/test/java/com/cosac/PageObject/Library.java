package com.cosac.PageObject;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.Assert;

import com.cosac.Locators.Xpath;

public class Library extends LoginPage


{
	public static class Interaction
	{
	//To Capture Screenshot
	protected static Logger log;
	
	public static void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	public static void writeKeyboard(Robot bot, String st) throws Throwable, Throwable {
	    String upperCase = st.toUpperCase();

	    for(int i = 0; i < upperCase.length(); i++) {
	        String letter = Character.toString(upperCase.charAt(i));
	        String code = "VK_" + letter;
	        

	        Field f = KeyEvent.class.getField(code);
	        int keyEvent = f.getInt(null);
	        //System.out.println(keyEvent);
	        bot.keyPress(keyEvent);
	        bot.keyRelease(keyEvent);
	    }
	}
	
	public static String copyText(Robot bot) throws Throwable, Throwable 
	{
		bot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(500);
		bot.keyPress(KeyEvent.VK_C);
		Thread.sleep(1000);
		bot.keyRelease(KeyEvent.VK_C);
		Thread.sleep(500);
		bot.keyRelease(KeyEvent.VK_CONTROL);
		Toolkit toolkit2 = Toolkit.getDefaultToolkit();
		Clipboard clipboard2 = toolkit2.getSystemClipboard();
		String result2 = (String) clipboard2.getData(DataFlavor.stringFlavor);
        return result2;

	}
	
	public static void writeKeyboardString(Robot bot, String st) throws Throwable, Throwable {
	    String upperCase = st.toUpperCase();
	   

	    for(int i = 0; i < upperCase.length(); i++) {
	        char Char = upperCase.charAt(i);
	        String letter = Character.toString(upperCase.charAt(i));
	        
	        if ((Char>='A' && Char<='Z')||(Char>='a' && Char<='z')||(Char>='0' && Char<='9')) {
	        	String code = "VK_" + letter;
		        

		        Field f = KeyEvent.class.getField(code);
		        int keyEvent = f.getInt(null);
		        //System.out.println(keyEvent);
		        bot.keyPress(keyEvent);
		        bot.keyRelease(keyEvent);
				
			}
	        else if(letter.equals("@")) {
	        	bot.keyPress(KeyEvent.VK_SHIFT);
	        	Thread.sleep(100);
	        	bot.keyPress(KeyEvent.VK_2);
	        	//Thread.sleep(500);
		        bot.keyRelease(KeyEvent.VK_2);
		        //Thread.sleep(500);
		        bot.keyRelease(KeyEvent.VK_SHIFT);
				
			}
	        else if(letter.equals(".")) {
	
	        	bot.keyPress(KeyEvent.VK_PERIOD);
	        	
				
			}
	        else if(letter.equals(" ")) {

	        	bot.keyPress(KeyEvent.VK_SPACE);
	      
				
			}
	        
	    }
	}
	public static void writeKeyboardSpecial(Robot bot, String st) throws Throwable, Throwable {
		char c;
		int d=st.length(),e=0,f=0;
		while (e<=d) {
			c=st.charAt(e);
			f=(int) c;
			bot.keyPress(KeyEvent.getExtendedKeyCodeForChar(f));
			//bot.keyRelease(KeyEvent.KEY_RELEASED);
			e++	;
			//Thread.sleep();
			
			
		}bot.keyRelease(KeyEvent.KEY_RELEASED);
		}
	
	// Send Data in Text Box by Xpath
	public static void setTextBoxByXpath(String xpath, String data) throws IOException
	{
		try
		{
		driver.findElement(By.xpath(xpath)).sendKeys(data);
		}
		catch (Exception e) 
		{
			captureScreen(driver, "setTextBoxByXpath");
            Assert.assertFalse(false);
            log.info("User not able to send data in Text Box 'Test Failed'");
		}
	}
	// Send Data in Text Box by Name
	public static void setTextBoxByName(String Name, String data) throws IOException
	{
		try
		{
		driver.findElement(By.name(Name)).sendKeys(data);
		}
		catch (Exception e) 
		{
			captureScreen(driver, "setTextBoxByName");
            Assert.assertFalse(false);
            log.info("User not able to send data in Text Box 'Test Failed'");
		}
	}
	
	// Send Data in Text Box by ID
		public static void setTextBoxByID(String id, String data) throws IOException
		{
			try
			{
			driver.findElement(By.id(id)).sendKeys(data);
			}
			catch (Exception e) 
			{
				captureScreen(driver, "setTextBoxByID");
	            Assert.assertFalse(false);
	            log.info("User not able to send data in Text Box 'Test Failed'");
			}
		}
	
	// Navigate Element
	public static void moveToElement(String xpath) throws IOException
	{
		try
		{
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath(xpath));
		act.moveToElement(ele).build().perform();
		}
		catch (Exception e) 
		{
			captureScreen(driver, "moveToElement");
            Assert.assertFalse(false);
            log.info("User not able to navigate to element 'Test Failed'");
		}
	}
	
	// Click to Element
	public static void clickByXpath(String xpath) throws IOException
	{   
		try {
			WebElement ele=driver.findElement(By.xpath(xpath));
			ele.click();
		    } 
		catch (Exception e) 
		{
			captureScreen(driver, "loginTest");
            Assert.assertFalse(false);
            log.info("User not able to Click to element 'Test Failed'");
		}
	}
	
	public static void clickByIDClient(String id) throws IOException
	{   
		try {
			WebElement ele=windriver.findElement(By.id(id));
			ele.click();
		    } 
		catch (Exception e) 
		{
			captureScreen(windriver, "clickByIDClient");
            Assert.assertFalse(false);
            log.info("User not able to Click to element 'Test Failed'");
		}
	}
	
	//Search and Select element from Drop down 
	public static void selectAndSerachEle(String xpath1,String xpath2, String xpath3, String eleText) throws IOException
	{
		try
		{
		driver.findElement(By.xpath(xpath1)).click();
		driver.findElement(By.xpath(xpath2)).sendKeys(eleText);
		driver.findElement(By.xpath(xpath3)).click();
		}
		catch (Exception e) 
		{
			captureScreen(driver, "loginTest");
            Assert.assertFalse(false);
            log.info("User not able to Search and Select element 'Test Failed'");
		}
	}
	
	//Select Element by Text
	public static void selectEleByText(String xpath, String eleText) throws IOException
	{
		try
		{
		driver.findElement(By.xpath(xpath)).click();
		WebElement selectEle=driver.findElement(By.xpath(xpath));
		Select sel=new Select(selectEle);
		sel.selectByVisibleText(eleText);
		}
		catch (Exception e) 
		{
			captureScreen(driver, "moveToElement");
            Assert.assertFalse(false);
            log.info("User not able to Select element 'Test Failed'");
		}
	}
	
	//Select Element by Index
	public static void selectEleByIndex(String xpath, int IndText) throws IOException
	{
		try
		{
		WebElement selectEle=driver.findElement(By.xpath(xpath));
		Select sel=new Select(selectEle);
		sel.selectByIndex(IndText);
		}
		catch (Exception e) 
		{
			captureScreen(driver, "moveToElement");
            Assert.assertFalse(false);
            log.info("User not able to Select element 'Test Failed'");
		}
	}
	
	//Select Element by Value
	public static void selectEleByValue(String xpath, String ValText) throws IOException
	{
		try
		{
		WebElement selectEle=driver.findElement(By.xpath(xpath));
		Select sel=new Select(selectEle);
		sel.selectByValue(ValText);
		}
		catch (Exception e) 
		{
			captureScreen(driver, "moveToElement");
            Assert.assertFalse(false);
            log.info("User not able to Select element 'Test Failed'");
		}
	}

	//User defined wait
     public static boolean userDefinedWait(WebElement element) throws InterruptedException {
		int maxWait=1000;
		int intervalWait= 2;
		int counter=0;
		while(counter>maxWait) {
			Thread.sleep(intervalWait*1000);
			counter+=intervalWait;
			System.out.println("counter....... "+counter);
			try {
				if(element.isDisplayed()) {
					System.out.println("Element found...."+element.getText());
					return true;
				}
			}catch(NoSuchElementException noelememt)
			{
				noelememt.getMessage();
			}
			
		}
		return false;
	}
   //User defined wait
	public static boolean userWait() throws InterruptedException {
		int maxWait=2000;
		int intervalWait= 2;
		int counter=0;
		while(counter>maxWait) {
			Thread.sleep(intervalWait*20000);
			counter+=intervalWait;
			//System.out.println("counter....... "+counter);
		}
		return true;	
	}
	public static void ExplicitWait(String xpath) 
	{
		WebDriverWait wait = new WebDriverWait(driver,500);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			
	}
	
	public static void print(String printText) throws IOException
	{
		System.out.println(printText);
	}
	
	public static String getOnlyNumbers(String xpath) throws IOException 
	{
		String elementText = driver.findElement(By.xpath(xpath)).getText().replaceAll("[^0-9]", " ");
		return elementText;
    }
	
	
	
	public static Process getExecutableOnPort(String port) throws IOException
	{
		return Runtime.getRuntime().exec("C:\\Users\\InfoGlobal_Tech3\\eclipse-workspace\\COSAC_CLIENT\\Drivers\\Winium.Desktop.Driver.exe" +" port "+port);
	}
	
	public static void ClientClick(String ImgName) throws Exception
	{
		Thread.sleep(1000);
		Screen s=new Screen();
		Thread.sleep(1000);
		 s.find(ImgName);
		 s.click();
     }
	
	 public static void keyboardString(final String text) {
		    if (text != null) {
		        try {
		            final Robot robot = new Robot();
		            for (int i = 0; i < text.length(); i++) {
		                final char ch = text.charAt(i);
		                final boolean upperCase = Character.isUpperCase(ch);
		                final int keyCode = KeyEvent.getExtendedKeyCodeForChar(ch);
		                robot.delay(100);

		                if (upperCase) {
		                    robot.keyPress(KeyEvent.VK_SHIFT);
		                }
		                robot.keyPress(keyCode);
		                robot.keyRelease(keyCode);
		                if (upperCase) {
		                    robot.keyRelease(KeyEvent.VK_SHIFT);
		                }
		                
		            }

		        } catch (final Exception e) {
		            System.out.println(e);
		        }
		    }
	 }
	 
	 public static String captureText() throws UnsupportedFlavorException, IOException
		{

			Toolkit toolkit1 = Toolkit.getDefaultToolkit();
			Clipboard clipboard1 = toolkit1.getSystemClipboard();
			String result1 = (String) clipboard1.getData(DataFlavor.stringFlavor);
			return result1;
		}
	 
	// Click to Element
			public static void click(String xpath) throws IOException {
				try {
					WebElement ele = driver.findElement(By.xpath(xpath));
					ele.click();
				} catch (Exception e) {
					captureScreen(driver, "loginTest");
					Assert.assertFalse(false);
					log.info("User not able to Click to element 'Test Failed'");
				}
			}
			
			public static void selectEle(String xpath1, String xpath2, String xpath3, String searchValue, String value)
					throws InterruptedException {
				driver.findElement(By.xpath(xpath1)).click();
				driver.findElement(By.xpath(xpath2)).sendKeys(searchValue);
				List<WebElement> ProdCodeVal = driver.findElements(By.xpath(xpath3));
				for (int i = 0; i < ProdCodeVal.size(); i++) {
					if (ProdCodeVal.get(i).getText().equals(value)) {
						Thread.sleep(3000);
						ProdCodeVal.get(i).click();
						break;
					}
				}
			}
			
			public static void switchToParentWindow() {
				Set<String> s = driver.getWindowHandles();
				Iterator<String> itr = s.iterator();
				String w1 = (String) itr.next();
				driver.switchTo().window(w1);
			}
			
			public static void switchToNewWindow() {
				Set<String> s = driver.getWindowHandles();
				Iterator<String> itr = s.iterator();
				String w1 = (String) itr.next();
				String w2 = (String) itr.next();
				driver.switchTo().window(w2);
			}


	
	}
}



