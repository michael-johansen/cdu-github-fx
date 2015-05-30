package cdu.components;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ToolBar;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * User: Michael Johansen
 * Date: 30.05.2015
 * Time: 11:13
 */
public class LocaleSelectionToolbar extends ToolBar implements Initializable {

    // init only called for controllers
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            URL fxmlLocation = getClass().getResource("/components/localeSelectionToolbar.fxml");
            Node load = FXMLLoader.load(fxmlLocation);
            getItems().add(load);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
