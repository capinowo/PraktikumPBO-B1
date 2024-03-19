import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(10.2);
        System.out.println("Luas lingkaran dengan jejari 10.2 satuan adalah " + l1.hitungLuas());

        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jari-jari lingkaran l2 : ");
        double jejari = scan.nextDouble();
        Lingkaran l2 = new Lingkaran(jejari);
        System.out.println("Luas lingkaran yang dibuat adalah " + l2.hitungLuas());
        scan.close();
    }
}
