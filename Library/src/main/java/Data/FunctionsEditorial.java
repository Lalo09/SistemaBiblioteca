/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;
import Logic.ClassEditorial;
import static Settings.config.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author eduardo
 */
public class FunctionsEditorial {
    
    public FunctionsEditorial(){
        LoadDriver();
    }
    
    //Metodo para guardar una editorial
    public boolean SaveEditorial(ClassEditorial categoria){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "INSERT INTO editorial (name,description) "
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

    //Metodo para actualizar una editorial
    public boolean UpdateEditorial(ClassEditorial categoria){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "UPDATE editorial SET name=?,description=? "
                   +"WHERE id_editorial = ?";
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
    
    //Metodo para eliminar un editorial
    public boolean DeleteEditorial(int id){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "DELETE FROM editorial "
                   +"WHERE id_editorial = ?";
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
    
    //Metodo para mostrar las editoriales
    public ArrayList<ClassEditorial> showEditoriales(){
       ArrayList<ClassEditorial> lista = new ArrayList<ClassEditorial>();
       
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           st = conn.prepareStatement("select * from editorial");
           rs = st.executeQuery();
           while (rs.next()) {               
               int id_editorial=rs.getInt("id_editorial");
               String name=rs.getString("name");
               String description=rs.getString("description");
               
               ClassEditorial editorial = new ClassEditorial(id_editorial,name,description);
               lista.add(editorial);
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
    
    //Metodo para buscar una editorial
    public ArrayList<ClassEditorial> SearchEditorial(String search){
       ArrayList<ClassEditorial> lista = new ArrayList<ClassEditorial>();
       
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           st = conn.prepareStatement("select * from editorial where name = "+search);
           rs = st.executeQuery();
           while (rs.next()) {               
               int id_editorial=rs.getInt("id_editorial");
               String name=rs.getString("name");
               String description=rs.getString("description");
               
               ClassEditorial editorial = new ClassEditorial(id_editorial,name,description);
               lista.add(editorial);
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
    
    //Metodo para mostrar los nombres de las editoriales
    public ArrayList<String> ShowNameEditoriales(){
       ArrayList<String> lista = new ArrayList<String>();
       
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           st = conn.prepareStatement("select * from editorial");
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
    
    //Obtener el id de un editorial dado su nombre
    public String getNameEditorial(int id){
       String name = "";
       try {
          conn = DriverManager.getConnection(ruta,usuario,pass);
          String sql = "select name from editorial where id_editorial ="+id;
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