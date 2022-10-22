package Login;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Vista {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField correo;

    @FXML
    private PasswordField password;

    @FXML
    void iniciarSesion(ActionEvent event) {

    }

    @FXML
    void registrarse(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert correo != null : "fx:id=\"correo\" was not injected: check your FXML file 'LoginVista.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file 'LoginVista.fxml'.";

    }

}
