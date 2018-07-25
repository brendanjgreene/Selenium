import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/brendangreene/workspace/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		//input[@value='Cheese']
		WebElement scroll = driver.findElement(By.xpath("//input[@value='Milk']"));//to fix scroll issue
		scroll.sendKeys(Keys.PAGE_DOWN);//to fixscroll issue
		driver.findElement(By.xpath("//input[@value='Water']")).click();
		System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());

		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		for (int i = 0;i<count;i++) {
			//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if(text.equals("Cheese")) {
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}
		Thread.sleep(30000L);
		driver.close();
		
	}

}
