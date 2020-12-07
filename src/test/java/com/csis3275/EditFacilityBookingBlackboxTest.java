package com.csis3275;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

public class EditFacilityBookingBlackboxTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:/temp/chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
		
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	// This is a Selenium test for the feature Manage Facility Bookings
	// This test edits an entry from the sample data from the application and
	// asserts that the new values are found in the table containing all Facility
	// Bookings
	@SuppressWarnings("deprecation")
	@Test
    @Order(1)
	public void editFacilityBookingBlackbox() {
		driver.get("http://localhost:8080/");
		driver.manage().window().setSize(new Dimension(1900, 1020));
		driver.findElement(By.id("usernameForm")).click();
		driver.findElement(By.id("usernameForm")).sendKeys("admin");
		driver.findElement(By.id("passwordForm")).sendKeys("admin");
		driver.findElement(By.id("passwordForm")).sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("Manage Facility Bookings")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("facilityName")).click();
		{
			WebElement dropdown = driver.findElement(By.id("facilityName"));
			dropdown.findElement(By.xpath("//option[. = 'THE KITCHEN']")).click();
		}
		driver.findElement(By.id("facilityName")).click();
		driver.findElement(By.id("timeStart")).click();
		{
			WebElement dropdown = driver.findElement(By.id("timeStart"));
			// dropdown.findElement(By.xpath("//option[. = '20:30']")).click();
			dropdown.findElement(By.xpath("//*[@id=\"timeStart\"]/option[25]")).click();
		}
		driver.findElement(By.id("timeStart")).click();
		driver.findElement(By.id("timeEnd")).click();
		{
			WebElement dropdown = driver.findElement(By.id("timeEnd"));
			// dropdown.findElement(By.xpath("//option[. = '22:00']")).click();
			dropdown.findElement(By.xpath("//*[@id=\"timeEnd\"]/option[30]")).click();
		}
		driver.findElement(By.id("timeEnd")).click();
		// driver.findElement(By.cssSelector(".btn")).click();
		driver.findElement(By.xpath("//*[@id=\"facilityBooking\"]/div[8]/div/button")).click();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		// Verify that the new facility, start, and end times match the updated values
		assertThat(driver.findElement(By.cssSelector(".dataRows:nth-child(1) > td:nth-child(2)")).getText(),
				is("THE KITCHEN"));
		assertThat(driver.findElement(By.cssSelector(".dataRows:nth-child(1) > td:nth-child(7)")).getText(), is("20:00"));
//		assertThat(driver.findElement(By.xpath("body > div.container > table > tbody > tr:nth-child(2) > td:nth-child(2)")).getText(),
//				is("THE KITCHEN"));
//		assertThat(driver.findElement(By.xpath("body > div.container > table > tbody > tr:nth-child(2) > td:nth-child(7)")).getText(), is("20:00"));
		assertThat(driver.findElement(By.cssSelector(".dataRows:nth-child(1) > td:nth-child(8)")).getText(), is("22:30"));
		
	}
}
