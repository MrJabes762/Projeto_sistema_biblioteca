package br.edu.ifba.saj.ads.poo.app;

import java.io.IOException;

import br.edu.ifba.saj.ads.App;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}