package br.edu.ifba.saj.ads.poo.exercicio_emprestimo_livro_2.App;

import java.io.IOException;

import br.edu.ifba.saj.ads.poo.App;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
