/*
Nama        : Alya Safina
NIM         : 24060122140123
*/

package latihanMedium;

public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata (Senjata s) {
        senjata = s;
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(senjata.getPeluru() + jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
    }

    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if (! isAdaPeluru()){
            System.out.println("Peluru Habis");
        }
        else{
            int i = senjata.getPeluru();
            while(jumlah > 0){
                if (isAdaPeluru()){
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(i-1);
                    i--;
                }
                else{
                    System.out.println("Gagal tembak, Peluru Habis");
                }
                jumlah--;
            }
            System.out.println(">> Peluru sisa: " + senjata.getPeluru());
        }
    }

    public void menusuk() {
        if (senjata.isMenusuk()) {
            System.out.println("Tusuk");
        } else {
            System.out.println("Senjata tidak bisa menusuk");
        }
    }

    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println("Pasang Bayonet");
    }
}
