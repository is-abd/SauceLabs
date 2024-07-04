package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement removeBackpackBouton;
    @FindBy(id = "remove-sauce-labs-bolt-t-shirt")
    WebElement removeTshirtBouton;
    @FindBy(id = "checkout")
    WebElement checkoutBouton;
    @FindBy(id = "first-name")
    WebElement champFirstName;
    @FindBy(id="last-name")
    WebElement champLastName;
    @FindBy(id = "postal-code")
    WebElement champZipCode;
    @FindBy(id = "continue")
    WebElement continueBouton;
    @FindBy(id = "finish")
    WebElement finishBouton;
    @FindBy(id = "react-burger-menu-btn")
     WebElement burgerBouton;
    @FindBy(id = "logout_sidebar_link")
     WebElement logoutBouton;

    WebDriver driver;
    public CheckOutPage(WebDriver driver){
        this.driver= driver ;
        PageFactory.initElements(driver,this);
    }
    public void cliquersurleBoutonremoveBackpack(){
        removeBackpackBouton.click();
    }
    public void cliquersurleboutonremoveTshirt(){
        removeTshirtBouton.click();
    }
    public void cliquersurleBoutonCheckout(){
        checkoutBouton.click();
    }
    public void saisirleFirstName(String FirstName){
        champFirstName.sendKeys(FirstName);
    }
    public void saisirleLastName(String LastName){
        champLastName.sendKeys(LastName);
    }
    public void saisirleZipcode(String Zipcode){
        champZipCode.sendKeys(Zipcode);
    }
    public void cliquersurleBoutonContinue(){
        continueBouton.click();
    }
    public void cliquersurleBoutonFinish(){
        finishBouton.click();
    }
    public void cliquersurleBoutonBurger(){
        burgerBouton.click();
    }
    public void cliquersurleboutonLogout(){
        logoutBouton.click();
    }


}
