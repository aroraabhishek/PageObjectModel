package util;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class IWantTo extends Browser{
	public static void click(By element){
		driver.findElement(element).click();
	}
	
	public static void waitAndClick(By element){
		wait.until(ExpectedConditions.elementToBeClickable(element));
		driver.findElement(element).click();
	}
	
	public static void clear(By element){
		driver.findElement(element).clear();
	}
	
	public static void waitAndClear(By element){
		wait.until(ExpectedConditions.elementToBeClickable(element));
		driver.findElement(element).clear();
	}
	
	public static void type(By element, String value){
		driver.findElement(element).sendKeys(value);
	}
	public static void type(By element, Keys value){
		driver.findElement(element).sendKeys(value);
	}

	public static void waitAndType(By element, String value){
		wait.until(ExpectedConditions.elementToBeClickable(element));
		driver.findElement(element).sendKeys(value);
	}
	public static void waitAndType(By element, Keys value){
		wait.until(ExpectedConditions.elementToBeClickable(element));
		driver.findElement(element).sendKeys(value);
	}
	
	public static String getText(By element){
		return driver.findElement(element).getText();
	}
	
	public static String waitAndGetText(By element){
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		return driver.findElement(element).getText();
	}
}