package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "user-name")
    WebElement champUserName;
    @FindBy(id = "password")
    WebElement champPasseWord;
    @FindBy(id = "login-button")
    WebElement LoginBouton;

    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver= driver ;
        PageFactory.initElements(driver,this);
    }
    public void saisirleUserName(String UserName){
        champUserName.sendKeys(UserName);
    }
    public void saisirlePasseWord(String Passeword){
        champPasseWord.sendKeys(Passeword);
    }
    public void cliquerSurleBoutonLogin(){
        LoginBouton.click();
    }


}
