/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author eduardo
 */
public class ClassRent {
    
    private int id_rent;
    private double total;
    private String rent_date; 
    private String return_date; 
    private String status;
    private int id_client;
    private int id_user;
    private String notes;

    
    private String client;
    
    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public ClassRent(int id_rent, double total, String rent_date, String return_date, String status, int id_client, int id_user, String notes) {
        this.id_rent = id_rent;
        this.total = total;
        this.rent_date = rent_date;
        this.return_date = return_date;
        this.status = status;
        this.id_client = id_client;
        this.id_user = id_user;
        this.notes = notes;
    }
    
    public ClassRent(int id_rent, double total, String rent_date, String return_date, String status, String client, String notes) {
        this.id_rent = id_rent;
        this.total = total;
        this.rent_date = rent_date;
        this.return_date = return_date;
        this.status = status;
        this.client = client;
        this.notes = notes;
    }

    public int getId_rent() {
        return id_rent;
    }

    public void setId_rent(int id_rent) {
        this.id_rent = id_rent;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getRent_date() {
        return rent_date;
    }

    public void setRent_date(String rent_date) {
        this.rent_date = rent_date;
    }

    public String getReturn_date() {
        return return_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
}
