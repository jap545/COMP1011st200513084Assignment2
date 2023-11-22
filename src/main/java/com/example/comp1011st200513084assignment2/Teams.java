package com.example.comp1011st200513084assignment2;

import com.google.gson.annotations.SerializedName;

public class Teams {
    @SerializedName("visitors")
    private Visitors visitors;

    @SerializedName("home")
    private Home home;

    // Getters
    public Visitors getVisitors() {
        return visitors;
    }

    public Home getHome() {
        return home;
    }
    public String getVisitorName() {
        return visitors != null ? visitors.getTeamName() : "Unknown Visitor";
    }

    public String getHomeName() {
        return home != null ? home.getTeamName() : "Unknown Home";
    }
}
