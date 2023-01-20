package tests.practice;

import org.testng.annotations.Test;
import pages.US31Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US31 extends TestBaseRapor {



    US31Page brk=new US31Page();

    @Test
    public void test31(){
        extentTest=extentReports.createTest("course_form/add_course","Sonuçlar bölümünde" +
                " + , - butonu çalışıyor olmalı");
        extentTest.info("Qualitydemy anasayfaya gider");
        // -Launch browser
        //-Go to url 'https://qa.qualitydemy.com/'
        Driver.getDriver().get(ConfigReader.getProperty("qaUrl"));
        //-Click on 'Login' link
        extentTest.info("ilk giris login linkine tiklar");
        brk.girisIlkLoginLink.click();
        //Acept Cookies
        extentTest.info("cookie tiklar");
        brk.girisCookieLink.click();
        ReusableMethods.bekle(2);
        //-Enter correct instructor email address and password
        extentTest.info("Dogru email ve sifreyi girer");
        brk.girisEmailBox.sendKeys(ConfigReader.getProperty("qaEmail"));
        brk.girisPasswordBox.sendKeys(ConfigReader.getProperty("qaPassword"));
        //-Click the "login" button
        extentTest.info("giris login linkine tiklar");
        brk.girisLoginLink.click();
        ReusableMethods.bekle(2);
        //-Click  "Instructor" link
        extentTest.info("anasayfadaki instructor linkine tiklar");
        brk.instructorLink.click();
        ReusableMethods.bekle(2);
        //-Click  “Course manager” option
        extentTest.info("Course manager secenegine tiklar");
        brk.courseManagerElement.click();
        ReusableMethods.bekle(2);
        //-Click  “Add new course” link
        extentTest.info("Add new course linkine tiklar");
        brk.addNewCourseLink.click();
        ReusableMethods.bekle(2);
        //-Click  "Outcomes "link
        extentTest.info("Outcomes linkine tiklar");
        brk.outcomesLink.click();
        ReusableMethods.bekle(2);
        //-Check if there is a course on the outcomes list. If not, add new course
        extentTest.info("kurs ekler");
        brk.artiOutcomesTextBox.sendKeys("QA TESTER COURSE");
        ReusableMethods.bekle(2);
        extentTest.info("arti ikonuna tiklar");
        //-Click the "+" button
        extentTest.info("arti ikonuna tiklar");
        brk.artiButton.click();
        ReusableMethods.bekle(2);
        //-Check if there is a course on the outcomes list. If not, add new course
        extentTest.info("kurs ekler");
        brk.eksiOutcomesTextBox.sendKeys("AWS DEVOPS COURSE");
        ReusableMethods.bekle(2);
        //-Click the "-" button
        extentTest.info("eksi iconuna tiklar");
        brk.eksiButton.click();

        Driver.closeDriver();


    }

}
