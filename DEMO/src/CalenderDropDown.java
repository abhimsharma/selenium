import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\virunu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:/spicejet.com");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		
	}

}
