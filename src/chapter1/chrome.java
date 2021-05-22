package chapter1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {
public static void main(String[] args) {
	ChromeDriver c1=new ChromeDriver(); //to launch chrome browser,inside ChromeDriver() constructor {open empty chrome browser}
	WebDriver w1=new ChromeDriver();
	w1.manage().window().maximize();
	w1.get("https://www.amazon.com/");
	w1.manage().window().maximize();//to maximize a window screen
	w1.navigate().back();
	w1.navigate().forward();
	w1.navigate().refresh();
	String title=w1.getTitle();
	System.out.println(title);
	String url=w1.getCurrentUrl();
	System.out.println(url);
	w1.close();
}
}
