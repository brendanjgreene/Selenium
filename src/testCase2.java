import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testCase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// create driver object for firefox browser
		System.setProperty("webdriver.gecko.driver", "/Users/brendangreene/workspace/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		Thread.sleep(30000L);
		driver.close();
	}

}
