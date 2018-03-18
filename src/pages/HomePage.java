package pages;

import org.openqa.selenium.By;

import util.Browser;
import util.IWantTo;

public class HomePage {
	public static By searchBox=By.id("search");
	public static By searchBtn=By.id("search-icon-legacy");
	public static By signinLink=By.partialLinkText("SIGN IN");
	public static By logo=By.id("logo-icon-locator");
	
	public static void gotoHomePage(){
		IWantTo.click(logo);
	}
}
