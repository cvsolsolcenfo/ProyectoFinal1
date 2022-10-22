package Controlador;

import Vista.Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
     public static void main (String []args) {
         Login iniciarSesion = new Login();

     }
    public static Connection obtenerConexion (){
        String url ="jdbc:mysql://localhost:3306;"
                + "database=Programa;"
                +"user=sa;"
                +"password=ProyectoFinal1;";

        try {
            Connection con = DriverManager.getConnection(url);
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }

    }
}

