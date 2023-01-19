package tests.practice;

import org.testng.annotations.Test;
import pages.US31Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US31 {

    US31Page brk=new US31Page();

    @Test
    public void test31(){

        // -Launch browser
        //-Go to url 'https://qa.qualitydemy.com/'
        Driver.getDriver().get(ConfigReader.getProperty("qaUrl"));
        //-Click on 'Login' link
        brk.girisIlkLoginLink.click();
        //Acept Cookies
        brk.girisCookieLink.click();
        ReusableMethods.bekle(2);
        //-Enter correct instructor email address and password
        brk.girisEmailBox.sendKeys(ConfigReader.getProperty("qaEmail"));
        brk.girisPasswordBox.sendKeys(ConfigReader.getProperty("qaPassword"));
        //-Click the "login" button
        brk.girisLoginLink.click();
        ReusableMethods.bekle(2);
        //-Click  "Instructor" link
        brk.instructorLink.click();
        ReusableMethods.bekle(2);
        //-Click  “Course manager” option
        brk.courseManagerElement.click();
        ReusableMethods.bekle(2);
        //-Click  “Add new course” link
        brk.addNewCourseLink.click();
        ReusableMethods.bekle(2);
        //-Click  "Outcomes "link
        brk.outcomesLink.click();
        ReusableMethods.bekle(2);
        //-Check if there is a course on the outcomes list. If not, add new course
        brk.artiOutcomesTextBox.sendKeys("QA TESTER COURSE");
        ReusableMethods.bekle(2);
        //-Click the "+" button
        brk.artiButton.click();
        ReusableMethods.bekle(2);
        //-Check if there is a course on the outcomes list. If not, add new course
        brk.eksiOutcomesTextBox.sendKeys("AWS DEVOPS COURSE");
        ReusableMethods.bekle(2);
        //-Click the "-" button
        brk.eksiButton.click();

        Driver.closeDriver();


    }

}
