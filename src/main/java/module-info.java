module com.treino.list {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.treino.list to javafx.fxml;
    exports com.treino.list;
}