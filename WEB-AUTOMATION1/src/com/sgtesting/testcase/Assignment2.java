package com.sgtesting.testcase;
//launchBrowser->NAVIGATE->login->createuser->modifyuser->deleteuser->logout->closeapplication.

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		FlyOutWindow();
		createUser();
		modifyUser();
		deleteUser();
		closeBrowser();
	}
	public static void launchbrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void login()
	{
		try
		{
		oBrowser.findElement(By.name("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void FlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void createUser()
	{
		try
		{
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
		oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
		oBrowser.findElement(By.name("firstName")).sendKeys("user1");
		oBrowser.findElement(By.name("lastName")).sendKeys("demo1");
		oBrowser.findElement(By.name("email")).sendKeys("demo1@gmail.com");
		oBrowser.findElement(By.name("username")).sendKeys("user1");
		oBrowser.findElement(By.name("password")).sendKeys("demo1");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("demo1");
		oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
		Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
	public static void modifyUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("demo1.1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deleteUser()
	{
		try
		{
		oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
		Thread.sleep(2000);

		Alert oAlert=oBrowser.switchTo().alert();
		String textcontent=oAlert.getText();
		System.out.println(textcontent);
		oAlert.accept();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void logout1()
	{
		try 
		{
		oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void closeBrowser()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
