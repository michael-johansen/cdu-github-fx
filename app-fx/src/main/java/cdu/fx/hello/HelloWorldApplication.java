package cdu.fx.hello;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import java.util.Locale;
import java.util.ResourceBundle;


public class HelloWorldApplication extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("layout.fxml"));
        Locale locale = new Locale(getParameters().getNamed().get("locale"));
        fxmlLoader.setResources(ResourceBundle.getBundle("messages", locale));
        primaryStage.setScene(fxmlLoader.load());
        primaryStage.show();
    }
}
