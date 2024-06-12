package ogrenci_kayit_uygulamasi;

import java.util.Scanner;

public class BorcOdeme extends DersKayit {

    private int toplamBorc;

    @Override
    public int getToplamBorc() {
        return toplamBorc;
    }

    @Override
    public void setToplamBorc(int toplamBorc) {
        this.toplamBorc = toplamBorc;
    }

    Scanner scan = new Scanner(System.in);

    public void borcuGoster(){
        System.out.println("Toplam borç: "+toplamBorc);

    }
    public void odemeMiktari(){
        while(true){
            System.out.println("Ödeyeceğiniz miktarı giriniz: ");
            int odeme = scan.nextInt();
            if(odeme>=toplamBorc){
                System.out.println("Ödemeniz alındı! \nPara üstünüz: "+Math.abs(odeme-toplamBorc));
                toplamBorc=0;
                borcuGoster();
                break;
            }else{
                System.out.println("Yetersiz Bakiye lutfen yeni bakiye girisi yapın");
            }
        }
    }

    @Override
    public String toString(){
        return super.toString();
    }


}
