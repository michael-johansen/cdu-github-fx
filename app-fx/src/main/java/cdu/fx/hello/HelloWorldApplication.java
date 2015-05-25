package cdu.fx.hello;

import javafx.application.Application;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;


public class HelloWorldApplication extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Locale locale = new Locale(getParameters().getNamed().get("locale"));
        loadForLocale(primaryStage, locale);
        primaryStage.show();
        primaryStage.addEventHandler(EventType.ROOT, event -> {
                if (event instanceof ChangeLocaleEvent){
                    loadForLocale(primaryStage, ((ChangeLocaleEvent)event).getLocale());
                }
        });
    }

    private void loadForLocale(Stage primaryStage, Locale locale) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("layout.fxml"));
            fxmlLoader.setResources(ResourceBundle.getBundle("messages", locale));
            primaryStage.setScene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
