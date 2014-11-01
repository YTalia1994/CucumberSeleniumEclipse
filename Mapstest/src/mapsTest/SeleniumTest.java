package mapsTest;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

import org.openqa.selenium.*;

//import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.htmlunit.HtmlUnitDriver;

//import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.remote.RemoteWebDriver;

//import org.openqa.selenium.safari.SafariDriver;

public class SeleniumTest {

    private WebDriver driver;

    private String baseUrl,browserName,browserVersion;

    public void setUp() throws Exception {

    //driver = new HtmlUnitDriver();

   driver = new FirefoxDriver();

    //driver = new ChromeDriver();

    //driver = new  InternetExplorerDriver ();

    //driver = new  SafariDriver();

    baseUrl = "http://www.google.de/";
    
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    driver.manage().window().maximize();

    Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();

    browserName = caps.getBrowserName();

    browserVersion = caps.getVersion();

    System.out.println("Automated test run. We’re running on "+browserName+" "+browserVersion);

     }

     public void tearDown() {

     driver.quit();

     }

    public void goToHomePage(){

     driver.get(baseUrl);

     }

	public void switchToMaps() {
	    driver.findElement(By.cssSelector("a.gb_A.gb_Na")).click();
	    driver.findElement(By.cssSelector("#gb8 > span.gb_q")).click();
	}

	public void searchDH() {
	    driver.findElement(By.id("searchboxinput")).click();
	    driver.findElement(By.id("searchboxinput")).clear();
	    driver.findElement(By.id("searchboxinput")).sendKeys("dhbw karlsruhe");
	    driver.findElement(By.cssSelector("button.searchbutton")).click();
		
	}

	public void checkAdress(int hnr) {
		assertEquals("Erzbergerstraße "+hnr, driver.findElement(By.cssSelector("div.cards-text-truncate-and-wrap > span")).getText());
	}

	public void checkCity(int plz) {
		assertEquals(plz+" Karlsruhe", driver.findElement(By.xpath("//div[@id='cards']/div[2]/div/div/div/div/div/div/div/div[2]/span")).getText());
	}

	public void searchZKM() {
	    driver.findElement(By.id("searchboxinput")).click();
	    driver.findElement(By.id("searchboxinput")).clear();
	    driver.findElement(By.id("searchboxinput")).sendKeys("zkm");
	    driver.findElement(By.cssSelector("button.searchbutton")).click();
		
	}

}
