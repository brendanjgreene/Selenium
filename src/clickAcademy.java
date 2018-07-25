import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickAcademy {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// selenium code
		// create driver object for chrome browser
		System.setProperty("webdriver.chrome.driver", "/Users/brendangreene/workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/interview.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//li[@id='tablist1-tab2']")).click();
		driver.findElement(By.xpath("//li[@id='tablist1-tab2']/preceding-sibling::li")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='faqs']/h3/font/b")).getText());
		driver.findElement(By.xpath("//li[@id='tablist1-tab2']/following-sibling::li")).click();
		System.out.println(driver.findElement(By.xpath("//li[@id='tablist1-tab2']/parent::ul")).getText());
		System.out.println("is appium visible?" + driver.findElement(By.xpath("//div[@class='faqs']/h3/font/b")).getText());
		driver.findElement(By.xpath("//*[text()=' Appium ']")).click();
		System.out.println("is appium visible?" + driver.findElement(By.xpath("//div[@class='faqs']/h3/font/b")).getText());
		Thread.sleep(30000L);
		driver.close();

	}

}
