package cdu;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventType;

import java.util.Locale;

/**
 * Created by Michael on 28.05.2015.
 */
// Implement initializable, add fields
public class HelloController {
    public void changeToNorsk(ActionEvent actionEvent) {
        Event.fireEvent(actionEvent.getTarget(), new ChangeLocaleEvent(new Locale("no")));
    }

    public void changeToEnglish(ActionEvent actionEvent) {
        Event.fireEvent(actionEvent.getTarget(), new ChangeLocaleEvent(new Locale("en")));
    }

    public static class ChangeLocaleEvent extends Event{
        private final Locale locale;

        public ChangeLocaleEvent(Locale locale) {
            super(EventType.ROOT);
            this.locale = locale;
        }

        public Locale getLocale() {
            return locale;
        }
    }
}
