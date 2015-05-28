package cdu;

import javafx.application.Application;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Created by Michael on 28.05.2015.
 */
public class CduApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        String locale = System.getenv().getOrDefault("locale", "no");
        loadLocale(primaryStage, new Locale(locale));

        primaryStage.show();
        primaryStage.addEventHandler(EventType.ROOT, event -> {
            if(event instanceof HelloController.ChangeLocaleEvent){
                HelloController.ChangeLocaleEvent cle = (HelloController.ChangeLocaleEvent) event;
                loadLocale(primaryStage, cle.getLocale());
            }
        });
    }

    private void loadLocale(Stage primaryStage, Locale locale1)  {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/views/hello.fxml"));
        loader.setResources(ResourceBundle.getBundle("messages", locale1));

        try {
            primaryStage.setScene(loader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}