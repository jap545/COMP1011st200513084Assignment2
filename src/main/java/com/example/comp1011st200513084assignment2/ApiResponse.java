package com.example.comp1011st200513084assignment2;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ApiResponse {
    @SerializedName("results")
    private int results;

    //@SerializedName("response")
    //private ArrayList<Team> response;

    @SerializedName("response")
    private ArrayList<Games> response;

    public int getResults() {
        return results;
    }

    public ArrayList<Games> getResponse() {
        return response;
    }

    //public ArrayList<Team> getResponse() {
    //    return response;
    //}
}
