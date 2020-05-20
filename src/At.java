/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bünyamin
 */
class At extends Hayvan{
       public At(String isim,int kilo,int boy,int bacak_sayisi){
       super(isim,kilo,boy,bacak_sayisi);
       }

    @Override
    public String kostur() {
         return this.getIsim()+" Koşuyor";
    }
       

        @Override
        public String konus() {
            return this.getKilo()+" Kilolu "+this.getBoy()+" Cm Boyunda ki "+this.getBacak_sayisi()+" Bacaklı "+this.getIsim()+" kişniyor....";
        }
    
    }