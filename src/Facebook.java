import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/brendangreene/workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://facebook.com");
		/*driver.findElement(By.id("email")).sendKeys("email");
		driver.findElement(By.name("pass")).sendKeys("password");
		driver.findElement(By.linkText("Forgotten account?")).click();*/
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("email");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("1234567");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		//driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
		Thread.sleep(30000L);
		driver.close();
	}

}
