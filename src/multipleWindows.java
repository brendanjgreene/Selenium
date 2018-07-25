import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/brendangreene/workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fe-11-153734e0b6c4430a960b85b435e084ce-da25a8616419f0cc2107d12d5c1c96fe82fac52b&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.xpath("//a[@href=\"https://support.google.com/accounts?hl=en\"]")).click();
		System.out.println(driver.getTitle());//system still on parent window
		
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentWindow=it.next();
		String childWindoew=it.next();
		driver.switchTo().window(childWindoew);
		System.out.println(driver.getTitle());//now on child
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());//now on parent
	}

}
