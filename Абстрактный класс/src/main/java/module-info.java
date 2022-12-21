module com.example.task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.exampleLABA2_1 to javafx.fxml;
    exports com.exampleLABA2_1;
}