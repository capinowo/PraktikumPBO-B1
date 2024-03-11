class PrismaSegitiga{

    private Segitiga alas;
    private double tinggiPrisma;

    public PrismaSegitiga() {
        alas = new Segitiga();
        tinggiPrisma = 0;
    }

    public PrismaSegitiga (Segitiga a, double t) { 
        alas = a;
        tinggiPrisma = t;
    }

    private double hitungVolume() {
        return (alas.hitungLuas() * tinggiPrisma);
    }

    private double hitungLuasPermukaan() {
        return (alas.hitungLuas() * 2) + (tinggiPrisma*alas.getAlas() * 3);
    }
    
    public double Volume () {
        return hitungVolume();
    }        

    public double LuasPermukaan (){
        return hitungLuasPermukaan();
    }
}