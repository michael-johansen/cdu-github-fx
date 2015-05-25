package cdu.fx.hello;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringExpression;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Michael on 25.05.2015.
 */
public class HelloWorldController implements Initializable {
    @FXML
    public TextField myInput;
    @FXML
    public Label myLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        StringExpression greeting = Bindings.concat(
                resources.getString("greeting"),
                " ",
                myInput.textProperty(),
                "(",
                myInput.textProperty().length(),
                ")!"
        );
        myLabel.textProperty().bind(greeting);
        myLabel.visibleProperty().bind(myInput.textProperty().isNotEmpty());
    }

    public void changeToNorwegian(ActionEvent actionEvent) {
        Event.fireEvent(actionEvent.getTarget(), new ChangeLocaleEvent("no"));
    }

    public void changeToEnglish(ActionEvent actionEvent) {
        Event.fireEvent(actionEvent.getTarget(), new ChangeLocaleEvent("en"));
    }
}
