module sistema {
    requires javafx.controls;
    requires javafx.fxml;

    opens sistema to javafx.fxml;
    exports sistema;
}
