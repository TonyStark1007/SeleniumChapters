package chapter2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileuploadPopup {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//button[@class='btn'])[2]")).click();
	driver.findElement(By.xpath("//button[@value='fresher']")).click();
	driver.findElement(By.name("uploadCV")).sendKeys("C:\\Users\\TONY STARK\\Desktop\\resume.pdf");
}
}
