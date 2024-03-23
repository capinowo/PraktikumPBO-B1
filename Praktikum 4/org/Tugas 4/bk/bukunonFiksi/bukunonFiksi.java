package bk.bukunonFiksi;
import bk.buku.Buku;

public class bukunonFiksi extends Buku {
    private String subjek;
    private int jumlahHalaman;
    private double harga;

    public bukunonFiksi (String judul, String penulis, String tahunTerbit, String subjek, int jumlahHalaman, double harga) {
        super (judul, penulis, tahunTerbit);
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.subjek = subjek;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
    }

        public String getSubjek() {
        return this.subjek;
    }

    public int getJumlahHalaman() {
        return this.jumlahHalaman;
    }

    public double getHarga() {
        return this.harga;
    }

    public void setSubjek (String subjek) {
        subjek = this.subjek;
    }

    public void setJumlahHalaman (int jumlahHalaman) {
        jumlahHalaman = this.jumlahHalaman;
    }

    public void view() {
        System.out.println("Judul buku \t : " + getJudul());
        System.out.println("Penulis \t : " + getPenulis());
        System.out.println("Tahun terbit \t : " + getTahunTerbit());
        System.out.println("Subjek \t\t : " + getSubjek());
        System.out.println("Jumlah halaman \t : " + getJumlahHalaman());
        System.out.println("Harga \t\t : " + getHarga());
    }

}


