import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// selenium code
		// create driver object for chrome browser
		System.setProperty("webdriver.chrome.driver", "/Users/brendangreene/workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());//validate title
		System.out.println(driver.getCurrentUrl());//validate your are landed on correct url
		//System.out.println(driver.getPageSource());
		driver.get("http://yahoo.com");
		System.out.println(driver.getTitle());//validate title
		System.out.println(driver.getCurrentUrl());//validate your are landed on correct url
		driver.navigate().back();
		System.out.println(driver.getTitle());//validate title
		System.out.println(driver.getCurrentUrl());//validate your are landed on correct url
		Thread.sleep(30000L);
		driver.close();//It closes current browser
		driver.quit();//It closes all browsers opened by selenium
		
	}

}
