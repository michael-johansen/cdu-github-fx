package cdu.fx.hello;

import javafx.event.Event;
import javafx.event.EventType;

import java.util.Locale;

/**
 * Created by Michael on 25.05.2015.
 */
public class ChangeLocaleEvent extends Event {
    private final Locale locale;

    public ChangeLocaleEvent(String locale) {
        super(EventType.ROOT);
        this.locale = new Locale(locale);
    }

    public Locale getLocale() {
        return locale;
    }
}
