package cdu;

import javafx.collections.FXCollections;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import no.ciber.github.GitHub;
import no.ciber.github.model.SearchRequest;
import no.ciber.github.model.User;
import no.ciber.github.model.UserSearchResult;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Michael on 26.05.2015.
 */
public class SearchController implements Initializable {
    public TextField query;
    public ListView<User> result;
    private GitHub gitHub = new GitHub();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        result.setCellFactory(param -> new UserListCell());
        query.textProperty().addListener(((observable, oldValue, newValue) -> {
            UserSearchResult userSearchResult = gitHub.searchForUser(new SearchRequest(newValue));
            result.setItems(FXCollections.observableArrayList(userSearchResult.getUsers()));
        }));
    }
}
