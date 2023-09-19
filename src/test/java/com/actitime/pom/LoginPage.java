package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="username")
	private WebElement untbx;

	@FindBy(name="pwd")
	private WebElement pwdbx;

	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement lgBtn;

	public LoginPage(WebDriver driver1) {
		PageFactory.initElements(driver1, this);
	}

	public void setLogin(String un,String pw) {
		untbx.sendKeys(un);
		pwdbx.sendKeys(pw);
		lgBtn.click();
	}
}


