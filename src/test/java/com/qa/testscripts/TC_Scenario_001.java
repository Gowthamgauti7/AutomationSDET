package com.qa.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Scenario_001 extends TestBase{
@Test
public void Scenario1(){
panda.getContact().click();
String contactTitle=driver.getTitle();
Assert.assertEquals("Contact | Automation Panda",contactTitle,"Title is not matched");
panda.getName().sendKeys("Gowtham");
panda.getMail().sendKeys("gowthamgauti710@gmail.com");
panda.getMessage().sendKeys("good");
panda.getSubmit().click();
boolean sent=driver.getPageSource().contains("Your message has been sent");
Assert.assertTrue(sent,"System does not sent message");

}
}