package techfios.homework;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
WebDriver driver;
	
	
	@Test
public void launchbrowser() 
{
System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe" );
 driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
Thread.sleep(2000);