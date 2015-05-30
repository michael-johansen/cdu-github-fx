package cdu;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventType;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Michael on 28.05.2015.
 */
public class HelloController implements Initializable {
    public TextField myText;
    public Label myLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        myLabel.textProperty().bind(Bindings.concat(
                resources.getString("greeting"),
                " ",
                myText.textProperty(),
                "!",
                myText.textProperty().length()
        ));
        myLabel.visibleProperty().bind(myText.textProperty().isNotEmpty());
    }

}
