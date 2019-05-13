package ba.unsa.etf.rs.tutorijal8;

import java.time.LocalDate;

public class Vozac {
    private int idVozac, JMB;
    private String ime, prezime;
    private LocalDate datumRodjenja, datumZaposlenja;

    public Vozac() {
    }

    public Vozac(int idVozac, String ime, String prezime, int JMB,
                 LocalDate datumRodjenja, LocalDate datumZaposlenja) {
        this.idVozac = idVozac;
        this.ime = ime;
        this.prezime = prezime;
        this.JMB = JMB;
        this.datumRodjenja = datumRodjenja;
        this.datumZaposlenja = datumZaposlenja;
    }

    public int getIdVozac() {
        return idVozac;
    }

    public void setIdVozac(int idVozac) {
        this.idVozac = idVozac;
    }

    public int getJMB() {
        return JMB;
    }

    public void setJMB(int JMB) {
        this.JMB = JMB;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public LocalDate getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(LocalDate datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public LocalDate getDatumZaposlenja() {
        return datumZaposlenja;
    }

    public void setDatumZaposlenja(LocalDate datumZaposlenja) {
        this.datumZaposlenja = datumZaposlenja;
    }
}
