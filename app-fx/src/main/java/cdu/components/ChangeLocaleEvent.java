package cdu.components;

import javafx.event.Event;
import javafx.event.EventType;

import java.util.Locale;

/**
 * User: Michael Johansen
 * Date: 30.05.2015
 * Time: 11:20
 */
public class ChangeLocaleEvent extends Event {
    private final Locale locale;

    public ChangeLocaleEvent(Locale locale) {
        super(EventType.ROOT);
        this.locale = locale;
    }

    public Locale getLocale() {
        return locale;
    }
}
