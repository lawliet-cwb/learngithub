package com.it.maven;

import static org.junit.Assert.*;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class STest {

	@Test
	public void testJavaScriptCalls() {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = (String) js.executeScript("return document.title");
		assertEquals("百度一下，你就知道", title);
		
		driver.close();
	}

}
