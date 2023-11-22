package com.example.comp1011st200513084assignment2;

import com.google.gson.annotations.SerializedName;

public class Team {
    @SerializedName("name")
    private String teamName;
    @SerializedName("id")
    private int teamId;
    @SerializedName("nickname")
    private String teamNickname;
    @SerializedName("code")
    private String teamCode;
    @SerializedName("city")
    private String teamCity;
    @SerializedName("logo")
    private String teamLogo;
    @SerializedName("allstar")
    private boolean teamAllstar;
    @SerializedName("nbaFranchise")
    private boolean teamNbaFranchise;

    public String getTeamName() {
        return teamName;
    }

    public int getTeamId() {
        return teamId;
    }

    public String getTeamNickname() {
        return teamNickname;
    }

    public String getTeamCode() {
        return teamCode;
    }

    public String getTeamCity() {
        return teamCity;
    }

    public String getTeamLogo() {
        return teamLogo;
    }

    public boolean isTeamAllstar() {
        return teamAllstar;
    }

    public boolean isTeamNbaFranchise() {
        return teamNbaFranchise;
    }

    public String toString(){
        return String.format("%s-%s",teamName,teamId);
    }

}
