package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualitydemyPage {

   public QualitydemyPage(){
       PageFactory.initElements(Driver.getDriver(),this);
   }

   @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkLoginLinki;
   @FindBy(id="login-email")
    public WebElement kullaniciEmailKutusu;
    @FindBy(id="login-password")
    public WebElement passwordKutusu;
    @FindBy(xpath="//a[@class='btn btn-sign-in-simple']")
    public WebElement loginButonu;
    @FindBy(linkText="My cources")
    public WebElement basariliGirisCources;

}
