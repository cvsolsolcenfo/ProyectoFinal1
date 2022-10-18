package Modelo;

public class Usuarios {

        private String nombre;
        private String apellido;
        private int edad;
        private String correo;
        private String password;
        private String foto;


        public Usuarios(String nombre, String apellido, int edad, String correo, String password, String foto) {
                this.nombre = nombre;
                this.apellido = apellido;
                this.edad = edad;
                this.correo = correo;
                this.password = password;
                this.foto = foto;
        }
}
