import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/brendangreene/workspace/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//div[@class='lst-c']/div/div[2]/div/input")).sendKeys("Brendan Greene is great");
		Thread.sleep(30000L);
		driver.close();
	}

}
