import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/brendangreene/workspace/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 username']")).sendKeys("hello world");
		driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 password']")).sendKeys("hhhfhjfsjljh");
		driver.findElement(By.xpath("//*[@name='Login']")).click();
		//driver.close();
		Thread.sleep(30000L);
		driver.close();
	}

}
