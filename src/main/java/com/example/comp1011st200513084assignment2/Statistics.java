package com.example.comp1011st200513084assignment2;

import com.google.gson.annotations.SerializedName;

public class Statistics {
    @SerializedName("assists")
    private int assists;

    @SerializedName("blocks")
    private int blocks;

    @SerializedName("fastBreakPoints")
    private int fastBreakPoints;

    @SerializedName("pointsInPaint")
    private int pointsInPaint;

    @SerializedName("points")
    private int points;

    @SerializedName("pointsOffTurnovers")
    private int pointsOffTurnovers;

    @SerializedName("totReb")
    private int rebounds;

    @SerializedName("steals")
    private int steals;

    @SerializedName("turnovers")
    private int turnovers;

    public int getAssists() {
        return assists;
    }

    public int getBlocks() {
        return blocks;
    }

    public int getFastBreakPoints() {
        return fastBreakPoints;
    }

    public int getPointsInPaint() {
        return pointsInPaint;
    }

    public int getPoints() {
        return points;
    }

    public int getPointsOffTurnovers() {
        return pointsOffTurnovers;
    }

    public int getRebounds() {
        return rebounds;
    }

    public int getSteals() {
        return steals;
    }

    public int getTurnovers() {
        return turnovers;
    }
}
