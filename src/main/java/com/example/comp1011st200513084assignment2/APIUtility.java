package com.example.comp1011st200513084assignment2;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIUtility
{
    /**
     * This method will call the API-NBA with a _ passed in as an argument
     */
    public static ApiTeamResponse callTeamApi(String nbaTeamName) throws IOException, InterruptedException {
        nbaTeamName = nbaTeamName.replaceAll(" ", "%20");

        String uri = "https://api-nba-v1.p.rapidapi.com/teams?name="+nbaTeamName;

        //configure the environment to make a HTTP request (this includes an update to the
        //module-info.java file
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .header("X-RapidAPI-Key", "da9618403dmshb096b7629a615b4p1977a6jsn2a6b7afb80a9")
                .header("X-RapidAPI-Host", "api-nba-v1.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        //this will save a file called movies.json with the API's response
        //HttpResponse<Path> httpResponse = client.send(httpRequest, HttpResponse.BodyHandlers
        //        .ofFile(Paths.get("games.json")));

        HttpResponse<String> httpResponse = client.send(httpRequest, HttpResponse.BodyHandlers
                .ofString());

        //System.out.println(httpResponse.body());

        Gson gson = new Gson();
        return gson.fromJson(httpResponse.body(), ApiTeamResponse.class);

    }

    public static ApiResponse callGamesApi(int firstTeamId, int secondTeamId) throws IOException, InterruptedException {



        String uri = "https://api-nba-v1.p.rapidapi.com/games?h2h="+firstTeamId+"-"+secondTeamId;


        //configure the environment to make a HTTP request (this includes an update to the
        //module-info.java file
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .header("X-RapidAPI-Key", "da9618403dmshb096b7629a615b4p1977a6jsn2a6b7afb80a9")
                .header("X-RapidAPI-Host", "api-nba-v1.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        //this will save a file called movies.json with the API's response
        //HttpResponse<Path> httpResponse = client.send(httpRequest, HttpResponse.BodyHandlers
        //        .ofFile(Paths.get("games.json")));

        HttpResponse<String> httpResponse = client.send(httpRequest, HttpResponse.BodyHandlers
                .ofString());

        //System.out.println(httpResponse.body());

        Gson gson = new Gson();
        return gson.fromJson(httpResponse.body(), ApiResponse.class);
}
    public static GameStatisticsResponse callGamesStatisticsApi(int gameId) throws IOException, InterruptedException {



        String uri = "https://api-nba-v1.p.rapidapi.com/games/statistics?id="+gameId;


        //configure the environment to make a HTTP request (this includes an update to the
        //module-info.java file
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .header("X-RapidAPI-Key", "da9618403dmshb096b7629a615b4p1977a6jsn2a6b7afb80a9")
                .header("X-RapidAPI-Host", "api-nba-v1.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        //this will save a file called movies.json with the API's response
        //HttpResponse<Path> httpResponse = client.send(httpRequest, HttpResponse.BodyHandlers
        //        .ofFile(Paths.get("games.json")));

        HttpResponse<String> httpResponse = client.send(httpRequest, HttpResponse.BodyHandlers
                .ofString());

        //System.out.println(httpResponse.body());

        Gson gson = new Gson();
        return gson.fromJson(httpResponse.body(), GameStatisticsResponse.class);
    }

}

