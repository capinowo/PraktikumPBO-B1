package bk.main;
import bk.bukuFiksi.*;
import bk.bukunonFiksi.*;

public class Main {
    public static void main(String[] args) {
    
        System.out.println("Identitas Buku 1:");
        bukuFiksi bukuCerita = new bukuFiksi("Muasal Kelinci Abadi Rembulan", "Tewi Inaba", "2004", "Fantasi", 254, 150);
        bukuCerita.view();

        System.out.println("\nIdentitas Buku 2:");
        bukuAkademik bukuPelajaran = new bukuAkademik("Pengantar Ekonomi Keluarga", "Alya Safina", "2024", "Ekonomi", 397, 300);
        bukuPelajaran.view();

    }

}
