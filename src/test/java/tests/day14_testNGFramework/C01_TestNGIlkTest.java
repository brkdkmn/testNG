package tests.day14_testNGFramework;

import org.testng.annotations.Test;

public class C01_TestNGIlkTest {

    /*
      TestNG test methodlar'ini isim sirasina gore calistirir
      priority degeri verilen methodlar priority degeri kucukten buyuge dogru calisir

      priority esit olursa harf sirasina bakilir
      eger priority degeri yazmazsak 0 kabul eder

     */

    @Test (priority = 6)
    public void ilkTest(){
        System.out.println("Ilk test calisti");
    }

    @Test (priority = 9)
    public void ikinciTest(){
        System.out.println("ikinci test calisti");
    }

    @Test (priority = -12)
    public void ucuncuTest(){
        System.out.println("ucuncu test calisti");
    }
}
