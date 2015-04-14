package cdu.fx.hello;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class HelloWorldApplication extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        /** This is ugly! Move this to fxml */
        primaryStage.setScene(new Scene(new Label("Hello CDU!")));
        primaryStage.show();
    }
}
