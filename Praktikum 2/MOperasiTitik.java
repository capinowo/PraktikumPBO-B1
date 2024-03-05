public class MOperasiTitik {
    public static void main(String[] args) {
       Titik t = new Titik(4, 4);
       OperasiTitik o = new OperasiTitik();
    
        System.out.println( "titik (" + t.getAbsis() + "," + t.getOrdinat() + ")" );

        // Sebelum method di-private:
        // o.refleksiSumbuX(t);
        // System.out.println( "titik (" + t.getAbsis() + "," + t.getOrdinat() + ")" );
        // o.refleksiSumbuY(t);
        // System.out.println( "titik (" + t.getAbsis() + "," + t.getOrdinat() + ")" );

        o.refleksiX(t);
        System.out.println( "titik (" + t.getAbsis() + "," + t.getOrdinat() + ")" );
        o.refleksiY(t);
        System.out.println( "titik (" + t.getAbsis() + "," + t.getOrdinat() + ")" );
    }
}
