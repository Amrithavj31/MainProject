package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {

    private WebDriver driver;
    private By articlesField=By.xpath("//p[text()='The articles should show appropriate content, but in this example clicking an article shows an error page.']");
    private By sendButtonLinkField=By.xpath("//h5[text()='Send button returns an error page']");
    private By videoLinkField = By.xpath("//h5[text()='Video player doesn’t work']");
    private By articlesErrorField = By.xpath("//h5[text()='Articles show an error page']");
    private By searchField= By.xpath("//h5[text()='Search button leads to an error']");
    private By bookTableField = By.xpath("//div[@id='popmake-4434']//div[@class='pum-content popmake-content']");
    private By helpLinkField =  By.xpath("//li[@id='menu-item-2363']//a[@href='#']");
    
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }
    public int socialShare() {
    	 List<WebElement> elements = driver.findElements(articlesField);
    	 System.out.println("element length"+elements.size());
         // return true if element exists
         return elements.size();
    }
    public int sendButtonBug() {
   	 List<WebElement> elements = driver.findElements(sendButtonLinkField);
   	 System.out.println("element length"+elements.size());
        // return true if element exists
        return elements.size();
   }
    public int videoLinkBug() {
      	 List<WebElement> elements = driver.findElements(videoLinkField);
      	 System.out.println("element length"+elements.size());
           // return true if element exists
           return elements.size();
     }
    public int articlesBug() {
     	 List<WebElement> elements = driver.findElements(articlesErrorField);
     	 System.out.println("element length"+elements.size());
          // return true if element exists
          return elements.size();
    }
    public int searchBug() {
    	 List<WebElement> elements = driver.findElements(searchField);
    	 System.out.println("element length"+elements.size());
         // return true if element exists
         return elements.size();
   }
   public int bookingBug() {
   	 List<WebElement> elements = driver.findElements(bookTableField);
   	 System.out.println("element length"+elements.size());
        // return true if element exists
        return elements.size();
  }
   public int helpLink() {
	   	 List<WebElement> elements = driver.findElements(helpLinkField);
	   	 System.out.println("element length"+elements.size());
	        // return true if element exists
	        return elements.size();
	  }
}
