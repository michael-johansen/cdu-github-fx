package cdu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * Created by Michael on 28.05.2015.
 */
public class CduApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(new Label("Hello CDU!!")));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}