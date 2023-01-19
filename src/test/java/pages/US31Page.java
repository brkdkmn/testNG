package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US31Page {

   public US31Page(){

       PageFactory.initElements(Driver.getDriver(),this);
   }

   @FindBy(xpath = "//*[text()='Log in']")
   public WebElement girisIlkLoginLink;

   @FindBy(xpath = "//*[text()='Accept']")
   public WebElement girisCookieLink;

   @FindBy(xpath = "//input[@id='login-email']")
   public WebElement girisEmailBox;

   @FindBy(xpath = "//input[@id='login-password']")
   public WebElement girisPasswordBox;

   @FindBy(xpath = "//button[text()='Login']")
   public WebElement girisLoginLink;

   @FindBy(xpath = "//*[text()='Instructor']")
   public WebElement instructorLink;

   @FindBy(xpath = "//*[text()='Course manager']")
   public WebElement courseManagerElement;

   @FindBy(xpath = "//*[text()='Add new course']")
   public WebElement addNewCourseLink;

   @FindBy(xpath = "//i[@class='mdi mdi-camera-control']")
   public WebElement outcomesLink;

   @FindBy(xpath = "(//input[@placeholder='Provide outcomes'])[1]")
   public WebElement artiOutcomesTextBox;

   @FindBy(xpath = "//button[@onclick='appendOutcome()']")
   public WebElement artiButton;

   @FindBy(xpath = "(//input[@placeholder='Provide outcomes'])[3]")
   public WebElement eksiOutcomesTextBox;

   @FindBy(xpath = "(//button[@onclick='removeOutcome(this)'])[2]")
   public WebElement eksiButton;
}
