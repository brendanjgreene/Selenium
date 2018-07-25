import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class formMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/brendangreene/workspace/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		System.out.println("return before clicking on multicity is displayed is "+driver.findElement(By.id("hp-widget__return")).isDisplayed());
		driver.findElement(By.id("multicity")).click();
		System.out.println("return after clicking on multicity is displayed is "+driver.findElement(By.id("hp-widget__return")).isDisplayed());
//is displayed only works if present in code 
		// if you want to confirm elements is removed from code base
		//driver.findElement(By.xpath(".//*[id='multicity2']")).isDisplayed();  will not work
		int count = driver.findElements(By.xpath(".//*[id='multicity2']")).size();
		if (count==0) {
			System.out.println("multicity2 not present");
		}
		System.out.println("return is enabled is "+driver.findElement(By.id("hp-widget__return")).isEnabled());
		
		String text = driver.findElement(By.xpath(".//*[@id=\"fd-wrap\"]/div[2]/h2")).getText();
		if (text.equals("Discover Hot Deals")) {
			System.out.println("Discover Hot Deals");
		}
		
		Thread.sleep(30000L);
		driver.close();

	}

}
