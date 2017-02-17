package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mboychuk on 2/17/2017.
 */
public class Chapter1Page {

    @FindBy(xpath = "//div[@class='mainbody']/p[4]/a")
    public WebElement linkHome;

    @FindBy(id = "divontheleft")
    public WebElement assertText;

    public Chapter1Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
