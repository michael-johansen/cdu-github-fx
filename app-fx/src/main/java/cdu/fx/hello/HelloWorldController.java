package cdu.fx.hello;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.Initializable;

/**
 * Created by Michael on 25.05.2015.
 * TODO: Must implement Initializable, so that we can set up data binding. Bind input field text to custom property.
 * TODO: Let the controller know about the fields in the fxml file (@FXML annotation)
 *
 */
public class HelloWorldController {
    public void changeToNorwegian(ActionEvent actionEvent) {
        Event.fireEvent(actionEvent.getTarget(), new ChangeLocaleEvent("no"));
    }

    public void changeToEnglish(ActionEvent actionEvent) {
        Event.fireEvent(actionEvent.getTarget(), new ChangeLocaleEvent("en"));
    }
}
