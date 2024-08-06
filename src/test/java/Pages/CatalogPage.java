package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.clicar;

public class CatalogPage extends RunCucumberTest {

    @FindBy(css = "#product-grid > li:nth-child(4) > div > div > div > div.flex.flex-col.gap-1 > a")
    private WebElement btnProduto;

    @FindBy(css = "#product-grid > li:nth-child(4) > div > div > div > div.flex.flex-col.gap-1 > a")
    private WebElement btnItem;

    public CatalogPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void clicarBtnProduto() {
        clicar(btnProduto);
    }

    public void clicarBtnItem() {
        clicar(btnItem);
    }
}

