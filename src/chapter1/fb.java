package chapter1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fb {

public static void main(String[] args) throws InterruptedException {
	WebDriver Driver =new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Driver.get("https://www.facebook.com/");
	WebElement user = Driver.findElement(By.id("email"));
	
	if(user.isDisplayed()) {
		System.out.println("username displayed");
		user.sendKeys("admin");
	}else {
		System.out.println("username not displayed");
	}
	WebElement pwd = Driver.findElement(By.id("pass"));
	if(pwd.isDisplayed()) {
		System.out.println("password is displayed");
		pwd.sendKeys("user");
	}else {
		System.out.println("passsword is not displayed");
	}
	WebElement create = Driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	create.click();
	if(create.isEnabled()) {
		System.out.println("create ac enabled");
	
	}else {
		System.out.println("create ac not enabled");
	}
	WebElement radio = Driver.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
	radio.click();
	if(radio.isSelected()) {
		System.out.println("Radio button selected");
	}
	else {
		System.out.println("Radio button not selected");
	}
	Driver.close();
	}
}
