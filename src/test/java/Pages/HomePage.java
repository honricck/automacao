package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.clicar;

public class HomePage extends RunCucumberTest {

    @FindBy(css = "div > div > div.items-center.w-full.justify-end.hidden.md//:flex > nav > a:nth-child(2)")
    private static WebElement btnCatalog;


    public HomePage() {
        PageFactory.initElements(getDriver(), this);
    }

    public static void clicarbtnCatalog() {
        clicar(btnCatalog);
    }

}