package tests.day14_testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C04_HardAssert {

    /*
        TestNG'de 2 tane Assert class'i vardir
        1.si JUnit 'deki Assert class'i ile ayni methodlara sahiptir
        ilk FAILED olan assert isleminde calismayi durdurur ve hata mesaji verir

        2.assert class'inin adi softAssert oldugu icin, ilkine hard asseert denmistir

        2.Assert class'i ise SoftAssert class'idir
        SOftAssert biz raporla deyinceye kadar asserton'lari failed olsa bile calistirmaya devam eder
        biz raporla dedigimizde calisan assertion'lardan kacinin failed oldugunu soyler
        ve failed olan aseertion varsa raporla dedigimiz satirda calismayi durdurur.
     */

    @Test
    public void test01(){

        Assert.assertTrue(6>4);
        System.out.println("1.assertion sonrasi");

        Assert.assertTrue(6>14);
        System.out.println("2.assertion sonrasi");

        Assert.assertEquals(6,6);
        System.out.println("3.assertion sonrasi");
    }
}
