package com.example.comp1011st200513084assignment2;

import com.google.gson.annotations.SerializedName;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Games {
    @SerializedName("id")
    private int GameId;

    @SerializedName("season")
    private int season;
    @SerializedName("teams")
    private Teams teams;

    public int getGameId() {
        return GameId;
    }

    public int getSeason() {
        return season;
    }

    public Teams getTeams() {
        return teams;
    }
    @SerializedName("date")
    private GameDate gameDate;

    // ... other methods ...

    public String toString() {
        String formattedDate = formatGameDate(gameDate.getStart());
        return String.format("(%s) - %s VS %s", formattedDate,teams.getVisitorName(), teams.getHomeName());
    }

    private String formatGameDate(String date) {
        try {
            LocalDateTime dateTime = LocalDateTime.parse(date, DateTimeFormatter.ISO_DATE_TIME);
            return dateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        } catch (Exception e) {
            System.err.println("Date parsing error: " + e.getMessage());
            return "Unknown Date";
        }
    }

}
