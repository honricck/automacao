package Steps;

import Pages.CatalogPage;
import io.cucumber.java.en.And;


public class CatalogPageSteps {

    private CatalogPage catalogPage = new CatalogPage();

    @And("seleciono o produto COMBO Invictus Rabanne, Bleu Chanel y Sauvage Dior")
    public void selecionoOProdutoCOMBOInvictusRabanneBleuChanelYSauvageDior() {
        catalogPage.clicarBtnProduto(); // Certifique-se de que o nome está correto
    }

    @And("adiciono duas quantidades")
    public void adicionoDuasQuantidades() {
        catalogPage.clicarBtnItem(); // Certifique-se de que o nome está correto
    }
}
