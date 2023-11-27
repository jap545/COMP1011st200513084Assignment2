package com.example.comp1011st200513084assignment2;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class GameStatistics {
    @SerializedName("team")
    private Team team;

    @SerializedName("statistics")
    private List<Statistics> statistics;

    public Team getTeam() {
        return team;
    }

    public List<Statistics> getStatistics() {
        return statistics;
    }
}
