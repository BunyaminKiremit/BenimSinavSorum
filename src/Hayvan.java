/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bünyamin
 */
public class Hayvan {
   private String isim;
    private int kilo;
    private int boy;
    private int bacak_sayisi;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getBacak_sayisi() {
        return bacak_sayisi;
    }

    public void setBacak_sayisi(int bacak_sayisi) {
        this.bacak_sayisi = bacak_sayisi;
    }

    public Hayvan(String isim, int kilo, int boy, int bacak_sayisi) {
        this.isim = isim;
        this.kilo = kilo;
        this.boy = boy;
        this.bacak_sayisi = bacak_sayisi;
        
    }
     public void bilgileriGoster() {
        System.out.println("Hayvanların Bilgileri....");
        System.out.println("Hayvanın İsmi : " + isim);
        System.out.println("Hayvanın Kilosu : " + kilo);
        System.out.println("Hayvanın Boyu : " + boy);
        System.out.println("Hayvanın Bacak Sayısı : " + bacak_sayisi);
        
    }
    
    public String kostur(){
       return"Hayvan koşuyor...";
    }

 
    public String konus(){
       return"Hayvan konuşuyor...";
    }
    
}
