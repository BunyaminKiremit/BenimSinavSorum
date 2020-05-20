/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bünyamin
 */
/*Benim Sorum:Hayvan adlı bir Class oluşturun ve bu Classın 4 Özelliği olsun
hayvan Adlı Clasın 3 alt Classı olsun
uc fonksiyonlu işlemi olsun
*/
public class Main {
 public static void konustur(Object object){
            if (object instanceof Kopek) {
            Kopek kopek=(Kopek) object;
            System.out.println(kopek.konus());
        }
       else if (object instanceof At) {
            At at=(At) object;
            System.out.println(at.konus());
        }
       else if (object instanceof İnek) {
            İnek inek=(İnek) object;
            System.out.println(inek.konus());
        }
       else if (object instanceof Hayvan) {
            Hayvan hayvan=(Hayvan) object;
            System.out.println(hayvan.konus());
        }
    }
     public static void kostur(Object object){
            if (object instanceof Kopek) {
            Kopek kopek=(Kopek) object;
            System.out.println(kopek.kostur());
        }
       else if (object instanceof At) {
            At at=(At) object;
            System.out.println(at.kostur());
        }
       else if (object instanceof İnek) {
            İnek inek=(İnek) object;
            System.out.println(inek.kostur());
        }
       else if (object instanceof Hayvan) {
            Hayvan hayvan=(Hayvan) object;
            System.out.println(hayvan.kostur());
        }
    }
     public static void main(String[] args){
         Kopek kopek=new Kopek("Karabaş",25,15,4);
         At at=new At("Haydarbaş",370,150,4);
         İnek inek=new İnek("SarıKIZ",480,120,4);
     
         konustur(inek);

         kostur(kopek);
         
         at.bilgileriGoster();
         }
     }
     

