package ogrenci_kayit_uygulamasi;

import java.util.Scanner;

public class OgrenciKayit {

    private String ilkIsim;
    private String soyIsim;
    private int yil;
    private String ogrenciNo;
    private String dersler = "";
    private int toplamBorc;

    private static int id = 1000;
    static Scanner scan = new Scanner(System.in);

    public String getDersler(String dersler) {
        return dersler;
    }

    public int getToplamBorc() {
        return toplamBorc;
    }

    public OgrenciKayit(){
        System.out.print("Adinizi giriniz: ");
        this.ilkIsim = scan.nextLine();
        System.out.print("Soyisminizi giriniz: ");
        this.soyIsim = scan.nextLine();

        while(true){
            System.out.print("Kaçıncı sınıftasınız: ");
            this.yil = scan.nextInt();
            if(yil>4||yil<1){
                System.out.println("Geçersiz Sınıf girişi \nTekrar giriniz");
            }else{
                break;
            }
        }

    }

    public void ogrenciNoBelirle(){
        this.ogrenciNo = id+""+yil;
        this.id++;
        System.out.println(ogrenciNo);
    }

    @Override
    public String toString() {
        return "OgrenciKayit{" +
                "ilkIsim='" + ilkIsim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", yil=" + yil +
                ", ogrenciNo='" + ogrenciNo + '\'' +
                ", dersler='" + dersler + '\'' +
                ", toplamBorc=" + toplamBorc +
                '}';
    }
}




