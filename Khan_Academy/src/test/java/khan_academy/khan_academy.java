package khan_academy;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class khan_academy {
AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void BT() throws MalformedURLException
	{
    DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "9tnrzhljmzkbsgif");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "org.khanacademy.android");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "org.khanacademy.android.ui.library.MainActivity");
		//dc.setCapability("appium:chromeOptions", ImmutableMap.of("w3c",false));
		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	
	}
	
	@Test(enabled = true,priority=1)
	public void signin() throws InterruptedException
	{
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sign in\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Continue with Google\")")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.id("com.google.android.gms:id/account_display_name")).click();
		Thread.sleep(3000);
	   }
		
		@Test(enabled = true,priority=2)
		public void settings() throws InterruptedException  {
			
		driver.findElement(MobileBy.className("android.widget.ImageView")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Download settings\")")).click();
		driver.findElements(MobileBy.className("android.widget.Switch")).get(0).click();
		driver.navigate().back();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
			
			
		}
		 
	
	@Test(enabled = true,priority=3)
	public void select_lang() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("text(\"Select language\")").click();
		driver.findElement(MobileBy.className("android.view.ViewGroup")).click();
		
		driver.navigate().back();
		driver.navigate().back();
		
		
	}
	
	
	@Test(enabled = true,priority=4)
	public void computing_share() throws InterruptedException
	{
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Explore\")")).click();
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Computing\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Computer science\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Cryptography\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"What is cryptography?\")")).click();
		Thread.sleep(3000);
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(1).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Slack\")")).click();
		driver.findElement(MobileBy.id("com.Slack:id/channel_name")).click();	
		Thread.sleep(3000);
		driver.findElement(MobileBy.id("com.Slack:id/multi_select_view")).sendKeys("Alok Kumar");
		Thread.sleep(3000);
		driver.findElement(MobileBy.id("com.Slack:id/sk_list_user_view")).click();	
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Upload")).click();
		

		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		
	}
	@Test(enabled = true,priority=5)
	public void economics_bookmarks() throws InterruptedException
	{
		
	
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Explore\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Economics\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Microeconomics\")")).click();
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Supply, demand, and market equilibrium\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Law of demand\")")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.className("android.widget.ImageView")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"GO TO BOOKMARKS\")")).click();
		
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		driver.pressKey(new KeyEvent(AndroidKey.HOME));

		
	}

}
