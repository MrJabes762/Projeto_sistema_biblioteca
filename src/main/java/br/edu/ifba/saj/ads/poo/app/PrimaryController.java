package br.edu.ifba.saj.ads.poo.app;

import java.io.IOException;

import br.edu.ifba.saj.ads.App;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
