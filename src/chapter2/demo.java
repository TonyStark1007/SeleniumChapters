package chapter2;


import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class demo{
		public static void main(String[] args) {
			WebDriver Driver = new ChromeDriver();
			Driver.manage().window().maximize();
			Driver.get("https://www.amazon.com/");
			Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement ele = Driver.findElement(By.id("searchDropdownBox"));

			Select s = new Select(ele);

			java.util.List<WebElement> option = s.getOptions();
			System.out.println(option.size());
			for (WebElement allOption : option) {
				System.out.println(allOption.getText());
			}
			Driver.close();
		}
	}

