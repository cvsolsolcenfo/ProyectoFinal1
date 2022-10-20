package Controlador;
import Vista.*;
import Modelo.*;
public class Main {
    public static void main (String []args){
        boolean ok;

        ok = programa.addUsuario(usuario);
        if (ok == true) {
            menu.mostrarTexto("Usuario en espera de ser ingresado");
        } else {
            break;
        }
        break;

    }

}
