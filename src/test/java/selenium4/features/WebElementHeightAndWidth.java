package selenium4.features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementHeightAndWidth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement name =driver.findElement(By.cssSelector("[name='name']"));
		int height = name.getRect().getDimension().getHeight();
	int width = 	name.getRect().getDimension().getWidth();
	System.out.println("height of the edit box is : -->"+height);
	System.out.println("width of the edit box is : -->"+width);
	driver.quit();
	}

}
