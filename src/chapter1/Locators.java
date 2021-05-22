package chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public static void main(String[] args) {
	WebDriver w1=new ChromeDriver();
w1.get("https://www.facebook.com/");
w1.manage().window().maximize();
w1.findElement(By.id("email")).sendKeys("deepakjabahde5@gmail.com");
w1.findElement(By.name("pass")).sendKeys("12435842");
w1.findElement(By.name("login")).click();
w1.close();
}
}
