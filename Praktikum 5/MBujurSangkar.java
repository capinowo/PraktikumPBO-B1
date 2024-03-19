import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukkan sisi bujur sangkar :");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
        scan.close();
    }
}

/*
Apa yang terjadi apabila kelas bujur sangkar tidak membuat implementasi 
metode abstrak yang ada pada kelas BangunDatar? Jelaskan!

Metode abstrak digunakan untuk memfasilitasi kelas lain yang 
memiliki implementasi berbeda-beda. 

Jika tidak dilakukan implementasi metode abstrak, apabila ditambahkan 
kelas lain sebagai subclass, maka kemungkinan akan terjadi kesalahan 
dalam implementasi kode, karena tidak semua class memiliki metode 
implementasi yang sama, sehingga terjadi error.
 */
