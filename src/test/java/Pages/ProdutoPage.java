package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.clicar;

public class ProdutoPage extends RunCucumberTest {

    @FindBy(css = "div > div.cart-item__quantity > div > quantity-input > button:nth-child(3)")
    private WebElement btnAddQuantidade;

    @FindBy(id = "_rsi-buy-now-button")
    private WebElement btnComprarAhora;

    public ProdutoPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void clicarBtnAddQuantidade() {
        clicar(btnAddQuantidade);
    }

    public void clicarBtnComprarAhora() {
        clicar(btnComprarAhora);
    }
}