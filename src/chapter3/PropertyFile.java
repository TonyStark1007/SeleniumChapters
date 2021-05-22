package chapter3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class PropertyFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Properties p=new Properties();
		 p.load(new FileInputStream("./data.properties"));
		 
		 driver.get(p.getProperty("url"));
		 driver.findElement(By.id("email")).sendKeys(p.getProperty("user"));
		
		 driver.findElement(By.id("pass")).sendKeys(p.getProperty("pwd"));
		
		 driver.close();	

	}

}
