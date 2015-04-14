package cdu.fx.hello;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;


public class HelloWorldApplication extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("layout.fxml"));
        primaryStage.setScene(fxmlLoader.load());
        primaryStage.show();
    }
}
