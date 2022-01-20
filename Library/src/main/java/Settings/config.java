/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Settings;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author eduardo
 */
public class config {
    public static final String NAME = "My Library";
    
    //Variables para el manejo de consulta de base de datos
    public static Connection conn = null;
    public static PreparedStatement st = null;
    public static Statement sentencia;
    public static ResultSet rs;
   
    //variables para acceder al servidor de base de datos
    public static final String ruta = "jdbc:mysql://localhost:3306/library";
    public static final String usuario = "root";
    public static final String pass = "";
    
    public static void LoadDriver(){
        try { 
           Class.forName("com.mysql.jdbc.Driver");
           //conn = DriverManager.getConnection(ruta,usuario,pass);
           
       } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
       }
    }
}
