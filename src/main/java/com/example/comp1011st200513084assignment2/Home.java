package com.example.comp1011st200513084assignment2;

import com.google.gson.annotations.SerializedName;

public class Home {
    @SerializedName("name")
    private String teamName;
    @SerializedName("id")
    private int teamId;
    @SerializedName("nickname")
    private String teamNickname;
    @SerializedName("code")
    private String teamCode;
    @SerializedName("logo")
    private String teamLogo;

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

    public String getTeamLogo() {
        return teamLogo;
    }
}
