package br.edu.ifba.saj.ads.poo.exercicio_emprestimo_livro_2.App.login;

import br.edu.ifba.saj.ads.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {

    @FXML
    private Button botaoEntrar;

    @FXML
    void entrar(ActionEvent event) {
        App.setRoot("secondary.fxml");
    }

}
