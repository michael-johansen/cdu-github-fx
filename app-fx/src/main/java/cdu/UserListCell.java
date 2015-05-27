package cdu;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import no.ciber.github.model.User;

import java.io.IOException;

/**
 * Created by Michael on 26.05.2015.
 */
public class UserListCell extends ListCell<User> {

    public ImageView imageView;
    public Label label;

    @Override
    protected void updateItem(User item, boolean empty) {
        super.updateItem(item, empty);
        if(item == null || empty){
            setGraphic(null);
        } else {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/components/userListCell.fxml"));
            loader.setControllerFactory(clazz -> this);

            try {
                Node graphic = loader.load();

                assert imageView != null;
                assert label != null;

                imageView.setImage(new Image(item.getAvatarUrl() + "&s=50"));
                label.setText(item.getLogin());

                setGraphic(graphic);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
