package chapter2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://crmaccess.vtiger.com/log-in/?mode=continue");
    org.openqa.selenium.WebElement ele = driver.findElement(By.name("username"));
    ele.sendKeys("admin");
    org.openqa.selenium.WebElement ele1 = driver.findElement(By.name("password"));
    ele.sendKeys("admin");
    ele1.sendKeys("admin");
    ele.clear();
    ele1.clear();
    org.openqa.selenium.WebElement log = driver.findElement(By.xpath("//button[@type='submit']"));
    log.submit();
    driver.close();
}
}
