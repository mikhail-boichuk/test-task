package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.Chapter1Page;

import java.util.concurrent.TimeUnit;

/**
 * Created by mboychuk on 2/17/2017.
 */
public class testChapter1 {

    private static WebDriver driver;

    @BeforeClass(groups = "webUI")
    public static void startChrome() {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\mboychuk\\IdeaProjects\\test-task\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--test-type");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-extensions");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://book.theautomatedtester.co.uk/");
    }

    @Test(groups = "webUI")
    public void checkChapter1 () {
        String textToFind = "Assert that this text is on the page";
        HomePage home = new HomePage(driver);

        home.linkChapter1.click();
        Assert.assertTrue(driver.findElement(By.id("divontheleft")).getText().contains(textToFind), "Text not found!");

        Chapter1Page chapter = new Chapter1Page(driver);
        chapter.linkHome.click();

        System.out.println("Test passed!");
    }

    @AfterClass(groups = "webUI")
    public static void closeChrome() {
        driver.quit();
    }

}
