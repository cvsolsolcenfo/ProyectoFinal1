//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Vista;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Login {
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField correo;
    @FXML
    private PasswordField password;

    public Login() {
    }

    @FXML
    void iniciarSesion(ActionEvent event) {
        this.correo.getText();
        this.password.getText();
    }

    @FXML
    void registrarse(ActionEvent event) {
    }

    @FXML
    void initialize() {
        assert this.correo != null : "fx:id=\"correo\" was not injected: check your FXML file 'LoginVista.fxml'.";

        assert this.password != null : "fx:id=\"password\" was not injected: check your FXML file 'LoginVista.fxml'.";

    }
}
