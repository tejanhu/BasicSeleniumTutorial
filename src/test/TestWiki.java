package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWiki {
	public static void main(String []args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://wikipedia.org");
		WebElement link;
		link = driver.findElement(By.className("lang1"));
		link.click();
		Thread.sleep(5000);
		WebElement searchBox;
		searchBox = driver.findElement(By.id("searchInput"));
		searchBox.sendKeys("Software");
		Thread.sleep(5000);
		driver.quit();
	}
}
