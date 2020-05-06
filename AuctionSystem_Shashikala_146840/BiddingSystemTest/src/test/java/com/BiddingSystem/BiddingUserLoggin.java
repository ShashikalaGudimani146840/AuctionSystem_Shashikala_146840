package com.BiddingSystem;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BiddingUserLoggin {
	private WebDriver driver;
	
	
	public BiddingUserLoggin() {
		String driverPath = System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println(driver);
	}
	@Given("navigate to BiddingSystem")
	public void navigate_to_BiddingSystem() {
		driver.get("http://localhost:8080/BiddingSystem/");
		
	}

	@When("user logged in using username as {string} and password as {string} and product name as {string} and price as {string} and as Email {string} and Address as {string}")
	public void user_logged_in_using_username_as_and_password_as(String username, String pwd,String ProductName ,String Price,String Email,String Address) {
		//The User Flow Test Case
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td[1]/input")).click();
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[1]/td[2]/input")).sendKeys(username);
		
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[2]/td[2]/input")).sendKeys(pwd);
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[5]/td[2]/center/input")).click();
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td[1]/input")).click();
		
		//Add Item From
		
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[1]/td[2]/input")).sendKeys(ProductName);
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[1]/td[2]/input")).sendKeys(Price);
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[1]/td[2]/input")).sendKeys(Email);
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[1]/td[2]/input")).sendKeys(Address);
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[5]/td[2]/center/input")).click();
		
		//GetAll Records
		driver.findElement(By.xpath("/html/body/center/form/input")).click();
		driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td[1]/a")).click();
		
		//Bidding Form
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[1]/td[2]/input")).sendKeys(Address);
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[2]/td[2]/input")).sendKeys(Address);
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[3]/td[2]/input")).sendKeys(Address);
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[4]/td[2]/input")).sendKeys(Address);
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[5]/td[2]/input")).sendKeys(Address);
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[7]/td[2]/input")).click();
		//Again want to bid
		driver.findElement(By.xpath("/html/body/center/form/input")).click();
		driver.findElement(By.xpath("/html/body/center/form/input")).click();
		driver.findElement(By.xpath("/html/body/center/center/table/tbody/tr[5]/td[3]/a/input")).click();
		driver.findElement(By.xpath("/html/body/center/form/input")).click();
		
		
		
		
	}

	
@Then("Add the item should be displayed")
	public void add_the_item_should_be_displayed() {
	    System.out.println("Sucessfully completed");
	}

}
