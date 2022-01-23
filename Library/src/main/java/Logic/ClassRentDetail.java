/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author eduardo
 */
public class ClassRentDetail {
    
    private int rent_detail;
    private int id_book;
    private double rent_price;
    private int id_rent;

    public ClassRentDetail(int rent_detail, int id_book, double rent_price, int id_rent) {
        this.rent_detail = rent_detail;
        this.id_book = id_book;
        this.rent_price = rent_price;
        this.id_rent = id_rent;
    }

    public int getRent_detail() {
        return rent_detail;
    }

    public void setRent_detail(int rent_detail) {
        this.rent_detail = rent_detail;
    }

    public int getId_book() {
        return id_book;
    }

    public void setId_book(int id_book) {
        this.id_book = id_book;
    }

    public double getRent_price() {
        return rent_price;
    }

    public void setRent_price(double rent_price) {
        this.rent_price = rent_price;
    }

    public int getId_rent() {
        return id_rent;
    }

    public void setId_rent(int id_rent) {
        this.id_rent = id_rent;
    }
}
