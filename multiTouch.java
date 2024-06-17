package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class multiTouch {
	public static AndroidDriver driver;

	  @SuppressWarnings("deprecation")
	    public static void main(String[] args) throws MalformedURLException {
	    	 DesiredCapabilities cap = new DesiredCapabilities();

	         cap.setCapability("deviceName", "a6fuugukwcwseekv");
	         cap.setCapability("platformName", "Android");
	         cap.setCapability("appPackage", "com.android.chrome");
	         cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
	         URL url = new URL("http://127.0.0.1:4723/wd/hub");
	         driver = new AndroidDriver(url, cap);

	         System.out.println("Account verification");
	     	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     	WebElement account = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]"));
	     	account.click();
	     	WebElement accountverify = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button[2]"));
	     	accountverify.click();
	     	WebElement gotit = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]"));
	     	gotit.click();
	     	System.out.println("Chrom browser lauched successfully");
	     	
	    	WebElement enterURL2=driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText"));
	 		enterURL2.sendKeys("https://testautomationpractice.blogspot.com/");
	 		WebElement clickURL = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"));
	 		clickURL.click();
	 		
	    	
	 		//ZoomOut script
	 		MultiTouchAction multiTouch = new MultiTouchAction(driver);

	 	// Define two touch points
	 	PointOption point1 = PointOption.point(100, 200); // First touch point
	 	PointOption point2 = PointOption.point(300, 200); // Second touch point

	 	// Create pinch action (zoom in)
	 	multiTouch.add(new TouchAction(driver).press(point1).moveTo(point2).release());
	 	multiTouch.add(new TouchAction(driver).press(point2).moveTo(point1).release());

	 	// Perform the multi-touch action
	 	multiTouch.perform();
	 		    
	    }

}
