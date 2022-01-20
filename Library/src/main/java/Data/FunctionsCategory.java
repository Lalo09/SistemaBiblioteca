/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;
import Logic.ClassCategory;
import static Settings.config.*;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author eduardo
 */
public class FunctionsCategory {
    
    public FunctionsCategory(){
        LoadDriver();
    }
    
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

    public boolean UpdateCategory(ClassCategory categoria){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "UPDATE category SET name=?,description?)"
                   +"WHERE id_category = ?";
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
}
