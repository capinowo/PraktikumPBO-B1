//bangun datar generic.java
//package Generic;

/*
 * File : BangunDatarGeneric.java
 * Deskripsi : kelas kontsruksi untuk generic bangun datar
 */

public class BangunDatarGeneric <T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}