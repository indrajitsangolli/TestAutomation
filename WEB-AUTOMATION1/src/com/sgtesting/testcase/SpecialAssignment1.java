package com.sgtesting.testcase;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecialAssignment1 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launch();
		navigateTo();
		login();
		FlyoutWindow();
		
		createUser1();
		logout();
		loginAsUser1();
		creatingUser2();
		modifyingUser2();
		logout1();
		loginAsUser2();
		creatingUser3();
		logout2();
		LoginAsAdmin();
		ChangingPassWordForUser1();
		logout3();
		LoginAsUser1();
		logout4();
		loginAsUser2Again();
		deletingUser3();
		logout5();
		loginAsUser1again();
		DeletingUser2();
		logout6();
		LoginAsAdminAgain();
		DelitingUser1();
		logout7();
	}
	public static void launch()
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
	public static void navigateTo()
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
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
	}
	public static void FlyoutWindow()
	{
		try
		{

			oBrowser.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsMenuCloseId\"]")).click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void createUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user1");
			oBrowser.findElement(By.name("lastName")).sendKeys("sg1");
			oBrowser.findElement(By.name("email")).sendKeys("email1@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("user1");
			oBrowser.findElement(By.name("password")).sendKeys("user1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user1");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	public static void logout()
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
	public static void loginAsUser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user1");
			oBrowser.findElement(By.name("pwd")).sendKeys("user1");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	public static void creatingUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user2");
			oBrowser.findElement(By.name("lastName")).sendKeys("sg2");
			oBrowser.findElement(By.name("email")).sendKeys("email2@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("user2");
			oBrowser.findElement(By.name("password")).sendKeys("user2");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user2");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void modifyingUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("User2");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User2");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
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
	public static void loginAsUser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user2");
			oBrowser.findElement(By.name("pwd")).sendKeys("User2");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	public static void creatingUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user3");
			oBrowser.findElement(By.name("lastName")).sendKeys("sg3");
			oBrowser.findElement(By.name("email")).sendKeys("email3@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("user3");
			oBrowser.findElement(By.name("password")).sendKeys("user3");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user3");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void logout2()
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
	public static void LoginAsAdmin()
	{
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
	}
	public static void ChangingPassWordForUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("User1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User1");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void logout3()
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
	public static void LoginAsUser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user1");
			oBrowser.findElement(By.name("pwd")).sendKeys("User1");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void logout4()
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
	public static void loginAsUser2Again()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user2");
			oBrowser.findElement(By.name("pwd")).sendKeys("User2");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	public static void deletingUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")).click();
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
	public static void logout5()
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
	public static void loginAsUser1again()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user1");
			oBrowser.findElement(By.name("pwd")).sendKeys("User1");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	public static void DeletingUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
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
	public static void logout6()
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
	public static void LoginAsAdminAgain()
	{
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
	}
	public static void DelitingUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")).click();
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
	public static void logout7()
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
}
