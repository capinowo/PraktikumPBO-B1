/*
Nama    : Alya Safina
NIM     : 24060122140123
*/

public class Main {
    public static void main(String[] args) {
        //Kamus
        Ulat K ;
        Data<Kupu> anu;

        //Algoritma
        K = new Ulat();
        anu = new Data<>();

        anu.setIsi(K);
        anu.getIsi().gerak();
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
        

    }
}
    