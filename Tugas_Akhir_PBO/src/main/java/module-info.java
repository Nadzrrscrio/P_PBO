module org.example.tugas_akhir_pbo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.mail;


    opens org.example.tugas_akhir_pbo to javafx.fxml;
    exports org.example.tugas_akhir_pbo;
    exports main;
    opens main to javafx.fxml;
}