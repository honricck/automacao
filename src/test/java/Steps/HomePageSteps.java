package Steps;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import static Runners.RunnerBase.getDriver;

public class HomePageSteps {
Pages.HomePage HomePage = new HomePage();

    @Given("clico em Catalog")
    public void clicoEmCatalog(){
        getDriver().get("https://fullthings.co");
        Pages.HomePage.clicarbtnCatalog();
    }
}


