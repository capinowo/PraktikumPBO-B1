/*

Nama file	: JumlahPesananMelebihiStokException.java
Deskripsi 	: Merupakan eksepsi yang dihasilkan ketika jumlah pesanan melebihi stok yang tersedia.Merupakan eksepsi yang dihasilkan ketika jumlah pesanan melebihi stok yang tersedia.

*/

public class JumlahPesananMelebihiStokException extends Exception {
    // TO DO 2: Buat konstructor dengan parameter message dan panggil konstruktor parent dengan keyword super
    public JumlahPesananMelebihiStokException (String message) {
        super ("Pesanan melebihi stok yang tersedia.");
    }
}
