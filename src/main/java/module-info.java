module sistema {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens sistema to javafx.fxml;
    exports sistema;
}
