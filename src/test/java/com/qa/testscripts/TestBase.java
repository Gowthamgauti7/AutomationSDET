package com.qa.testscripts;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.qa.pages.AutomationPandaPages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
WebDriver driver;
AutomationPandaPages panda;

@Parameters({"URL"})
@BeforeSuite

public void setUp(@Optional("https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/") String url) throws IOException {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
driver.get(url);
panda=new AutomationPandaPages(driver);
}
@AfterSuite
public void tearDown() {
driver.quit();
}
}