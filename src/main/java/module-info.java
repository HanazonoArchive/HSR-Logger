module hsrlogger.hsrlogger {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens hsrlogger.hsrlogger to javafx.fxml;
    exports hsrlogger.hsrlogger;
    exports hsrlogger.hsrlogger.STATS;
    opens hsrlogger.hsrlogger.STATS to javafx.fxml;
    exports hsrlogger.hsrlogger.Algorithm;
    opens hsrlogger.hsrlogger.Algorithm to javafx.fxml;
}