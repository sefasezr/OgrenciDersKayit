package ogrenci_kayit_uygulamasi;

public class OgrenciApp {
    public static void main(String[] args) {
        BorcOdeme ogr = new BorcOdeme();
        ogr.ogrenciNoBelirle();
        ogr.dersKaydi();
        ogr.borcuGoster();
        ogr.odemeMiktari();
        System.out.println(ogr.toString());


    }
}
