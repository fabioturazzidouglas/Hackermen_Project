package com.csis3275;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;

public class ViewEditProfileTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "c:/temp/chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

//	Checks if user can access his profile
	@Test
	public void viewProfile() {
		driver.get("http://localhost:8080/");
		driver.manage().window().setSize(new Dimension(1154, 758));
		driver.findElement(By.id("usernameForm")).click();
		driver.findElement(By.id("usernameForm")).sendKeys("doeJohn");
		driver.findElement(By.id("passwordForm")).click();
		driver.findElement(By.id("passwordForm")).sendKeys("passJohnDoe");
		driver.findElement(By.cssSelector(".btn")).click();
		driver.findElement(By.linkText("My Profile")).click();
		assertEquals("doeJohn", driver.findElement(By.xpath("//h2")).getText());
	}

	//Edits profile and verify that new information was saved
	@Test
	public void editProfile() {
		driver.get("http://localhost:8080/");
		driver.manage().window().setSize(new Dimension(1157, 760));
		driver.findElement(By.id("usernameForm")).click();
		driver.findElement(By.id("usernameForm")).sendKeys("doeJohn");
		driver.findElement(By.id("passwordForm")).click();
		driver.findElement(By.id("passwordForm")).sendKeys("passJohnDoe");
		driver.findElement(By.cssSelector(".btn")).click();
		driver.findElement(By.linkText("My Profile")).click();
		driver.findElement(By.id("editBtn")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.id("firstName")).getAttribute("value");
		driver.findElement(By.id("firstName")).click();
		driver.findElement(By.id("firstName")).sendKeys("ny");
		driver.findElement(By.id("firstName")).click();
		driver.findElement(By.id("saveEdit")).click();
		driver.findElement(By.id("profFName")).getAttribute("value"); 
		assertEquals("Johnny", driver.findElement(By.id("profFName")).getAttribute("value"));
	}
}
