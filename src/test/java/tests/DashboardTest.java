package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DashboardPage;

public class DashboardTest extends BaseTest {
	 @Test
	 public void typeOfBugs() {
	        driver.get("https://academybugs.com/types/");
	        String title = driver.getTitle();
	        Assert.assertTrue(
	                title.contains("Types of Bugs – AcademyBugs.com"),
	                "The page title does not contain 'Types of Bugs – AcademyBugs.com'. Actual title: " + title
	        );

	        System.out.println("Test case: Successfully redirected into Type of Bugs link");
	    }
	@Test
    public void findBugs() {
        driver.get("https://academybugs.com/find-bugs/");
        String title = driver.getTitle();
        Assert.assertTrue(
                title.contains("Find Bugs – AcademyBugs.com"),
                "The page title does not contain 'Find Bugs – AcademyBugs.com'. Actual title: " + title
        );

        System.out.println("Test case: Successfully redirected into Find bugs link");
    }
	@Test
    public void reportBugs() {
        driver.get("https://academybugs.com/report-bugs/");
        String title = driver.getTitle();
        Assert.assertTrue(
                title.contains("Report Bugs – AcademyBugs.com"),
                "The page title does not contain 'Report Bugs – AcademyBugs.com'. Actual title: " + title
        );

        System.out.println("Test case: Successfully redirected into Report Bug link");
    }
	@Test
    public void socialShareLink() {
		driver.get("https://academybugs.com/");
        DashboardPage dashboard = new DashboardPage(driver);
        int valid=dashboard.socialShare();
        Assert.assertTrue(valid > 0, 
                "Test Failed: social share element NOT found on the page!");

        // If assertion passes
        System.out.println("Successfully redirected!!! - Social share element exists.");
       
    }
	@Test
    public void sendButtonLink() {
		driver.get("https://academybugs.com/");
        DashboardPage dashboard = new DashboardPage(driver);
        int valid=dashboard.sendButtonBug();
        Assert.assertTrue(valid > 0, 
                "Test Failed: send button element NOT found on the page!");

        // If assertion passes
        System.out.println("Successfully redirected!!! - send button element exists.");
    }
	@Test
    public void videoPlayer() {
		driver.get("https://academybugs.com/");
        DashboardPage dashboard = new DashboardPage(driver);
        int valid=dashboard.sendButtonBug();
        Assert.assertTrue(valid > 0, 
                "Test Failed: video link element NOT found on the page!");

        // If assertion passes
        System.out.println("Successfully redirected!!! -  video linke element exists.");
    }
	@Test
    public void articlesBug() {
		driver.get("https://academybugs.com/");
        DashboardPage dashboard = new DashboardPage(driver);
        int valid=dashboard.articlesBug();
        Assert.assertTrue(valid > 0, 
                "Test Failed: video link element NOT found on the page!");

        // If assertion passes
        System.out.println("Successfully redirected!!! -  video linke element exists.");
    }
	@Test
    public void searchButton() {
		driver.get("https://academybugs.com/");
        DashboardPage dashboard = new DashboardPage(driver);
        int valid=dashboard.searchBug();
        Assert.assertTrue(valid > 0, 
                "Test Failed: search button element NOT found on the page!");

        // If assertion passes
        System.out.println("Successfully redirected!!! - search button link element exists.");
    }
	@Test
    public void bookingTable() {
		driver.get("https://academybugs.com/");
        DashboardPage dashboard = new DashboardPage(driver);
        int valid=dashboard.bookingBug();
        Assert.assertTrue(valid > 0, 
                "Test Failed: booking table element NOT found on the page!");

        // If assertion passes
        System.out.println("Successfully redirected!!! - booking table link element exists.");
    }
	@Test
    public void helpLink() {
		driver.get("https://academybugs.com/");
        DashboardPage dashboard = new DashboardPage(driver);
        int valid=dashboard.helpLink();
        Assert.assertTrue(valid > 0, 
                "Test Failed: help link button element NOT found on the page!");

        // If assertion passes
        System.out.println("Successfully redirected!!! - help link element exists.");
    }
	  
}
