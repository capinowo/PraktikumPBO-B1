import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        // Inisialisasi ArrayList yang hanya dapat berisi objek String
        ArrayList <String> strings = new ArrayList<String>();

        //Menambah elemen
        strings.add ("Praktikum");
        strings.add ("Collection");
        strings.add ("dan Generics");

        // Menghapus elemen
        strings.remove("Praktikum");
        
        // Iterasi pada keseluruhan ArrayList
        for (String s : strings) {
            System.out.println( s + " ");
        }
    }
}