package batikanugur.com.V4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiTryCatch {

    public static void main(String[] args) {

        int sayi1 = 0;
        int sayi2 = 0;
        int toplam = 0;
        float bolme = 0;

        Scanner scanner = new Scanner(System.in);

        boolean hataDurumuFlag = true;

        do {

            try {
                System.out.println("Lütfen ilk sayıyı gir");
                sayi1 = scanner.nextInt();

                System.out.println("Lütfen ikinci sayıyı gir");
                sayi2 = scanner.nextInt();

                toplam = sayi1 + sayi2;
                System.out.println("Toplam: " + toplam);

                //TODO bölmeyi sağlıklı yazalım

                bolme = sayi1 / sayi2;
                System.out.println("Bolme: " + bolme);

                hataDurumuFlag = false;

            }catch (ArithmeticException e){
                System.out.println("hata durumu " +e);
            }catch (InputMismatchException e){
                System.out.println("hata durumu " +e);
            }catch (RuntimeException e){
                System.out.println("hata durumu " +e);
            }catch (Exception e){
                System.out.println("hata durumu " +e);
                //hataDurumuFlag = false;
            }finally {
                hataDurumuFlag = false;
                System.out.println("----------------------");
            }

        } while (hataDurumuFlag); //false


    }

}
