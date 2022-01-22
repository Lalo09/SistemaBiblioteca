/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author eduardo
 */
public class ClassBook {
     
    public int idBook;
    public String title;
    public String volume;
    public int pages;
    public int copies;
    public double rent_price;
    public int id_author;
    public int id_editorial;
    public int id_category;
    
    public ClassBook(int idBook, String title, String volume, int pages, int copies, double rent_price, int id_author, int id_editorial, int id_category) {
        this.idBook = idBook;
        this.title = title;
        this.volume = volume;
        this.pages = pages;
        this.copies = copies;
        this.rent_price = rent_price;
        this.id_author = id_author;
        this.id_editorial = id_editorial;
        this.id_category = id_category;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public double getRent_price() {
        return rent_price;
    }

    public void setRent_price(double rent_price) {
        this.rent_price = rent_price;
    }

    public int getId_author() {
        return id_author;
    }

    public void setId_author(int id_author) {
        this.id_author = id_author;
    }

    public int getId_editorial() {
        return id_editorial;
    }

    public void setId_editorial(int id_editorial) {
        this.id_editorial = id_editorial;
    }

    public int getId_category() {
        return id_category;
    }

    public void setId_category(int id_category) {
        this.id_category = id_category;
    }
}