package tests;

import java.util.Iterator;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ResultsPage;
import util.Browser;
import util.IWantTo;
import util.ReadFile;

public class SmokeTest {

	@BeforeTest
	public void setup(){
		Browser.launch();
	}

	@Test(dataProvider="getData")
	public void searchTest(String key){
		//IWantTo.clear(HomePage.searchBox);
		IWantTo.waitAndType(HomePage.searchBox, key);
		IWantTo.click(HomePage.searchBtn);
		System.out.println(IWantTo.waitAndGetText(ResultsPage.resultsCount));
		HomePage.gotoHomePage();
		Browser.pageRefresh();
	}
	
	@DataProvider
	public Iterator<String[]> getData(){
		return ReadFile.csv("user.csv");
	}
	
	@AfterTest
	public void quit(){
		Browser.shutdown();
	}
}
