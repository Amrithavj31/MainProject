package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingTablePage {
	 private WebDriver driver;
	 private WebDriverWait wait;
	 private By dateField=By.xpath("//*[@id=\"rtb-date_root\"]/div");
	 private By timeField=By.xpath("//*[@id=\"rtb-time_root\"]/div");
	 private By partyField=By.xpath("//*[@id=\"rtb-party\"]");
	 private By nameField=By.xpath("//*[@id=\"rtb-name\"]");
	 private By emailField=By.xpath("//*[@id=\"rtb-email\"]");
	 private By phoneField=By.xpath("//*[@id=\"rtb-phone\"]");
	 private By addMessageLink=By.xpath("//*[@id=\"post-4251\"]/div/div/form/fieldset[2]/div[4]/a");
	 private By bookingButtonField=By.xpath("//*[@id=\"academy-booking-submit\"]");
	 private By messageField=By.xpath("//*[@id=\"rtb-message\"]");
	 
    public BookingTablePage(WebDriver driver) {
		  this.driver = driver;
		  this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  }
	  
	
	 public String fillBookingTableForm(String name,String email,String phone,String message) {
			driver.navigate().to("https://academybugs.com/account/?ec_page=register");
			WebElement nameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(nameField));
			
			nameInput.clear();
			nameInput.sendKeys(name);
			
			driver.findElement(emailField).clear();
			driver.findElement(emailField).sendKeys(email);
			
			driver.findElement(phoneField).clear();
			driver.findElement(phoneField).sendKeys(phone);
			
			driver.findElement(messageField).clear();
			driver.findElement(messageField).sendKeys(message);
			
			String url=driver.getCurrentUrl();
			return url;
		}
	 public void clickSend() {
	        driver.findElement(bookingButtonField).click();
	 }
}
