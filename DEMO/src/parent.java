import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class parent {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\virunu\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
	}

}
