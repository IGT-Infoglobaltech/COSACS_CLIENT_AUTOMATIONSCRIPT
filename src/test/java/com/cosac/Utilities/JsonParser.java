package com.cosac.Utilities;

import java.io.File;
import java.io.IOException;

import com.jayway.jsonpath.JsonPath;


public class JsonParser {

	  private static File jsonFile;

	  public static String CashAccount_Data(String path) throws IOException   {	
		  
		  try {
	    jsonFile=new File(Constants.newCustomerCashAccount);
		  }catch(Exception e){
			  e.printStackTrace();
		  }
	    return JsonPath.read(jsonFile,"$."+path);
	    
	  }
 public static String RFAccount_Data(String path) throws IOException   {	
		  
		  try {
	    jsonFile=new File(Constants.newRFAccount);
		  }catch(Exception e){
			  e.printStackTrace();
		  }
	    return JsonPath.read(jsonFile,"$."+path);
	    
	  }
public static String CustPickUp_Data(String path) throws IOException   {	
		  
		  try {
	    jsonFile=new File(Constants.custPickUp);
		  }catch(Exception e){
			  e.printStackTrace();
		  }
	    return JsonPath.read(jsonFile,"$."+path);
	    
	  }
	  
	  
	  
	  public static String getSikuliScreePath(String path) throws IOException   {	 
		  try {
	    jsonFile=new File(Constants.sikuliScreen);
		  }catch(Exception e){
			  e.printStackTrace();
		  }
	    return JsonPath.read(jsonFile,"$."+path);
	    
	  }
	  public static String Data(String path) throws IOException   {	 
		  try {
	    jsonFile=new File(Constants.commonData);
		  }catch(Exception e){
			  e.printStackTrace();
		  }
	    return JsonPath.read(jsonFile,"$."+path);
	    
	  }
}

