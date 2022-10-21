package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
//    public static void main (String []args){
//        boolean ok;
//
//        ok = programa.addUsuario(usuario);
//        if (ok == true) {
//            menu.mostrarTexto("Usuario en espera de ser ingresado");
//        } else {
//            break;
//        }
//        break;
//
//    }
//
//}
    public static Connection obtenerConexion (){
        String url =";"
                + "database=Programa;"
                +"user=sa;"
                +"password=1234;";

        try {
            Connection con = DriverManager.getConnection(url);
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }

    }
}

