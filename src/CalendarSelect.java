import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/brendangreene/workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companions");
		// August 22
		driver.findElement(By.xpath("//*[@id=\"travel_date\"]")).click();
		Thread.sleep(2000);
		
		while (!driver.findElement(By.cssSelector("th.datepicker-switch")).getText().contains("June")){
			driver.findElement(By.className("prev")).click();
		}
		
		List<WebElement> dates = driver.findElements(By.cssSelector(".day"));
		for (WebElement date : dates) {
			
			if(date.getText().equals("15")) {
				date.click();
				break;
			}
		}
	}

}
