package StepDefinitions;

import PageFactory.CheckOutPage;
import PageFactory.HomePage;
import PageFactory.LoginPage;
import Utiles.ConfigReader;
import Utiles.ElementUtiles;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ScenarioPassant {
    WebDriver driver;
    LoginPage login;
    HomePage home;
    CheckOutPage checkout;
    Properties prop;
    ConfigReader site;
    ElementUtiles methode;

    @Given("Je me rends sur le site SwagLabs")
    public void je_me_rends_sur_le_site_swag_labs() {
        driver=new FirefoxDriver();
        methode=new ElementUtiles(driver);

        site=new ConfigReader();
        prop=site.ConfigurationManager();

        login=new LoginPage(driver);
        home=new HomePage(driver);
        checkout=new CheckOutPage(driver);
        driver.get(site.geturl());
        driver.manage().window().maximize();
    }
    @When("Je saisie le username")
    public void je_saisie_le_username() {
        login.saisirleUserName(site.getusername());
    }
    @And("Je saisie le password")
    public void je_saisie_le_password() {
        login.saisirlePasseWord(site.getpassword());
    }
    @And("Je clique sur le bouton Login")
    public void je_clique_sur_le_bouton_login() {
        login.cliquerSurleBoutonLogin();
    }
    @Then("La page des produit s affichent")
    public void la_page_des_produit_s_affichent() {
        methode.confirmation("https://www.saucedemo.com/inventory.html");

    }
    @When("Je clique sur le bouton Add to cart du produit BackPack")
    public void je_clique_sur_le_bouton_add_to_cart_du_produit_back_pack() {
        methode=new ElementUtiles(driver);
        home.cliquersurleBoutonAddBackpack();

    }
    @And("Je clique sur le bouton Add to cart du produit T-Shirt")
    public void je_clique_sur_le_bouton_add_to_cart_du_produit_t_shirt() {
        home.cliquersurleBoutonAddTshirt();

    }
    @Then("Les produit s ajoutent dans le panier")
    public void les_produit_s_ajoutent_dans_le_panier() {
        methode=new ElementUtiles(driver);
        methode.recherche("Remove");
    }
    @When("Je clique sur l icone panier")
    public void je_clique_sur_l_icone_panier() {
        home.cliquersurleBoutonPanier();
    }
    @And("Je clique sur le bouton remove")
    public void je_clique_sur_le_bouton_remove() {
        checkout.cliquersurleBoutonremoveBackpack();
    }
    @Then("Le produit sera supprimé du panier")
    public void le_produit_sera_supprimé_du_panier() {
        methode=new ElementUtiles(driver);
        methode.recherche("Sauce Labs Backpack");
    }

    @When("Je clique sur le bouton checkout")
    public void je_clique_sur_le_bouton_checkout() throws InterruptedException {

        checkout.cliquersurleBoutonCheckout();
        Thread.sleep(3000);
    }

    @And("Je rempli le username")
    public void je_rempli_le_username() throws InterruptedException {
        Thread.sleep(3000);
        checkout.saisirleFirstName("ismail");
    }

    @And("Je saisie le lastname")
    public void je_saisie_le_lastname() throws InterruptedException {
        Thread.sleep(3000);
        checkout.saisirleLastName("abdallah");
    }

    @And("Je saisie le code postal")
    public void je_saisie_le_code_postal() throws InterruptedException {
        Thread.sleep(3000);
        checkout.saisirleZipcode("2240");
    }

    @And("je clique sur le bouton continue")
    public void je_clique_sur_le_bouton_continue() throws InterruptedException {
        checkout.cliquersurleBoutonContinue();
        Thread.sleep(3000);
    }

    @Then("une page overview s affiche")
    public void une_page_overview_s_affiche() {
        methode=new ElementUtiles(driver);
        methode.recherche("Checkout: Overview");

    }

    @When("je clique sur le bouton finish")
    public void je_clique_sur_le_bouton_finish() {
        checkout.cliquersurleBoutonFinish();
    }

    @Then("une page Checkout:Complete s affiche")
    public void une_page_checkout_complete_s_affiche() {
        methode=new ElementUtiles(driver);
        methode.recherche("Thank you for your order!");

    }
    @When("Je clique sur le menu burger")
    public void je_clique_sur_le_menu_burger() {
        checkout.cliquersurleBoutonBurger();
    }

    @And("Je clique surle bouton Logout")
    public void je_clique_surle_bouton_logout() throws InterruptedException {
        Thread.sleep(3000);
        checkout.cliquersurleboutonLogout();
    }

    @Then("Je me redirige vers la page d authentification {string}")
    public void je_me_redirige_vers_la_page_d_authentification(String string) {
        methode=new ElementUtiles(driver);
        methode.confirmation("https://www.saucedemo.com/");

    }
}
