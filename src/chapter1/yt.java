package chapter1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yt {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d1=new ChromeDriver();
		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d1.get("https://www.youtube.com/watch?v=vAFKUdq8qHE");
	for (int i = 0; i <=10; i++) {
		Thread.sleep(3000);
		d1.navigate().refresh();
	}
d1.close();
	}

}
