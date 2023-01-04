package tests.day14_testNGFramework;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C05_SoftAssert {

    @Test
    public void test01(){

        //1.adim Softassert objesi olusturmak
        SoftAssert softAssert=new SoftAssert();

        //2.adim softassert objesi kullanilarak istenilen assertion'lari yapin
        softAssert.assertEquals(6,6); //failed
        System.out.println("1.assertion sonrasi");

        softAssert.assertTrue(5>3); //passed
        System.out.println("2.assertion sonrasi");

        softAssert.assertFalse(8>5); //failed
        System.out.println("3.assertion sonrasi");

        //3.adim softassert'e raporla diyecegiz
        softAssert.assertAll();// Bu satirda calismasi durur cunku failed olan aseertion var
        System.out.println("assertall sonrasi");
    }
}
