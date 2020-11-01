package com.MakemyTripHotelBooking;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class makemytriphotelbooking {


	static WebDriver driver;

	public  void initDriver() {
		
   System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
    driver = new ChromeDriver();
	driver.get("http://makemytrip.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}
	public static  String login() {
       driver.findElement(By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser']")).click();
       driver.findElement(By.id("username")).sendKeys("xxxxxxxxxxxxx@gmail.com");
       driver.findElement(By.xpath("//button[@class='capText font16']")).click();
       driver.findElement(By.id("password")).sendKeys("Password@123");
       driver.findElement(By.xpath("//button[@class='capText font16']")).click();
       driver.findElement(By.id("otp")).click();
       driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
      
       driver.findElement(By.xpath("//button[@class='capText font16']")).click();
System.out.println(driver.getTitle());
    	return driver.getTitle();
    	
    	}
	
	public static String hotelBookingSearch() throws InterruptedException {
		
				
		 driver.findElement(By.xpath("//div[@class='loginModal displayBlock modalLogin dynHeight personal ']")).click();
		
		// driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='webklipper-publisher-widget-container-notification-frame']")));
		// driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
		 Thread.sleep(6000);
		 driver.switchTo().parentFrame();
		 driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chHotels']")).click();
		// driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	//	 driver.findElement(By.xpath("//input[@class='lbl_input latoBold  appendBottom5']")).click();
		 driver.findElement(By.id("city")).click();
		 driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("Bengaluru, Karnataka, India"); 
		 driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();
	//	 driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys(Keys.ARROW_DOWN, Keys.RETURN);
	//	 driver.findElement(By.xpath("(//p[@class='blackText font20 code'])[1]")).click();
		 driver.findElement(By.xpath("(//div[@class='DayPicker-Day DayPicker-Day--today']/following-sibling::div)[1]")).click();
		 driver.findElement(By.xpath("//span[@class='selectedDateField appendBottom8 pointer']")).click();
		 driver.findElement(By.xpath("(//div[@class='DayPicker-Day DayPicker-Day--today']/following-sibling::div)[2]")).click();
		 driver.findElement(By.id("guest")).click();
		 driver.findElement(By.xpath("(//ul[@class='guestCounter font12 darkText'])[1]//li[3]")).click();
		 driver.findElement(By.xpath("//button[@class='primaryBtn btnApply']")).click();
		
	
		 return driver.getTitle();
	}
	public static String hotelBookingFilter() {
	 driver.findElement(By.xpath("//button[@class='primaryBtn font24 latoBold widgetSearchBtn']")).click();
	 driver.findElement(By.xpath("(//ul[@class='filterList'])[1]//li[3]")).click();
	// driver.findElement(By.xpath("(//ul[@class='filterList'])[3]//li[1]")).click();
	// driver.findElement(By.xpath("(//ul[@class='filterList'])[4]//li[2]")).click();
	// driver.findElement(By.xpath("(//ul[@class='filterList'])[5]//li[2]")).click();
	 return driver.getTitle();
	}
	public static  String hotelBookingSelectHotel() {
	driver.findElement(By.xpath("(//p[@id='hlistpg_hotel_shown_price'])[1]")).click();
	ArrayList<String> allWindows = new ArrayList<String> (driver.getWindowHandles()); 
	 
	driver.switchTo().window(allWindows.get(1)); 
	driver.findElement(By.xpath("//a[@class='primaryBtn ']")).click();
	return driver.getTitle();
	}
	public static  String hotelBookingPersonalDetailsl() {
	driver.findElement(By.xpath("//span[@class='close']")).click();
	driver.findElement(By.xpath("//select[@id='title']//option[2]")).click();
	driver.findElement(By.xpath("//input[@id='fName']")).sendKeys("Anna");
	driver.findElement(By.xpath("//input[@id='lName']")).sendKeys("Thomas");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("antonyjoshymanalil3g@gmail.com");
	driver.findElement(By.xpath("//input[@id='mNo']")).sendKeys("9495226982");
	driver.findElement(By.xpath("//a[@class='primaryBtn btnPayNow']")).click();
	return driver.getTitle();
	}
	public static  String hotelBookingPaymentDetails() throws InterruptedException {
		 Thread.sleep(6000);
	//driver.findElement(By.xpath("(//span[@class='option_txt lato-regular'])[7]")).click();
	//	 driver.switchTo().frame("destination_publishing_iframe_makemytrip_0");
		driver.findElement(By.xpath("//*[@id='PAYMENT_inputVpa']")).click();
	driver.findElement(By.xpath("(//*[@id='PAYMENT_inputVpa'])")).sendKeys("6868");
	driver.findElement(By.xpath("//span[@id='makePaymentButton']")).click();
			return driver.getTitle();
	}
}
