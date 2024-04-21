package batikanugur.com.V1;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AppMain {
    public static void main(String[] args) {

        try {
            //code
            int sonuc = 2/0;
        }catch (Exception e) {
            //code
            //logs
            System.out.println("Hata: " + e);
            System.out.println("Hata: " + e.getMessage());
        }
        finally {
            //scope her zaman calisacak kodlar
            System.out.println("Teşekkür ederiz " + new Date());
        }

        System.out.println("-------------------------------------------");

        try {
           sifiraBolmeHatasi();
        }catch (Exception e) {
            System.out.println("Hata: " + e);
        }
        finally {
            //scope her zaman calisacak kodlar
            System.out.println("Teşekkür ederiz ");
        }

    }

    private static void sifiraBolmeHatasi() {
        //int sonuc = 2/0;
        throw new ArithmeticException("Arithmetic Exception meydana geldi.");
    }
}