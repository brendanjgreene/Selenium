import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//opera
		System.setProperty("webdriver.opera.driver", "/Users/brendangreene/workspace/operadriver_mac64/operadriver");
		WebDriver driver = new OperaDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		Thread.sleep(30000L);
		driver.close();
	}

}
