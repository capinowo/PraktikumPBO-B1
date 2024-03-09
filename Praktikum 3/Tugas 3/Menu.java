/*

Nama file	: Menu.java
Deskripsi 	: Mewakili sebuah item menu dalam restoran. Memiliki atribut nama, harga, dan stok. Terdapat metode untuk mengurangi stok ketika sebuah pesanan dibuat.

*/

public class Menu {
    private String nama;
    private double harga;
    private int stok;

    public Menu(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void kurangiStok(int jumlah) {
       // TO DO 1: Tambahkan metode untuk mengurangi stok
       this.stok = stok - jumlah;
    }
}