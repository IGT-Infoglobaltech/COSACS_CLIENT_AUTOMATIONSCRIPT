package com.cosac.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
	Properties pro;
	
	public ReadConfig()
	{
		File src=new File("./Configuration/config.properties");
		
		try 
		{
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			
		} catch (Exception e) 
		{
			System.out.println("Exeption is: "+e.getMessage());
		}
	}
	
	public String getURL()
	{
		String baseurl=pro.getProperty("url");
		return baseurl;
		
	}
	
	public String getUsername()
	{
		String uname=pro.getProperty("userName");
		return uname;
		
	}
	
	public String getPassword()
	{
		String pass=pro.getProperty("passWord");
		return pass;
		
	}
	
	public String getChromePath()
	{
		String chromepath=pro.getProperty("chromePath");
		return chromepath;
		
	}
	
	public String getIePath()
	{
		String iepath=pro.getProperty("iePath");
		return iepath;
		
	}
	
	public String getFirefoxPath()
	{
		String fireFoxpath=pro.getProperty("Firefox");
		return fireFoxpath;
		
	}
	public String getDesktopPath()
	{
		String desktoppath=pro.getProperty("Desktop");
		return desktoppath;
		
	}
	public String DesktopAppPAth()
	{
		String cosacDesktopAppPAth=pro.getProperty("CosacDesktopAppPAth");
		return cosacDesktopAppPAth;
		
	}
	public String WinDriverPath()
	{
		String winiumDriverPath=pro.getProperty("WiniumDriverPath");
		return winiumDriverPath;
		
	}
	public String WinuserName()
	{
		String clientuserName=pro.getProperty("ClientuserName");
		return clientuserName;
		
	}
	public String WinpassWord()
	{
		String clientpassWord=pro.getProperty("ClientpassWord");
		return clientpassWord;
		
	}

}
