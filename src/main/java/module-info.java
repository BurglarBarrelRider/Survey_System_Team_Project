module org.example.surveysystemproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.surveysystemproject to javafx.fxml;
    exports org.example.surveysystemproject;
}