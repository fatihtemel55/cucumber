package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.BrowserUtils;
import com.app.utilities.Driver;

public class SuiteCRMDasboardPage {

	private WebDriver driver;

	public SuiteCRMDasboardPage() {

		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);

	}

	@FindBy(linkText = "SALES")
	public WebElement sales;

	@FindBy(linkText = "SUPPORT")
	public WebElement support;

	@FindBy(linkText = "MARKETING")
	public WebElement marketing;

	@FindBy(linkText = "ACTIVITIES")
	public WebElement activities;

	@FindBy(linkText = "COLLOABRATION")
	public WebElement collabration;

	@FindBy(linkText = "ALL")
	public WebElement all;

	@FindBy(xpath = "//input[@title= 'Post Status Update']")
	public WebElement postFiled;

	@FindBy(xpath = "//div[@class= 'daslandNonTable ']")
	public WebElement post;
	
	@FindBy(id = "with-label")
	public WebElement profileMenu;
	
	@FindBy(id = "logout_link")
	public WebElement logoutLink;
	
	public void logout() {
		Actions action = new Actions(driver);
		action.moveToElement(profileMenu);
		action.perform();
		BrowserUtils.waitForVisibility(logoutLink, 5);
		logoutLink.click();
	}

	public void postNote(String note) {

		postFiled.sendKeys(note);
		post.click();
	}

}
