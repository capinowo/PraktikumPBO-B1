/*

Nama file	: MenuTidakTersediaException.java
Deskripsi 	: Merupakan eksepsi yang dihasilkan ketika pengguna memilih menu yang tidak tersedia.

*/

public class MenuTidakTersediaException extends Exception {
    public MenuTidakTersediaException(String message) {
        super("Menu ini tidak tersedia.");
    }
}
