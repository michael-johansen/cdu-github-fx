package cdu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

/**
 * Created by Michael on 28.05.2015.
 */
public class CduApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(FXMLLoader.load(getClass().getResource("/views/hello.fxml")));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}