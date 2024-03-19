package org.bangundatar;
import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas, tingi;

    public Segitiga (double alas, double tingi, int jumlahSisi) {
            this.alas = alas;
            this.tingi = tingi;
            this.jumlahSisi = jumlahSisi;
        }
    
        public double hitungLuas() {
            return alas * tingi * 0.5;
        }
    
        public void printInfo() {
            System.out.println("Bangun Segitiga bersisi " + this.getJumlahSisi());
        }
    
}
