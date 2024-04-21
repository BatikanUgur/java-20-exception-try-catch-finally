package batikanugur.com.V3;

public class IcIceTryCatch {

    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 0;
        int toplam = 0;
        int bolme = 0;

        try {

            try {

                bolme = sayi1 / sayi2;
                System.out.println(bolme);

            }catch (ArithmeticException e) {
                System.out.println("Ic Hata: " + e );
            }

            toplam = sayi1 + sayi2;
            System.out.println("Dıs Toplam: " +toplam);

            bolme = sayi1 / sayi2;
            System.out.println("Dıs bolme: " + bolme);

        }catch (Exception e) {
            System.out.println("Dıs Hata: " + e );
        } finally {

        }


    }

}
