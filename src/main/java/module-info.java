module com.example.paginationcontrol {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.jfr;


    opens com.example.paginationcontrol to javafx.fxml;
    exports com.example.paginationcontrol;
}