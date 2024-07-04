package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement AddBackpackBouton;
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement AddTshirtBouton;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[1]/div[3]/a")
    WebElement panierBouton;

    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver= driver ;
        PageFactory.initElements(driver,this);
    }
    public void cliquersurleBoutonAddBackpack(){
        AddBackpackBouton.click();
    }
    public void cliquersurleBoutonAddTshirt(){
        AddTshirtBouton.click();
    }
    public void cliquersurleBoutonPanier(){
        panierBouton.click();
    }


}

