package ba.unsa.etf.rs.tutorijal8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class TransportDAO {
    private static TransportDAO instance;
    private Connection conn;
    private PreparedStatement dodajVozaca, dodajBus;

    public static TransportDAO getInstance() {
        if(instance == null) instance = new TransportDAO();
        return instance;
    }

    private TransportDAO() {
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\User\\IdeaProjects\\tutorijal8\\baza.db"); //kod mene što bude
            dodajVozaca = conn.prepareStatement("INSERT INTO Vozac VALUES (?,?,?,?,?)");
            dodajBus = conn.prepareStatement("INSERT into Bus VALUES (?,?,?)");
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }

    /*public static void removeInstance() {
        if (instance != null) {
            try {
                instance.conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        instance = null;
    }*/

    public void addDriver(Driver vozac) {
        try {
            ResultSet result = dodajVozaca.executeQuery();
            result.next();

            dodajVozaca.setString(1, vozac.getIme());
            dodajVozaca.setString(2, vozac.getPrezime());
            dodajVozaca.setString(3, vozac.getJMB());
            dodajVozaca.setObject(4, vozac.getDatumRodjenja());
            dodajVozaca.setObject(5, vozac.getDatumZaposlenja());
            dodajVozaca.executeUpdate();
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void addBus(Autobus bus) {
        try{
            ResultSet result = dodajBus.executeQuery();
            result.next();
            dodajBus.setString(1, bus.getProizvodjac());
            dodajBus.setString(2, bus.getSerija());
            dodajBus.setInt(3, bus.getBrojSjedista());
            dodajBus.executeUpdate();
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Driver> getDrivers() {
        return null;
    }

    public ArrayList<Autobus> getBusses() {
        return null;
    }

    public void deleteBus(Autobus bus) {
    }

    public void deleteDriver(Driver driver) {

    }
    public void resetDatabase() {
        Scanner ulaz = null;
        try {
            ulaz = new Scanner(new FileInputStream("baza.db"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String sqlUpit = "";
        while(ulaz.hasNext()){
            sqlUpit = ulaz.nextLine();
            if(sqlUpit.charAt(sqlUpit.length()-1)==';') {
                try {
                    Statement stmt = conn.createStatement();
                    stmt.execute(sqlUpit);
                    sqlUpit = "";
                }catch(SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        ulaz.close();
    }
}
