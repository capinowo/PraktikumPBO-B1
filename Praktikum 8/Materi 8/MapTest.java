/*
 * File : MapTest.java
 * Deskripsi : program yang menggunakan generic untuk pasangan kunci - nilai
 */

import java.util.*;

public class MapTest {
    public static void main(String[] args) {

        // Kunci -> integer, nilai -> string
        Map<Integer, String> map = new HashMap<Integer, String>();

        // Menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");

        // Mengambil elemen pertama
        System.out.println(map.get(1));

        // Mengambil keseluruhan kunci sebagai objek collection set
        Set <Integer> key = map.keySet();

        // Iterasi untuk mengambil keseluruhan elemen
        for(Integer k :key ){
            System.out.println(map.get(k) );
        }

        // Nilai kunci selalu berubah setiap iterasi selesai
        // Iterasi 1: kunci = 1, maka output = "satu"
        // Iterasi 2: kunci = 2, maka output = "dua"
    }
}
