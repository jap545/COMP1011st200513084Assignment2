package com.example.comp1011st200513084assignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
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
    public void loadStats(int gameId) {
        try {
            GameStatisticsResponse response = APIUtility.callGamesStatisticsApi(gameId);

            //the response contains two GameStatistics objects for two teams
            GameStatistics team1Stats = response.getResponse().get(0);
            GameStatistics team2Stats = response.getResponse().get(1);

            updateUI(team1Stats, true); // Update UI for team 1
            updateUI(team2Stats, false); // Update UI for team 2
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void updateUI(GameStatistics gameStats, boolean isTeam1) {
        Team team = gameStats.getTeam();
        Statistics stats = gameStats.getStatistics().get(0);
        if (isTeam1) {
            teamLabel1.setText(team.getTeamName());
            assistsLabel1.setText(String.valueOf(stats.getAssists()));
            blocksLabel1.setText(String.valueOf(stats.getBlocks()));
            fastBreakPointsLabel1.setText(String.valueOf(stats.getFastBreakPoints()));
            pointsInPaintLabel1.setText(String.valueOf(stats.getPointsInPaint()));
            pointsLabel1.setText(String.valueOf(stats.getPoints()));
            pointsOffTurnoversLabel1.setText(String.valueOf(stats.getPointsOffTurnovers()));
            reboundsLabel1.setText(String.valueOf(stats.getRebounds()));
            stealsLabel1.setText(String.valueOf(stats.getSteals()));
            turnoversLabel1.setText(String.valueOf(stats.getTurnovers()));
            setImage(imageView1, team.getTeamLogo());

        } else {
            teamLabel2.setText(team.getTeamName());
            assistsLabel2.setText(String.valueOf(stats.getAssists()));
            blocksLabel2.setText(String.valueOf(stats.getBlocks()));
            fastBreakPointsLabel2.setText(String.valueOf(stats.getFastBreakPoints()));
            pointsInPaintLabel2.setText(String.valueOf(stats.getPointsInPaint()));
            pointsLabel2.setText(String.valueOf(stats.getPoints()));
            pointsOffTurnoversLabel2.setText(String.valueOf(stats.getPointsOffTurnovers()));
            reboundsLabel2.setText(String.valueOf(stats.getRebounds()));
            stealsLabel2.setText(String.valueOf(stats.getSteals()));
            turnoversLabel2.setText(String.valueOf(stats.getTurnovers()));
            setImage(imageView2, team.getTeamLogo());

        }
    }

    private void setImage(ImageView imageView, String imageUrl) {
        try {
            if (imageUrl != null && !imageUrl.isEmpty()) {
                imageView.setImage(new Image(imageUrl));
            } else {
                // Set a default image if the URL is invalid
                imageView.setImage(new Image(Main.class.getResourceAsStream("images/default-logo.png")));
            }
        } catch (IllegalArgumentException e) {
            // Set a default image in case of an exception
            imageView.setImage(new Image(Main.class.getResourceAsStream("images/default-logo.png")));
        }
    }


}
