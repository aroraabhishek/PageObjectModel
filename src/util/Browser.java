package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static final String URL ="https://www.youtube.com";
	
	public static void launch(){
		String currentDirectory=System.getProperty("user.dir");
		System.out.println(currentDirectory);
		System.setProperty("webdriver.chrome.driver",currentDirectory +"/libs/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(URL);
		wait=new WebDriverWait(driver, 60);
	}
	
	public static void shutdown(){
		driver.quit();
	}
	
	public static void pageRefresh(){
		driver.navigate().refresh();
	}
}