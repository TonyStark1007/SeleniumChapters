package chapter2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionAmazon {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
        ele.sendKeys("bookli");
        List<WebElement> auto = driver.findElements(By.xpath("//div[@class='s-suggestion']"));
        System.out.println(auto.size());
        for (WebElement sug: auto) {
			System.out.println(sug.getText());
		}
      driver.close();
	}

}
