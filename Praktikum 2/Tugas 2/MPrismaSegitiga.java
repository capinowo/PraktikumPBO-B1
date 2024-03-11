public class MPrismaSegitiga {
    public static void main(String[] args){
        Segitiga s = new Segitiga(3,4);
        PrismaSegitiga p = new PrismaSegitiga(s,5);
    
        System.out.println("Segitiga \t : ( " + s.getAlas() + " , " + s.getTinggiSegitiga() + " )" );
        System.out.println("Luas permukaan \t : " + p.LuasPermukaan());
        System.out.println("Volume \t\t : " + p.Volume());
    }
}
