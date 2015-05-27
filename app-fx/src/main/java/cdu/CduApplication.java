package cdu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Created by Michael on 28.05.2015.
 */
public class CduApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/views/hello.fxml"));
        String locale = System.getenv().getOrDefault("locale", "no");
        loader.setResources(ResourceBundle.getBundle("messages", new Locale(locale)));

        primaryStage.setScene(loader.load());
        primaryStage.show();
        // add event handler
    }

    public static void main(String[] args) {
        launch(args);
    }
}