/*

Nama file	: Tiket.java
Deskripsi 	: Mewakili sebuah pesanan tiket yang dibuat oleh pengguna. Berisi informasi tentang jumlah tiket yang dipesan, dan metode pembayaran.
*/

public class Tiket {
	public static void pesanJumlahTiket(int jumlahTiket) {
 		// Asumsi jumlah tiket yang tersedia (boleh diganti)
        int tiketTersedia = 100;
		if ((jumlahTiket > 0) & (jumlahTiket <= tiketTersedia)) {
			System.out.println("Pemesanan tiket sebanyak " + jumlahTiket + " berhasil.");
		}
		else {
			// To DO : Assertion untuk memastikan jumlah pemesanan lebih dari 0
			assert (jumlahTiket > 0): "Jumlah pemesanan harus lebih dari 0.";
   	    	// To Do : Assertion untuk memastikan jumlah pemesanan tidak melebihi tiket yang tersedia
			assert (jumlahTiket < tiketTersedia): "Jumlah pemesanan tidak boleh melebihi tiket yang tersedia.";
		}   	    
    }

	public static void isEWallet(int EWallet) {
		if ((EWallet > 0) & (EWallet < 5)) {
			System.out.println("Pemesanan tiket selesai menggunakan e-wallet " + getEWallet(EWallet));
		} 
		else {
			// To Do : Memeriksa apakah index e-wallet yang dipilih valid
			assert ((EWallet > 0) & (EWallet < 5)): "Pilihan e-wallet tidak valid.";
		}
    }

	private static String getEWallet(int index) {
		switch (index) {
			case 1:
       		    return "OVO";
			case 2:
       		    return "GoPay";
			case 3:
       		    return "DANA";
			case 4:
       		    return "LinkAja";
			default:
       		    return "Metode pembayaran tidak valid.";
		}
	}
}
