package com.example.comp1011st200513084assignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class SearchViewController {

    @FXML
    private ListView<Games> listView;

    @FXML
    private Label msgLabel;

    @FXML
    private ImageView imageView1;

    @FXML
    private ImageView imageView2;

    @FXML
    private ProgressBar progressBar;

    @FXML
    private HBox resultsBox;

    @FXML
    private Label resultsMsgLabel;

    @FXML
    private TextField searchTextField1;

    @FXML
    private TextField searchTextField2;

    @FXML
    private VBox selectedVBox;

    @FXML
    private VBox titlesVBox;

    @FXML
    private void initialize()
    {
        progressBar.setVisible(false);
        selectedVBox.setVisible(false);
        titlesVBox.setVisible(false);
        msgLabel.setVisible(false);

        listView.getSelectionModel()
                .selectedItemProperty()
                .addListener((obs, oldValue, gameSelected) -> {
                    if (gameSelected != null)
                    {
                        selectedVBox.setVisible(true);
                        setImage(imageView1, gameSelected.getTeams().getVisitors().getTeamLogo());
                        setImage(imageView2, gameSelected.getTeams().getHome().getTeamLogo());
                    }
                    else
                    {
                        selectedVBox.setVisible(false);
                    }
                });
    }

    private void setImage(ImageView imageView, String imageUrl) {
        try {
            if (imageUrl != null && !imageUrl.isEmpty()) {
                imageView.setImage(new Image(imageUrl));
            } else {
                imageView.setImage(new Image(Main.class.getResourceAsStream("images/default-logo.png")));
            }
        } catch (IllegalArgumentException e) {
            imageView.setImage(new Image(Main.class.getResourceAsStream("images/default-logo.png")));
        }
    }

    @FXML
    private void searchForTeams(ActionEvent event) throws IOException, InterruptedException {
        int firstTeam = Integer.parseInt(searchTextField1.getText().trim());
        int secondTeam = Integer.parseInt(searchTextField2.getText().trim());
        ApiResponse apiResponse=APIUtility.callGamesApi(firstTeam,secondTeam);
        titlesVBox.setVisible(true);
        listView.getItems().clear();
        listView.getItems().addAll(apiResponse.getResponse());
        resultsMsgLabel.setText("Showing "+ listView.getItems().size() + "of " + apiResponse.getResults());
    }

}
