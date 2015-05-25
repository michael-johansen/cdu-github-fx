package cdu.fx.hello;

import javafx.event.ActionEvent;
import javafx.event.Event;

/**
 * Created by Michael on 25.05.2015.
 */
public class HelloWorldController {
    public void changeToNorwegian(ActionEvent actionEvent) {
        Event.fireEvent(actionEvent.getTarget(), new ChangeLocaleEvent("no"));
    }

    public void changeToEnglish(ActionEvent actionEvent) {
        Event.fireEvent(actionEvent.getTarget(), new ChangeLocaleEvent("en"));
    }
}
