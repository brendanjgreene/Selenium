import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/brendangreene/workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://login.salesforce.com/");
		//driver.findElement(By.id("username")).sendKeys("email");
		driver.findElement(By.cssSelector("#username")).sendKeys("cssemail");
		driver.findElement(By.name("pw")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		Thread.sleep(30000L);
		driver.close();
			}

}
