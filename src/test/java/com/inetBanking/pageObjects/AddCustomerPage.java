package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	@FindBy(xpath = "//a[contains(text(),'New Customer')]")
	//@FindBy(xpath = "/html/body/div[3]/div/ul/li[2]/a")
	WebElement btnNewCustomer;
	
	@FindBy(name= "name")
	WebElement txtCustomerName;
	
	@FindBy(how = How.NAME, using = "rad1")
	WebElement rbGender;
	
	@CacheLookup
	@FindBy(how = How.ID_OR_NAME, using = "dob")
	WebElement txtdob;
	
	@FindBy(name = "addr")
	WebElement txtAddress;
	
	@FindBy(name = "city")
	WebElement txtCity;
	
	@FindBy(name = "state")
	WebElement txtState;
	
	@FindBy(name= "pinno")
	WebElement txtPin;
	
	@FindBy(name = "telephoneno")
	WebElement txtMobileNumber;
	
	@FindBy(name = "emailid")
	WebElement txtEmail;
	
	@FindBy(name= "password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name= "sub")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickAddNewCustomer() {
		btnNewCustomer.click();
		
	}
	
	public void addCustomerName(String customerName) {
		txtCustomerName.sendKeys(customerName);
		
	}
	
	public void selectGenderCkbox() {
		rbGender.click();
	}
	
	public void custdob(String mm/*,String dd,String yy*/) {
		txtdob.sendKeys(mm);
		/*txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);*/
		
	}
	
	public void addAddress(String address) {
		txtAddress.sendKeys(address);
		
	}
	public void addCity(String city) {
		txtCity.sendKeys(city);
	}
	public void addState( String state) {
		txtState.sendKeys(state);
	}
	public void addPin( String pin) {
		txtPin.sendKeys(String.valueOf(pin));
	}
	public void addMobileNumber(String mNumber) {
		txtMobileNumber.sendKeys(mNumber);
	}
	public void addEmail( String mail) {
		txtEmail.sendKeys(mail);
	}
	public void addpassword( String pass) {
		txtPassword.sendKeys(pass);
	}
	
	
	public void custSubmit() {
		btnSubmit.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
