/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;
import Logic.ClassAuthor;
import static Settings.config.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author eduardo
 */
public class FunctionsAutor {
    
    public FunctionsAutor(){
        LoadDriver();
    }
    
    //Metodo para guardar un autor
    public boolean SaveAuthor(ClassAuthor author){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "INSERT INTO author (first_name,last_name) "
                   +"values (?,?)";
            //System.out.print(sql);
            st = conn.prepareStatement(sql);
            st.setString(1,author.getFirst_name());
            st.setString(2,author.getLast_name());
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

    //Metodo para actualizar un autor
    public boolean UpdateAuthor(ClassAuthor author){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "UPDATE author SET first_name=?, last_name=? WHERE id_author = ?";
            System.out.print(sql);
            st = conn.prepareStatement(sql);
            st.setString(1,author.getFirst_name());
            st.setString(2,author.getLast_name());
            st.setInt(3,author.getId());
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
    
    //Metodo para eliminar un usuario
    public boolean DeleteAuthor(int id){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "DELETE FROM author "
                   +"WHERE id_author = ?";
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
    
    //Metodo para mostrar los autores y todos sus datos
    public ArrayList<ClassAuthor> showAuthors(){
       ArrayList<ClassAuthor> lista = new ArrayList<ClassAuthor>();
       
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           st = conn.prepareStatement("select * from author order by id_author desc");
           rs = st.executeQuery();
           while (rs.next()) {               
               int id_author=rs.getInt("id_author");
               String first_name=rs.getString("first_name");
               String last_name=rs.getString("last_name");
               
               ClassAuthor author = new ClassAuthor(id_author,first_name,last_name);
               lista.add(author);
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
    
    
    public ArrayList<ClassAuthor> SearchAuthor(String search){
       ArrayList<ClassAuthor> lista = new ArrayList<ClassAuthor>();
       
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           st = conn.prepareStatement("select * from author where last_name = "+search +" order by id_author desc");
           rs = st.executeQuery();
           while (rs.next()) {               
               int id_author=rs.getInt("id_author");
               String first_name=rs.getString("first_name");
               String last_name=rs.getString("last_name");
               
               ClassAuthor author = new ClassAuthor(id_author,first_name,last_name);
               lista.add(author);
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
    
    
    public ArrayList<String> ShowNameAuthors(){
       ArrayList<String> lista = new ArrayList<String>();
       
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           st = conn.prepareStatement("select * from author");
           rs = st.executeQuery();
           while (rs.next()) {     
               lista.add(String.valueOf(rs.getInt("first_name")));
               
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
    
    
    public String getNameAuthor(int id){
       String nameAuthor="";
        try {
          conn = DriverManager.getConnection(ruta,usuario,pass);
          String sql = "select CONCAT(first_name,' ',last_name) as name from author where id_author="+id;
          st = conn.prepareStatement(sql);
          rs = st.executeQuery();
          while (rs.next()) {               
               nameAuthor=rs.getString("name");
           }
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
       return nameAuthor;
   }
}