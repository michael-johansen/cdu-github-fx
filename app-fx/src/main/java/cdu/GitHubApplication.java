package cdu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import no.ciber.github.GitHub;
import no.ciber.github.model.Repository;
import no.ciber.github.model.SearchRequest;
import no.ciber.github.model.User;
import no.ciber.github.model.UserSearchResult;

import java.net.URL;

/**
 * Created by Michael on 26.05.2015.
 * TODO: Search for users
 * TODO: Present user result in Custom Component (image, name)
 */
public class GitHubApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL location = getClass().getResource("/views/search.fxml");
        Scene scene = FXMLLoader.load(location);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void proto() {
        GitHub gitHub = new GitHub();
        Repository repository = gitHub.getRepository("michael-johansen", "cdu-github-fx");
        User user = gitHub.getUser("michael-johansen");
        UserSearchResult userSearchResult = gitHub.searchForUser(new SearchRequest("michael-johansen", 0, 10));
        userSearchResult.getUsers().forEach(System.out::println);
    }
}
