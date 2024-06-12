package ogrenci_veritabani_uygulamasi;

import java.util.Scanner;

public class DersKayit extends OgrenciKayit {
    private String dersler ="";
    private int toplamBorc;
    private final int dersUcreti = 600;


    public String getDersler(){
        return dersler;
    }

    public void setDersler(String dersler) {
        this.dersler = dersler;
    }

    @Override
    public int getToplamBorc() {
        return toplamBorc;
    }



    public void setToplamBorc(int toplamBorc) {
        this.toplamBorc = toplamBorc;
    }

    Scanner scan = new Scanner(System.in);

    public void dersKaydi(){
        boolean devam = true;
        do {
            System.out.println("Ders seçim ekranına hoşgeldiniz.");
            System.out.println("Secmek istediginiz dersin kodunu giriniz: " +
                    "\n101 - Tarih" +
                    "\n103 - Matematik" +
                    "\n105 - Ingilizce" +
                    "\n107 - Kimya" +
                    "\n109 - Bilgisayar Bilimleri"+
                    "\n\nÇıkmak için X'e basınız.");
            String ders = scan.next().toUpperCase();
            switch (ders){
                case "101":
                    dersler = dersler +"Tarih ";
                    System.out.println("Seçilen Dersler: \n"+dersler+" ");
                    toplamBorc = toplamBorc + dersUcreti;

                    break;
                case "103":
                    dersler = dersler+"Matematik ";
                    System.out.println("Seçilen Dersler: \n"+dersler+" ");
                    toplamBorc = toplamBorc + dersUcreti;

                    break;
                case "105":
                    dersler = dersler +"Ingilizce ";
                    System.out.println("Seçilen Dersler: \n"+dersler+" ");
                    toplamBorc = toplamBorc + dersUcreti;

                    break;
                case "107":
                    dersler = dersler +"Kimya ";
                    System.out.println("Seçilen Dersler: \n"+dersler+" ");
                    toplamBorc = toplamBorc + dersUcreti;

                    break;
                case "109":
                    dersler = dersler +"Bilgisayar Bilimleri ";
                    System.out.println("Seçilen Dersler: \n"+dersler+" ");
                    toplamBorc = toplamBorc + dersUcreti;

                    break;
                case "X":
                    System.out.println("Çıkışınız Yapılıyor Teşekkürler");
                    devam = false;
                    break;
                default:
                    System.out.println("Geçersiz işlem yaptınız");

            }
        }while(devam);
        System.out.println("Seçilen Dersler: "+dersler);
        System.out.println("Toplam Borcunuz: "+toplamBorc);
        setToplamBorc(toplamBorc);
        setDersler(dersler);

    }
}
