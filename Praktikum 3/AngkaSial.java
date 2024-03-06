public class AngkaSial {
    public void cobaAngka (int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/* 

No. 1
Ketika eksepi terjadi akibat perintah `as.cobaAngka(13);`, 
baris `System.out.println(angka + " bukan angka sial");` tidak dieksekusi, 
karena setelah terjadi eksepsi, eksekusi method akan berhenti.

Oleh karena itu, setelah terjadi eksepsi, 
program akan langsung masuk ke perintah `catch (AngkaSialException ase)`,
lalu menghentikan eksekusinya.

No. 2
Baris `catch (AngkaSialException ase)` dapat dieksekusi, 
karena terjadi eksepsi akibat baris `as.cobaAngka(13);`, 
yang memanggil eksepsi pada program `AngkaSialException`, 
sehingga perintah `catch (AngkaSialException ase)` akan dieksekusi.

 */