package batikanugur.com.V2;

public class HataFirlatmak {
    
    public static void main(String[] args) {
        
        try {
            // int sonuc = urunlerinSayiniAlChecked(25);
            int sonuc = urunlerinSayiniAlChecked(25);
            System.out.println("Urun Sayısı: " + sonuc);
        } catch (Exception e) {
            System.out.println("Hata: " + e);
           // throw new RuntimeException(); // Bu koda gerek yok
        } finally {
            System.out.println("Teşekkürler.");
        }
        
    }

    //Unchecked
    private static int urunlerinSayiniAlUnchecked(int siloNo) {

        int uretilenUrunSayisi = 123;

        if(siloNo < 1  || siloNo > 25) {
            throw new ArithmeticException("Silo sayısı 1 ile 25 arasında olmalı.");
        } else {
            return uretilenUrunSayisi;
        }
    }

    private static int urunlerinSayiniAlChecked(int siloNo) throws Exception {

        int uretilenUrunSayisi = 123;

        if(siloNo < 1  || siloNo > 25) {
            throw new ArithmeticException("Silo sayısı 1 ile 25 arasında olmalı.");
        } else {
            return uretilenUrunSayisi;
        }
    }

}
