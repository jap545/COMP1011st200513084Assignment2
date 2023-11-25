package com.example.comp1011st200513084assignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class StatsViewController implements StatsLoader {

    @FXML
    private Label assistsLabel1;

    @FXML
    private Label assistsLabel2;

    @FXML
    private Label blocksLabel1;

    @FXML
    private Label blocksLabel2;

    @FXML
    private Label fastBreakPointsLabel1;

    @FXML
    private Label fastBreakPointsLabel2;

    @FXML
    private ImageView imageView1;

    @FXML
    private ImageView imageView2;

    @FXML
    private Label pointsInPaintLabel1;

    @FXML
    private Label pointsInPaintLabel2;

    @FXML
    private Label pointsLabel1;

    @FXML
    private Label pointsLabel2;

    @FXML
    private Label pointsOffTurnoversLabel1;

    @FXML
    private Label pointsOffTurnoversLabel2;

    @FXML
    private Label reboundsLabel1;

    @FXML
    private Label reboundsLabel2;

    @FXML
    private Label stealsLabel1;

    @FXML
    private Label stealsLabel2;

    @FXML
    private Label teamLabel1;

    @FXML
    private Label teamLabel2;

    @FXML
    private Label turnoversLabel1;

    @FXML
    private Label turnoversLabel2;

    @FXML
    void backToSearch(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event,"search-view.fxml");
    }
    public void loadStats(int gameId){
        System.out.println("loadStats-"+gameId);
    }

}
