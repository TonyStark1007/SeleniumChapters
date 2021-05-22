package chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
public static void main(String[] args) {
	WebDriver d2=new ChromeDriver();
	d2.manage().window().maximize();
	d2.get("https://demo.vtiger.com/vtigercrm/index.php");
	d2.findElement(By.cssSelector("input[id='username']")).sendKeys("khcacg");
	d2.findElement(By.cssSelector("input[id='password']")).sendKeys("123456");
	d2.findElement(By.cssSelector("button[class='button buttonBlue']")).click();
d2.close();
	
}
}
