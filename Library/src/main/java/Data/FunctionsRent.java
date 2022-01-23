/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;
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
            System.out.print(sql);
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
            System.out.print(sql);
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
    
    public boolean UpdateStatusRent(ClassClient client){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "UPDATE client SET name=?, last_name=?, email=?, phone=?, age=?, street=?, num_int=?, num_ext=?, city=?, state=?, country=? "
                   +"WHERE id_client = ?";
            //System.out.print(sql);
            st = conn.prepareStatement(sql);
            st.setString(1,client.getName());
            st.setString(2,client.getLast_name());
            st.setString(3,client.getEmail());
            st.setString(4,client.getPhone());
            st.setInt(5,client.getAge());
            st.setString(6,client.getStreet());
            st.setString(7,client.getNum_int());
            st.setString(8,client.getNum_ext());
            st.setString(9,client.getCity());
            st.setString(10,client.getState());
            st.setString(11,client.getState());
            st.setInt(12,client.getId());
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
    
    public ArrayList<ClassClient> GetLastRentByUser(){
       ArrayList<ClassClient> lista = new ArrayList<ClassClient>();
       
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           st = conn.prepareStatement("select * from client");
           rs = st.executeQuery();
           while (rs.next()) {               
               int id_client=rs.getInt("id_client");
               String name=rs.getString("name");
               String last_name=rs.getString("last_name");
               String email=rs.getString("email");
               String phone=rs.getString("phone");
               int age = rs.getInt("age");
               String created_at=rs.getString("created_at");
               String street=rs.getString("street");
               String num_int=rs.getString("num_int");
               String num_ext=rs.getString("num_ext");
               String city=rs.getString("city");
               String state=rs.getString("state");
               String country=rs.getString("country");
               
               ClassClient client = new ClassClient(id_client, name, last_name, email, phone, age, created_at, street, num_int, num_ext, city, state, country);
               lista.add(client);
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
    
    public ArrayList<ClassClient> DetailRent(){
       ArrayList<ClassClient> lista = new ArrayList<ClassClient>();
       
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           st = conn.prepareStatement("select * from client");
           rs = st.executeQuery();
           while (rs.next()) {               
               int id_client=rs.getInt("id_client");
               String name=rs.getString("name");
               String last_name=rs.getString("last_name");
               String email=rs.getString("email");
               String phone=rs.getString("phone");
               int age = rs.getInt("age");
               String created_at=rs.getString("created_at");
               String street=rs.getString("street");
               String num_int=rs.getString("num_int");
               String num_ext=rs.getString("num_ext");
               String city=rs.getString("city");
               String state=rs.getString("state");
               String country=rs.getString("country");
               
               ClassClient client = new ClassClient(id_client, name, last_name, email, phone, age, created_at, street, num_int, num_ext, city, state, country);
               lista.add(client);
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