package bk.buku;

public class Buku {
    protected String judul;
    protected String penulis;
    protected String tahunTerbit;

    public Buku (String judul, String penulis, String tahunTerbit) {
        judul = this.judul;
        penulis = this.penulis;
        tahunTerbit = this.tahunTerbit;
    }
    
    public String getJudul() {
        return this.judul;
    }

    public String getPenulis() {
        return this.penulis;
    }

    public String getTahunTerbit() {
        return this.tahunTerbit;
    }

    public void setJudul (String judul) {
        judul = this.judul;
    }

    public void setPenulis (String penulis) {
        penulis = this.penulis;
    }

    public void view() {
        System.out.println("Buku berjudul " + this.getJudul() + " ditulis oleh " + this.getPenulis() + " dan terbit pada " + this.getTahunTerbit());
    }

}
