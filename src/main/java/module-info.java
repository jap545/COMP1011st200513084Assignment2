module com.example.comp1011st200513084assignment2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
            
                            
    opens com.example.comp1011st200513084assignment2 to javafx.fxml;
    exports com.example.comp1011st200513084assignment2;
}