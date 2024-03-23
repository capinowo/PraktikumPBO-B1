/*
Nama        : Alya Safina
NIM         : 24060122140123
*/

package bk.bukuFiksi;
import bk.buku.Buku;

public class bukuFiksi extends Buku {
    private String genre;
    private int jumlahHalaman;
    private double harga;

    public bukuFiksi (String judul, String penulis, String tahunTerbit, String genre, int jumlahHalaman, double harga) {
        super (judul, penulis, tahunTerbit);
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.genre = genre;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getJumlahHalaman() {
        return this.jumlahHalaman;
    }

    public double getHarga() {
        return this.harga;
    }

    public void setGenre (String genre) {
        genre = this.genre;
    }

    public void setJumlahHalaman (int jumlahHalaman) {
        jumlahHalaman = this.jumlahHalaman;
    }

    public void view() {
        System.out.println("Judul buku \t : " + getJudul());
        System.out.println("Penulis \t : " + getPenulis());
        System.out.println("Tahun terbit \t : " + getTahunTerbit());
        System.out.println("Genre \t\t : " + getGenre());
        System.out.println("Jumlah halaman \t : " + getJumlahHalaman());
        System.out.println("Harga \t\t : " + getHarga());
    }
    
}
