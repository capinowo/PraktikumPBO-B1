class Segitiga{

    private double alas;
    private double tinggi;

    public Segitiga() {
        alas = 0;
        tinggi = 0;
    }

    public Segitiga (double a, double t) {   
        alas = a;
        tinggi = t;
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggiSegitiga() {
        return tinggi;
    }

    public double hitungLuas() {
        return (alas * tinggi / 2);
    }
}
