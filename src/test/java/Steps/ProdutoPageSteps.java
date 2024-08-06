package Steps;

import Pages.ProdutoPage;
import io.cucumber.java.en.Then;

public class ProdutoPageSteps {

    private ProdutoPage produtoPage = new ProdutoPage();

    @Then("clico no botao COMPRAR AHORA")
    public void clicoNoBotaoCOMPRARAHORA() {
        produtoPage.clicarBtnComprarAhora();
    }
}