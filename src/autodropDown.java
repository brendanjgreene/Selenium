import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Enter letters Beng and verifyy airprt option is present

public class autodropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/brendangreene/workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.ksrtc.in/oprs-web/");
		
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
		Thread.sleep(1000);//important to give time for element to load
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		
		System.out.println("test"+driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script ="return document.getElementById('fromPlaceName').value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		int i =0;
		
		
		while(!text.equals("BENGALURU INTERNATION AIPORT")) {
			i++;
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
			if(i>10)
			{
			break;
			}


		}
		if(i>10)
		{
		System.out.println("Element not found");
		}
		else
		{
		System.out.println("Element  found");
		}
		
		Thread.sleep(30000);
		driver.close();
	}

}
