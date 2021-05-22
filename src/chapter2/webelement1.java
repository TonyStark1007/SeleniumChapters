package chapter2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement ele = driver.findElement(By.xpath("//a[text()='Home & Living']"));
		String text = ele.getText();
		System.out.println(text);
		WebElement ele1 =driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
        Dimension size = ele1.getSize();
        System.out.println("Height::"+size.height);
        System.out.println("width::"+size.width);
        Point location = ele.getLocation();
        System.out.println("x cordinates::"+location.x);
        System.out.println("y cordinates::"+location.y);
driver.close();
	}

}
