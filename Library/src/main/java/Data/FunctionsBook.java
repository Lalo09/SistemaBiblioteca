/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;
import Logic.ClassBook;
import Logic.ClassClient;
import static Settings.config.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.*;
import java.text.*;

/**
 * @author eduardo
 */
public class FunctionsBook {
    
    public FunctionsBook(){
        LoadDriver();
    }
    
    public boolean SaveBook(ClassBook book){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "INSERT INTO book (title, volume, pages, copies, rent_price, id_author, id_editorial, id_category) "
                   +"VALUES(?,?,?,?,?,?,?,?)";
            //System.out.print(sql);
            st = conn.prepareStatement(sql);
            st.setString(1,book.getTitle());
            st.setString(2,book.getVolume());
            st.setInt(3,book.getPages());
            st.setInt(4,book.getCopies());
            st.setDouble(5,book.getRent_price());
            st.setInt(6,book.getId_author());
            st.setInt(7,book.getId_editorial());
            st.setInt(8,book.getId_category());
            st.executeUpdate();
            return true;
       } catch (Exception e) {
            System.err.println("error"+ e);
            return false;
       }
        finally{
           try {
               //Cierre de conexion
               st.close();
               conn.close();
           } catch (SQLException ex) {
               ex.printStackTrace();
           }
       }
    } 

    public boolean UpdateBook(ClassBook book){
       try {
           System.out.println("Metodo actualizado"+book);
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "UPDATE book SET title=?, volume=?, pages=?, copies=?, rent_price=?, id_author=?, id_editorial=?, id_category=? "
                   +"WHERE id_book=?";
            //System.out.println(sql);
            st = conn.prepareStatement(sql);
            st.setString(1,book.getTitle());
            st.setString(2,book.getVolume());
            st.setInt(3,book.getPages());
            st.setInt(4,book.getCopies());
            st.setDouble(5,book.getRent_price());
            st.setInt(6,book.getId_author());
            st.setInt(7,book.getId_editorial());
            st.setInt(8,book.getId_category());
            st.setInt(9,book.getIdBook());
            st.executeUpdate();
            return true;
       } catch (Exception e) {
            System.err.println("Error");
            return false;
       }
        finally{
           try {
               //Cierre de conexion
               st.close();
               conn.close();
           } catch (SQLException ex) {
               ex.printStackTrace();
           }
       }
    } 

    public boolean DeleteBook(int id){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "DELETE FROM book "
                   +"WHERE id_book = ?";
            //System.out.print(sql);
            st = conn.prepareStatement(sql);
            st.setInt(1,id);
            st.executeUpdate();
            return true;
       } catch (Exception e) {
            System.err.println("Error");
            return false;
       }
        finally{
           try {
               //Cierre de conexion
               st.close();
               conn.close();
           } catch (SQLException ex) {
               ex.printStackTrace();
           }
       }
    } 
    
    public ArrayList<ClassBook> ShowBooks(){
       ArrayList<ClassBook> lista = new ArrayList<ClassBook>();
       
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           st = conn.prepareStatement("select * from book");
           rs = st.executeQuery();
           while (rs.next()) {               
               int id_book=rs.getInt("id_book");
               String title=rs.getString("title");
               String volume=rs.getString("volume");
               int pages=rs.getInt("pages");
               int copies=rs.getInt("copies");
               double price_rent = rs.getDouble("rent_price");
               int id_author=rs.getInt("id_author");
               int id_editorial=rs.getInt("id_editorial");
               int id_category=rs.getInt("id_category");
               
               ClassBook book = new ClassBook(id_book, title, volume, pages, copies, price_rent, id_author, id_editorial, id_category);
               lista.add(book);
               //System.err.println(client.toString()+"/n");
           }
           conn.close();
       } catch (Exception e) {
           System.out.println(e.toString());
       }
       finally{
           try {
               //Cierre de conexion
               st.close();
               conn.close();
           } catch (SQLException ex) {
               ex.printStackTrace();
           }
       }
       return lista;
   }
    
    public ArrayList<ClassBook> SearchBook(String search){
       ArrayList<ClassBook> lista = new ArrayList<ClassBook>();
       
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           st = conn.prepareStatement("select  * from book where  title like '%"+search+"%'");
           rs = st.executeQuery();
           while (rs.next()) {               
               int id_book=rs.getInt("id_book");
               String title=rs.getString("title");
               String volume=rs.getString("volume");
               int pages=rs.getInt("pages");
               int copies=rs.getInt("copies");
               double price_rent = rs.getDouble("rent_price");
               int id_author=rs.getInt("id_author");
               int id_editorial=rs.getInt("id_editorial");
               int id_category=rs.getInt("id_category");
               
               ClassBook book = new ClassBook(id_book, title, volume, pages, copies, price_rent, id_author, id_editorial, id_category);
               lista.add(book);
           }
           conn.close();
       } catch (Exception e) {
           System.out.println(e.toString());
       }
       finally{
           try {
               //Cierre de conexion
               st.close();
               conn.close();
           } catch (SQLException ex) {
               ex.printStackTrace();
           }
       }
       return lista;
   }    
    
}