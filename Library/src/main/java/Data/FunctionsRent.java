/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;
import Logic.ClassBook;
import Logic.ClassClient;
import Logic.ClassRent;
import Logic.ClassRentDetail;
import static Settings.config.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.*;
import java.text.*;

/**
 * @author eduardo
 */
public class FunctionsRent {
    
    public FunctionsRent(){
        LoadDriver();
    }
    
    public boolean SaveRent(ClassRent rent){
       try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
            //'"+dateFormat.format(date)+"'
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "INSERT INTO rent (total, status_date, return_date, status, id_client, id_user, notes) "
                   +"VALUES(?,'"+dateFormat.format(date)+"',?,'F',?,?,'')";
            //System.out.print(sql);
            st = conn.prepareStatement(sql);
            st.setDouble(1,rent.getTotal());
            st.setString(2,rent.getReturn_date());
            st.setInt(3,rent.getId_client());
            st.setInt(4,rent.getId_user());
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

    public boolean SaveDetailRent(ClassRentDetail rentDetail){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "INSERT INTO rent_detail (id_book, rent_price, id_rent) "
                   +"VALUES(?,?,?)";
            //System.out.print(sql);
            st = conn.prepareStatement(sql);
            st.setInt(1,rentDetail.getId_book());
            st.setDouble(2,rentDetail.getRent_price());
            st.setInt(3,rentDetail.getId_rent());
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
    
    public boolean UpdateStatusRent(String note, int id){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "UPDATE rent SET status='T',notes=?"
                   +"WHERE id_rent=?";
            //System.out.print(sql);
            st = conn.prepareStatement(sql);
            st.setString(1,note);
            st.setInt(2,id);
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
    
    public int GetLastRent(){
       int id_rent= 0;
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           st = conn.prepareStatement("select id_rent from rent r order by id_rent DESC limit 1");
           rs = st.executeQuery();
           while (rs.next()) {               
               id_rent=rs.getInt("id_rent");
               
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
       return id_rent;
   }
    
    public int GetLastRentByUser(int id){
       int idRenta = 0;
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           st = conn.prepareStatement("select id_rent from rent r where id_client = (select id_client from client where id_client = "+id+") order by id_rent DESC limit 1 ");
           rs = st.executeQuery();
           while (rs.next()) {               
               idRenta=rs.getInt("id_rent");               
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
       return idRenta;
   }
    
    public ArrayList<String> DetailRent(int id){
       ArrayList<String> lista = new ArrayList<String>();
       
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           st = conn.prepareStatement("select title from rent_detail inner join book on rent_detail.id_book = book.id_book where id_rent ="+id);
           rs = st.executeQuery();
           while (rs.next()) {               
               String title=rs.getString("title");
               lista.add(title);
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
    
    public ArrayList<ClassRent> ReportRent(){
       ArrayList<ClassRent> lista = new ArrayList<ClassRent>();
       
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           String query = "select id_rent,total,status_date,return_date,status,CONCAT(c.name,' ',c.last_name) as cliente ,notes from rent r ";
           query += "inner join client c on r.id_client = c.id_client ";
           query += "order by id_rent DESC ";
           System.out.println(query);
           st = conn.prepareStatement(query);
           rs = st.executeQuery();
           while (rs.next()) {               
               int id_rent=rs.getInt("id_rent");
               double total=rs.getDouble("total");
               String status_date=rs.getString("status_date");
               String return_date=rs.getString("return_date");
               String status=rs.getString("status");
               String client = rs.getString("cliente");
               String notes=rs.getString("notes");
               
               ClassRent rent = new ClassRent(id_rent, total, status_date, return_date, status, client, notes);
               lista.add(rent);
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
    
}