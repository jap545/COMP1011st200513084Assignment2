package com.example.comp1011st200513084assignment2;

public class Test {
    public static void main(String[] args) {
        //try {
        //    APIUtility.callApi("Atlanta Hawks");
        //}
        try{
            APIUtility.callGamesApi(2,26);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

