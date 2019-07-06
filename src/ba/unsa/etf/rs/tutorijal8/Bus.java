package ba.unsa.etf.rs.tutorijal8;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Bus {
    private SimpleIntegerProperty id = new SimpleIntegerProperty();
    private SimpleStringProperty Maker = new SimpleStringProperty();
    private SimpleStringProperty serija = new SimpleStringProperty();
    private SimpleIntegerProperty SeatNumber = new SimpleIntegerProperty();
    private SimpleIntegerProperty numberOfDrivers = new SimpleIntegerProperty();
    private SimpleIntegerProperty DriverOne = new SimpleIntegerProperty();
    private SimpleIntegerProperty SecondDriver = new SimpleIntegerProperty();

    public Bus(Integer id, String proizvodjac, String serija, Integer numberOfSeats, Integer numberOfDrivers, Integer firstDriver, Integer secondDriver) {
        this.id.set(id);
        this.Maker.set(proizvodjac);
        this.serija.set(serija);
        this.SeatNumber.set(numberOfSeats);
        this.numberOfDrivers.set(numberOfDrivers);
        DriverOne.set(firstDriver);
        SecondDriver.set(secondDriver);
    }

    public Bus(String proizvodjac, String serija, int brojSjedista) {
        this.Maker.set(proizvodjac);
        this.serija.set(serija);
        this.SeatNumber.set(brojSjedista);
    }

    public Bus() {

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

    public String getMaker() {
        return Maker.get();
    }

    public SimpleStringProperty makerProperty() {
        return Maker;
    }

    public void setMaker(String maker) {
        this.Maker.set(maker);
    }

    public String getSerija() {
        return serija.get();
    }

    public SimpleStringProperty serijaProperty() {
        return serija;
    }

    public void setSerija(String serija) {
        this.serija.set(serija);
    }

    public int getSeatNumber() {
        return SeatNumber.get();
    }

    public SimpleIntegerProperty seatNumberProperty() {
        return SeatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.SeatNumber.set(seatNumber);
    }

    public int getNumberOfDrivers() {
        return numberOfDrivers.get();
    }

    public SimpleIntegerProperty numberOfDriversProperty() {
        return numberOfDrivers;
    }

    public void setNumberOfDrivers(int numberOfDrivers) {
        this.numberOfDrivers.set(numberOfDrivers);
    }

    public int getDriverOne() {
        return DriverOne.get();
    }

    public SimpleIntegerProperty DriverOneProperty() {
        return DriverOne;
    }

    public void setDriverOne(int firstDriver) {
        this.DriverOne.set(firstDriver);
    }

    public int getSecondDriver() {
        return SecondDriver.get();
    }

    public SimpleIntegerProperty secondDriverProperty() {
        return SecondDriver;
    }

    public void setSecondDriver(int secondDriver) {
        this.SecondDriver.set(secondDriver);
    }


    @Override
    public String toString() {
        return Maker +" "+serija ;
    }
}