package com.fm.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fm.controller.SearchPlayerController;
import com.fm.unit.Player;
import com.fm.view.search.SearchCondition;
import com.fm.view.search.SearchField;

import javax.swing.*;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


public class PlayerClient {
    private static ObjectMapper mapper = new ObjectMapper();
    private static final HttpClient client = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .build();
    public static List<Player> playerClient(JTextField[] searchTermTextFields, SearchPlayerController controller){
        List<Player>  players = new ArrayList<>();
        String url = "http://localhost:9000/players?";
        String urlplus = "";

        List<SearchCondition> searchConditionList = new ArrayList<>();

        String name = searchTermTextFields[0].getText();
        String club = searchTermTextFields[1].getText();
        String position = searchTermTextFields[2].getText();
        String nationality = searchTermTextFields[3].getText();

        int number = 0;
        int num=0;
        for ( JTextField s: searchTermTextFields){
            if(!(s.getText().equals(""))) number++;
        }

        SearchField searchField  = null;
        if(!Objects.equals(name, "")){
            urlplus += "name=";
            urlplus += name;
            num++;
            if(!(num==number)) urlplus+= "&";

        }
        if(!Objects.equals(club, "")){
            urlplus += "club=";
            urlplus += club;
            num++;
            if(!(num==number)) urlplus+= "&";

        }
        if(!Objects.equals(position, "")){
            urlplus += "position=";
            urlplus += position;
            num++;
            if(!(num==number)) urlplus+= "&";

        }
        if(!Objects.equals(nationality, "")){
            urlplus += "nationality=";
            urlplus += nationality;
            num++;
            if(!(num==number)) urlplus+= "&";

        }


        try{


            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create(url + urlplus)).build();
            HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

            String result = response.body();

            CollectionType playerListType = mapper.getTypeFactory().constructCollectionType(List.class, Player.class);

             players = mapper.readValue(result,playerListType);




        }catch (InterruptedException | IOException e){
            System.err.println(e);

        }
        return players;
    }


}