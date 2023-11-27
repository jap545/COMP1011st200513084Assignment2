package com.example.comp1011st200513084assignment2;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class GameStatisticsResponse {
    @SerializedName("response")
    private List<GameStatistics> response;

    public List<GameStatistics> getResponse() {
        return response;
    }
}
