package com.cosac.PageObject;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;

import com.cosac.Locators.Id;
import com.cosac.Locators.Xpath;
import com.cosac.Utilities.ReadConfig;



public class LoginPage{
	
	ReadConfig readconfig=new ReadConfig();
	public String url=readconfig.getURL();
	public String userName=readconfig.getUsername();
	public String passWord=readconfig.getPassword();
	public String desktopAppPath=readconfig.DesktopAppPAth();
	public String windowsDriverPath=readconfig.WinDriverPath();
	public String windowsuserName=readconfig.WinuserName();
	public String WindowspassWord=readconfig.WinpassWord();
   
	
	public static WebDriver driver;
	public static WiniumDriver windriver;
	protected static Logger log;
	WiniumDriverService service;
	
	
	
   //@Parameters("browser")
   public void LoginCosacWeb(){
	   log=Logger.getLogger("cosac");
		PropertyConfigurator.configure("log4j.properties");
		
		
		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
		driver=new ChromeDriver();
	     
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	    driver.findElement(By.xpath(Xpath.LoginPage.userName)).sendKeys(userName);
		driver.findElement(By.xpath(Xpath.LoginPage.passWord)).sendKeys(passWord);
		driver.findElement(By.xpath(Xpath.LoginPage.logIn)).click();
		
		
   }
   
 // @Parameters("browser")
 
   public void LoginCosacClient() throws IOException, InterruptedException, Throwable{
	   //log=Logger.getLogger("client");
		//PropertyConfigurator.configure("log4j.properties");
	   DesktopOptions option= new DesktopOptions();
		option.setApplicationPath(desktopAppPath);
		Thread.sleep(2000);
		windriver = new WiniumDriver(new URL(windowsDriverPath), option);
		Thread.sleep(1000);

		windriver.findElementById(Id.LoginPage.userName).sendKeys(windowsuserName);
		Thread.sleep(750);
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(750);
		windriver.findElementById(Id.LoginPage.passWord).sendKeys(WindowspassWord);
		robo.keyPress(KeyEvent.VK_ENTER);
        
        

		
	
   }

}


