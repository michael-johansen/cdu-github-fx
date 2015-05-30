package cdu.components;

import javafx.event.ActionEvent;
import javafx.event.Event;

import java.util.Locale;

/**
 * User: Michael Johansen
 * Date: 30.05.2015
 * Time: 11:13
 */
public class LocaleSelectionToolbarController {
    public void changeToNorsk(ActionEvent actionEvent) {
        Event.fireEvent(actionEvent.getTarget(), new ChangeLocaleEvent(new Locale("no")));
    }

    public void changeToEnglish(ActionEvent actionEvent) {
        Event.fireEvent(actionEvent.getTarget(), new ChangeLocaleEvent(new Locale("en")));
    }

}
