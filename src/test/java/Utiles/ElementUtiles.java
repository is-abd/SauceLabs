package Utiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class ElementUtiles {
    WebDriver driver;
    public ElementUtiles(WebDriver driver){
        this.driver=driver;

    }
    public void confirmation(String lien){
        String actualurl= lien;
        String expectedurl= driver.getCurrentUrl();
        Assert.assertEquals(actualurl,expectedurl);
    }
    public void recherche(String message){
        String pagecontent1 = driver.findElement(By.tagName("html")).getText();
        List<String> motrecherche1=new ArrayList<>();
        motrecherche1.add(message);
        for (String mot : motrecherche1) {
            if (pagecontent1.contains(mot)) {
                System.out.println("le mot " + mot + "  existe sur la page");
            } else {
                System.out.println("le mot " + mot + " n'existe pas sur la page");
            }
        }

    }
}
