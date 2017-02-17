package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mboychuk on 2/17/2017.
 */
public class HomePage {

    @FindBy(xpath = "//div[@class='mainbody']/ul/li[1]/a")
    public WebElement linkChapter1;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
