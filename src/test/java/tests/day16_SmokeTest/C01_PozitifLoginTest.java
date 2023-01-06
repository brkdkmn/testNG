package tests.day16_SmokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_PozitifLoginTest{

        @Test
        public void pozitifLogonTest(){

                //qualiytdemy anasayfaya git
                Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

                QualitydemyPage qualitydemyPage=new QualitydemyPage();
                qualitydemyPage.ilkLoginLinki.click();

                qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
                qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));


                qualitydemyPage.loginButonu.click();
                qualitydemyPage.cookiesAccept.click();
                ReusableMethods.bekle(2);

                Assert.assertTrue(qualitydemyPage.basariliGirisCources.isDisplayed());

        }
}
