package tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.SocialSharePage;

public class SocialShareTest extends BaseTest {
	private SocialSharePage socialShare;
	 @BeforeMethod
	    public void initPage() {
	        socialShare = new SocialSharePage(driver);
	    }
	 @Test(priority=1)
	 public void verifySocialTabRedirection() {
		 String url = socialShare.clickSocialTab();
		 Assert.assertTrue(url.contains("https://academybugs.com/#"), "Social tab retrieved successfully");
		 System.out.println("Test case : Social share tab retrieved successfully");
	 }
	 public void verifyArticlesListLinkRedirection() {
	     socialShare.clickArticlesListLinkAndGetURL();
	     String title = driver.getTitle();
	     Assert.assertTrue(title.contains("AcademyBugs.com"), "Articles  opened");
	     System.out.println("Test case : Articles list  tab retrieved successfully");
	 }
	 @Test(priority=2)
	 public void verifySocialSharePopupIsDisplayed() {
	     socialShare.isPopupDisplayed();
	     Assert.assertTrue(socialShare.isPopupDisplayed(),"Popup is not displayed after clicking social share tab");
	     System.out.println("Test case : Social share pop up retrieved successfully");
	 }
	 @Test(priority=3)
	 public void verifyArticleListRedirection() {
	     String title= socialShare.clickArticlesListLinkAndGetURL();
	     System.out.println("artilce title  "+title);
	     Assert.assertTrue(title.contains("AcademyBugs.com"),"Articles link redirected");
	     System.out.println("Test case : Article list tab retrieved successfully");
		
	 }
	 @Test(priority=4)
	 public void verifyReadMoreRedirection() {
		 driver.navigate().to("https://academybugs.com/articles/");
	     String title= socialShare.clickReadMoreLink();
	     Assert.assertTrue(title.contains("Page not found"),"Readmore link  redirected");
	     System.out.println("Test case : Read more link retrieved successfully");
	 }
	 @Test(priority=5)
	 public void verifyBrochureLinkRedirection() {
		 driver.navigate().to("https://academybugs.com/articles/");
		 String title = socialShare.clickBrochureLink();
		 Assert.assertTrue(title.contains("Brochure"));
		 System.out.println("Test case : Brochure link  retrieved successfully");
	 }
	 @Test(priority=6)
	 public void verifyVisitingCardLinkRedirection() {
		 driver.navigate().to("https://academybugs.com/articles/");
		 String title = socialShare.clickVisitingCardLink();
		 System.out.println("title brochure"+title);
		 Assert.assertTrue(title.contains("Visiting"));
		 System.out.println("Test case : Visiting card link retrieved successfully");
	 }
	 @Test(priority=7)
	 public void verifyWebsiteLinkRedirection() {
		 driver.navigate().to("https://academybugs.com/articles/");
		 String title = socialShare.clickWebsiteLink();
		 System.out.println("title brochure"+title);
		 Assert.assertTrue(title.contains("Websites"));
		 System.out.println("Test case : Website link retrieved successfully");
	 }
	
	 @Test(priority=8)
	 public void verifyLogoLinkRedirection() {
		 driver.navigate().to("https://academybugs.com/articles/");
		 String title = socialShare.clickLogoLink();
		 System.out.println("title brochure"+title);
		 Assert.assertTrue(title.contains("Visiting"));
		 System.out.println("Test case : Logo link retrieved successfully");
	 }
	 @Test(priority=9)
	 public void verifyMaintenanceLinkRedirection() {
		 driver.navigate().to("https://academybugs.com/articles/");
		 String title = socialShare.clickMaintenanceLink();
		 Assert.assertTrue(title.contains("Maintenance"));
		 System.out.println("Test case : Maintenance link retrieved successfully");
	 }
	 @Test(priority=10)
	 public void verifyGraphicsLinkRedirection() {
		 driver.navigate().to("https://academybugs.com/articles/");
		 String title = socialShare.clickGraphicsLink();
		 Assert.assertTrue(title.contains("Graphics"));
		 System.out.println("Test case : Graphics link retrieved successfully");
	 }
	 @Test(priority=11)
	 public void verifyHolidayLinkRedirection() {
		 driver.navigate().to("https://academybugs.com/articles/");
		 String title = socialShare.clickHolidayLink();
		 Assert.assertTrue(title.contains("Holiday"));
		 System.out.println("Test case : Holiday link retrieved successfully");
	 }
	 @Test(priority=12)
	 public void verifyHouseLinkRedirection() {
		 driver.navigate().to("https://academybugs.com/articles/");
		 String title = socialShare.clickHouseLink();
		 Assert.assertTrue(title.contains("House"));
		 System.out.println("Test case : House link retrieved successfully");
	 }
	 @Test(priority=13)
	 public void verifyDateLinkRedirection() {
		 driver.navigate().to("https://academybugs.com/articles/");
		 String title = socialShare.clickDateLink();
		 Assert.assertTrue(title.contains("Why Do I Need To Use Financial Consulting Service?"));
		 System.out.println("Test case : Date link retrieved successfully");
	 }
	 @Test(priority=14)
	 public void verifyEmailLinkRedirection() {
		 driver.navigate().to("https://academybugs.com/articles/");
		 String title = socialShare.clickEmailLink();
		 Assert.assertTrue(title.contains("Email"));
		 System.out.println("Test case : Email link retrieved successfully");
	 }
	 @Test(priority=15)
	 public void verifyFacebookLinkRedirection() {
		 driver.navigate().to("https://academybugs.com/articles/");
		 String title = socialShare.clickFacebookLink();
		 Assert.assertTrue(title.contains("Facebook"));
		 System.out.println("Test case : Facebook link  retrieved successfully");
	 }
	 @Test(priority=16)
	 public void verifyTwitterLinkRedirection() {
		 driver.navigate().to("https://academybugs.com/articles/");
		 String title = socialShare.clickTwitterLink();
		 Assert.assertTrue(title.contains("Twitter"));
		 System.out.println("Test case : Twitter link  retrieved successfully");
	 }
	 @Test(priority=17)
	 public void verifyPinterestLinkRedirection() {
		 driver.navigate().to("https://academybugs.com/articles/");
		 String title = socialShare.clickPinterestLink();
		 Assert.assertTrue(title.contains("Pinterest"));
		 System.out.println("Test case : Pinterest link  retrieved successfully");
	 }
	 @Test(priority=18)
	 public void verifyTravelLinkRedirection() {
		 driver.navigate().to("https://academybugs.com/articles/");
		 String title = socialShare.clickTravelLink();
		 Assert.assertTrue(title.contains("Travel"));
		 System.out.println("Test case : Pinterest link  retrieved successfully");
	 }
	 @Test(priority=19)
	 public void verifyPensionLinkRedirection() {
		 driver.navigate().to("https://academybugs.com/articles/");
		 String title = socialShare.clickPensionLink();
		 Assert.assertTrue(title.contains("Pension"));
		 System.out.println("Test case : Pension link  retrieved successfully");
	 }
	 @Test(priority=20)
	 public void verifyCloseButtonLinkRedirection() {
		 String title= socialShare.clickCloseButtonLink();
		 Assert.assertTrue(title.contains("AcademyBugs.com"));
		 System.out.println("Test case : Close button link closed successfully");
	 }
	  @AfterTest
	  public void tearDownTest() {
	      driver.quit();
	  }
}
