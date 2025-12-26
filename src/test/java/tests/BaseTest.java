package tests;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://academybugs.com");
        System.out.println("Chrome browser launched successfully");
    }
    protected void takeScreenshot(String fileName) {

        // Folder path
        String folderPath = "C:\\Users\\amrit\\eclipse-workspace\\MainProject\\screenshots";

        // Ensure folder exists
        File destDir = new File(folderPath);
        if (!destDir.exists()) {
            destDir.mkdirs();
        }

        // Timestamp (to avoid overwrite)
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        // Take screenshot
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File(destDir, fileName + "_" + timestamp + ".png");

        try {
            FileUtils.copyFile(src, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
