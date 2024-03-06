class Lingkaran {
    private double jariJari;
    public Lingkaran (double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling () {
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = -10;
        assert (jariJari > 0): "jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/* 

Secara konsep, program tersebut kurang tepat,
karena tidak memberikan realisasi yang tepat untuk tidak menerima hasil nol dan negatif.

Jika diberikan `input double jariJari = -10;`, 
maka program akan memberikan output negatif, sehingga hasilnya tidak valid.
Jika diberikan `input double jariJari = 0;`, 
maka program akan memberikan output nol, sehingga hasilnya tidak valid.

Oleh karena itu, seharusnya, pesan asersi juga memberikan informasi 
untuk tidak memberikan nilai negatif pada jariJari.
Selain itu, dalam program juga harus ditambahkan constraint (batasan),
untuk tidak menerima nilai negatif pada angka kurang dari, atau sama dengan nol

*/