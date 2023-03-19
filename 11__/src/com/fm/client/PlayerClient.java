package com.fm.client;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fm.unit.Player;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;


public class PlayerClient {
    private static ObjectMapper mapper = new ObjectMapper();
    private static final HttpClient client = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .build();
    public static void main(String[] args){
        String url = "http://localhost:9000/players?";
        String urlplus = "";

        Scanner scanner = new Scanner(System.in);
        List<String> conditions = new ArrayList<>();

        while(scanner.hasNext()){
            String option = scanner.next();
            String[] params = option.split(" ");
            conditions.add(option);
            //conditions.add(params[0]);
            //conditions.add(params[1]);
        }
        System.out.println(conditions);
        System.out.println(conditions.size());


        for(int i = 0 ; i <= conditions.size()/2; i+=2){
            urlplus += conditions.get(i);
            urlplus += "=";
            urlplus += conditions.get(i+1);
            if(i+2 != conditions.size()) {urlplus += "&";}
        }



        try{


            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create(url + urlplus)).build();
            HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

            String result = response.body();

            CollectionType playerListType = mapper.getTypeFactory().constructCollectionType(List.class, Player.class);

            List<Player>  players = mapper.readValue(result,playerListType);

            System.out.println(players);



        }catch (InterruptedException | IOException e){
            System.err.println(e);

        }
    }

}