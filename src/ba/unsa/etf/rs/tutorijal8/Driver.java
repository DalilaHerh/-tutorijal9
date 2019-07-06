package ba.unsa.etf.rs.tutorijal8;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

import java.time.LocalDate;

public class Driver {
    private SimpleIntegerProperty id = new SimpleIntegerProperty();
    private SimpleStringProperty Name = new SimpleStringProperty("");
    private SimpleStringProperty Prezime= new SimpleStringProperty("");;
    private SimpleStringProperty JMB= new SimpleStringProperty("");;
    private SimpleObjectProperty<LocalDate> Birthday = new SimpleObjectProperty<>();
    private SimpleObjectProperty<LocalDate> WorkDate= new SimpleObjectProperty<>();

    public Driver(String ime, String prezime, String JMB, LocalDate birthDate, LocalDate workDate) {
        Name.set(ime);
        Prezime.set(prezime);
        this.JMB.set(JMB);
        Birthday.set(birthDate);
        WorkDate.set(workDate);
    }


    public Driver() { }



    public String getName() {
        return Name.get();
    }

    public SimpleStringProperty nameProperty() {
        return Name;
    }

    public void setName(String name) {
        this.Name.set(name);
    }

    public String getPrezime() {
        return Prezime.get();
    }

    public SimpleStringProperty prezimeProperty() {
        return Prezime;
    }

    public void setPrezime(String prezime) {
        this.Prezime.set(prezime);
    }

    public String getJMB() {
        return JMB.get();
    }

    public SimpleStringProperty JMBProperty() {
        return JMB;
    }

    public void setJMB(String JMB) {
        this.JMB.set(JMB);
    }

    public int getId() {
        return id.get();
    }

    public SimpleIntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public LocalDate getBirthday() {
        return Birthday.get();
    }

    public SimpleObjectProperty<LocalDate> birthdayProperty() {
        return Birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.Birthday.set(birthday);
    }

    public LocalDate getWorkDate() {
        return WorkDate.get();
    }

    public SimpleObjectProperty<LocalDate> workDateProperty() {
        return WorkDate;
    }

    public void setWorkDate(LocalDate workDate) {
        this.WorkDate.set(workDate);
    }

    @Override
    public String toString() {
        return  Name + " " + Prezime ;
    }


}