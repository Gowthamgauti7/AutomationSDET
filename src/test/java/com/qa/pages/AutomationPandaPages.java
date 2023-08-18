package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPandaPages {
WebDriver driver;
@FindBy(xpath="/html[1]/body[1]/div[1]/header[1]/div[1]/nav[1]/div[1]/ul[1]/li[3]/a[1]")
WebElement contact;
public WebElement getContact() {
return contact;
}

@FindBy(id="g3-name")
WebElement name;
public WebElement getName() {
return name;
}
@FindBy(id="g3-email")
WebElement mail;
public WebElement getMail() {
return mail;
}
@FindBy(id="contact-form-comment-g3-message")
WebElement message;
public WebElement getMessage() {
return message;
}

@FindBy(xpath="//strong[normalize-space()='Contact Me']")
WebElement submit;
public WebElement getSubmit() {
return submit;
}
public AutomationPandaPages(WebDriver rDriver) {
this.driver= rDriver;
PageFactory.initElements(rDriver, this);
}

}
