package com.cosac.Locators;

public class Xpath 
{
	public static class LoginPage
	{
		public static String userName="//input[@name='username']";
		public static String passWord="//input[@name='password']";
		public static String logIn="//button[contains(text(),'Log In')]";
	}
	public static class LocationCreation
	{
		public static String merchandising="//a[contains(text(),'Merchandising')]/..";
		public static String create="//li[@class='ng-scope dropdown-submenu']//a[contains(text(),'Create')]";
		public static String location="//a[contains(text(),'Combo')]//../..//a[contains(text(),'Location')]";
		public static String locationID="//label[contains(text(),'Location Id')]/..//input[@class='form-control ng-pristine ng-invalid ng-invalid-required']";
		public static String verifyLocationPage="//h2[contains(text(),'Create Location')]";
		public static String fascia="//list[@name='fascia']//div[@class='list-arrow']";
		public static String fasciaSerch="//list[@name='fascia']//input[@class='ng-pristine ng-valid']";
		public static String fasciaName="//div[contains(text(),'Courts')][position()=1]";
		public static String StoreType="//list[@name='storeType']//div[@class='list-arrow']";
		public static String StoreTypeSearch="//list[@name='storeType']//input[@class='ng-pristine ng-valid']";
		public static String StoteName="//div[contains(text(),'All Courts')][position()=1]";
		
	}
	public static class CustPickup
	{
		public static String Logistic ="//a[text()='Logistics']/..";
		public static String customerPickUp="//a[contains(text(),'Customer Pick Up')]";
		public static String DeliveryBranch="//span[contains(text(),'Select a Delivery Branch')]";
		public static String searchDeliveryBranch="//div[@class='chzn-search']//input";
		public static String selectDeliveryBranch="(//li[contains(@class,'active-result')])[position()=1]";
		public static String printReturnNote="(//button[@class='btn btn-default btn-block printPickUp single-click'])[1]";
		public static String NewReturnNote="//a[@class='external-link']";
		public static String ReturnNote="//div[@class='ref']";
		public static String ok="//button[@class='ok btn btn-primary']";
		public static String searchShipment="//a[contains(text(),'Search Shipments')]";
		public static String reprintButton="//button[@class='btn single-click btn-default btn-block external-link reprintButton']";
		public static String reprintOk="//button[@class='ok btn btn-primary']";
		
		}
	
	public static class CustomerPickUp
	{
		public static String logistics = "//a[contains(text(),'Logistics')]";
		public static String customerPickup = "//li[@class='ng-scope']//a[contains(text(),'Customer Pick Up')] ";
		public static String ArrowdeliveryBranch = "(//div[@id='deliveryBranch_chzn']//div)[1]";
		public static String SearchdeliveryBranch = "//div[@class='chzn-search']/input";
		public static String SelectdeliveryBranch = "//ul[@class='chzn-results']/li";
		public static String printReturn = "(//div[@class='col-lg-2 pull-right']//button[contains(text(),'Print Return Note')] )[1] ";
		public static String newPickUpLink = "//a[@class='external-link']";
		public static String ReturnNote = "//div[@class='ref']";
		public static String confirmpickUpNote = "//div[@class='col-lg-2 pull-right']//button[text()='Confirm']";
		public static String searchShipment="//a[contains(text(),'Search Shipments')]";
		public static String okBTN =  "//button[@class= 'ok btn btn-primary']";
		public static String search =  "//input[@class='text-search form-control ng-pristine ng-valid']";
		public static String status ="//span[@class='label label-default status ng-binding']";
	}
	
	
	
	
}
