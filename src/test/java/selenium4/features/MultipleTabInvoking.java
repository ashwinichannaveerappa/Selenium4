package selenium4.features;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabInvoking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> handles= driver.getWindowHandles();
		Iterator <String>ite= handles.iterator();
		String parentWindowID = ite.next();
		String childWindowID=ite.next();
		driver.switchTo().window(childWindowID);
		
		driver.get("https://rahulshettyacademy.com/#/index");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> cList=driver.findElements(By.cssSelector("div div  h2 a"));
		String cName = cList.get(1).getText();
		driver.switchTo().window(parentWindowID); //to switch back to parent window
		driver.findElement(By.cssSelector("[name='name']")).sendKeys(cName);
		driver.quit();

		
	}

}
