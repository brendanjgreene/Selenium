import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/brendangreene/workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rediff.com");
		driver.findElement(By.cssSelector("a[title*=\"Sign in\"]")).click();
		driver.findElement(By.cssSelector("#login1")).sendKeys("bbb");
		driver.findElement(By.cssSelector("#password")).sendKeys("password");
		driver.findElement(By.cssSelector("input[name='proceed']")).click();
		driver.findElement(By.cssSelector("a[href=\"http://www.rediff.com\"]")).click();
		Thread.sleep(30000L);
		driver.close();
	}

}
