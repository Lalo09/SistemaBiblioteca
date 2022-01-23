/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;
import Logic.ClassCategory;
import static Settings.config.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author eduardo
 */
public class FunctionsCategory {
    
    public FunctionsCategory(){
        LoadDriver();
    }
    
    //Metodo para guardar una categoria
    public boolean SaveCategory(ClassCategory categoria){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "INSERT INTO category (name,description) "
                   +"values (?,?)";
            //System.out.print(sql);
            st = conn.prepareStatement(sql);
            st.setString(1,categoria.getName());
            st.setString(2,categoria.getDescription());
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

    //Metodo para actualizar una categoria
    public boolean UpdateCategory(ClassCategory categoria){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "UPDATE category SET name=?,description=? "
                   +"WHERE id_category = ?";
            System.out.print(sql);
            st = conn.prepareStatement(sql);
            st.setString(1,categoria.getName());
            st.setString(2,categoria.getDescription());
            st.setInt(3,categoria.getId());
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
    
    //Metodo para eliminar una categoria
    public boolean DeleteCategory(int id){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "DELETE FROM category "
                   +"WHERE id_category = ?";
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
    
    //Metodo para mostrar las categorias y todos sus datos
    public ArrayList<ClassCategory> showCategories(){
       ArrayList<ClassCategory> lista = new ArrayList<ClassCategory>();
       
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           st = conn.prepareStatement("select * from category");
           rs = st.executeQuery();
           while (rs.next()) {               
               int id_category=rs.getInt("id_category");
               String name=rs.getString("name");
               String description=rs.getString("description");
               
               ClassCategory category = new ClassCategory(id_category,name,description);
               lista.add(category);
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
    
    //Metodo para buscar una categoria por el nombre
    public ArrayList<ClassCategory> SearchCategories(String search){
       ArrayList<ClassCategory> lista = new ArrayList<ClassCategory>();
       
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           st = conn.prepareStatement("select * from category where name = "+search);
           rs = st.executeQuery();
           while (rs.next()) {               
               int id_category=rs.getInt("id_category");
               String name=rs.getString("name");
               String description=rs.getString("description");
               
               ClassCategory category = new ClassCategory(id_category,name,description);
               lista.add(category);
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
    
    //Metodo para mostrar os nombres de las categorias (Utilizar en los cmb)
    public ArrayList<String> ShowNameCategories(){
       ArrayList<String> lista = new ArrayList<String>();
       
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           st = conn.prepareStatement("select * from category");
           rs = st.executeQuery();
           while (rs.next()) {     
               lista.add(String.valueOf(rs.getInt("name")));
               
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
    
    //Obtener el id de una categoria dado su nombre
    public String getNameCategory(int id){
       String name = "";
       try {
          conn = DriverManager.getConnection(ruta,usuario,pass);
          String sql = "select name from category where id_category ="+id;
          st = conn.prepareStatement(sql);
          rs = st.executeQuery();
          while (rs.next()) {               
               name=rs.getString("name");
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
       return name;
   }
}