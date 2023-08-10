package sistema.app.Conttrollers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import sistema.App;

public class TelaInicialController  {

    @FXML
    private Button btnEntrar;

    @FXML
    void entrarNaPaginaInicial(ActionEvent event) throws IOException {
        App.setRoot ("/Telainicial/Telainicial");
    }

}
