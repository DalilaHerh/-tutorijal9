package ba.unsa.etf.rs.tutorijal8;

public class Autobus {
    private String proizvodjac, serija;
    private int brojSjedista;

    public Autobus(String proizvodjac, String serija, int brojSjedista) {
        this.proizvodjac = proizvodjac;
        this.serija = serija;
        this.brojSjedista = brojSjedista;
    }

    public String getProizvodjac() {
        return proizvodjac;
    }

    public void setProizvodjac(String proizvodjac) {
        this.proizvodjac = proizvodjac;
    }

    public String getSerija() {
        return serija;
    }

    public void setSerija(String serija) {
        this.serija = serija;
    }

    public int getBrojSjedista() {
        return brojSjedista;
    }

    public void setBrojSjedista(int brojSjedista) {
        this.brojSjedista = brojSjedista;
    }
}
