package AdactinBase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {

	public static WebDriver driver;

	public static void getBrowesr(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
		public static void getUrl(String url) {
		driver.get(url);
		}
		public static void clickOnElement(WebElement element) {
			element.click();
		}
		public static void inputVlaueElement(WebElement element, String value) {
			element.sendKeys(value);

		}
		public void browserClose() {
			driver.close();
		}
}
