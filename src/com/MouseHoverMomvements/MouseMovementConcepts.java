package com.MouseHoverMomvements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.utilities.Helper;

import library.Reusability;

public class MouseMovementConcepts {

	public static void main(String[] args) throws Exception {
		WebDriver driver =Helper.startBrowser("Chrome");
		driver.manage().deleteAllCookies();
		driver.get("https://www.easemytrip.com/");
		
		Reusability.capturedscreenshots(driver, "1. Launch the Broweser.");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Login or Signup']"))).build().perform();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//a[@class='_drpdubro log']")).click();
		Reusability.capturedscreenshots(driver, "2. Logout Easymytrip Application");
		Thread.sleep(9000);
		driver.quit();
	}
}
