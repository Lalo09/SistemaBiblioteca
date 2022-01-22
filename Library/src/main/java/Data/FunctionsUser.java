/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;
import Logic.ClassUser;
import static Settings.config.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.*;
import java.text.*;

/**
 * @author eduardo
 */
public class FunctionsUser {
    
    public FunctionsUser(){
        LoadDriver();
    }
    
    public boolean SaveUser(ClassUser user){
       try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
            System.out.println(dateFormat.format(date));
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "INSERT INTO user (first_name,last_name,email,password,created_at) values"
                   +"(?,?,?,?,'"+dateFormat.format(date)+"')";
            //System.out.print(sql);
            st = conn.prepareStatement(sql);
            st.setString(1,user.getFirst_name());
            st.setString(2,user.getLast_name());
            st.setString(3,user.getEmail());
            st.setString(4,user.getPassword());
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

    public boolean UpdateUser(ClassUser user){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "UPDATE user SET first_name=?,last_name=?, email=? "
                   +"WHERE id_user = ?";
            //System.out.print(sql);
            st = conn.prepareStatement(sql);
            st.setString(1,user.getFirst_name());
            st.setString(2,user.getLast_name());
            st.setString(3,user.getEmail());
            st.setInt(4,user.getId());
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

    public boolean DeleteUser(int id){
       try {
            conn = DriverManager.getConnection(ruta,usuario,pass);
            String sql = "DELETE FROM user "
                   +"WHERE id_user = ?";
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
    
    //Metodo para mostrar los usuarios y todos sus datos
    public ArrayList<ClassUser> showUsers(){
       ArrayList<ClassUser> lista = new ArrayList<ClassUser>();
       
       try {
           conn = DriverManager.getConnection(ruta,usuario,pass);
           st = conn.prepareStatement("select * from user");
           rs = st.executeQuery();
           while (rs.next()) {               
               int id_user=rs.getInt("id_user");
               String name=rs.getString("first_name");
               String last_name=rs.getString("last_name");
               String email=rs.getString("email");
               
               ClassUser user = new ClassUser(id_user,name,last_name,email,null,null);
               lista.add(user);
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