package pages.stackoverflowMapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageStack {
    private WebDriver driver;

    public MainPageStack(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='bounty-indicator-tab'][text()>300]")
    public WebElement Fea_less_than_300;

    @FindBy(xpath = "//a[@class='question-hyperlink'][1]")
    public WebElement money;


}

