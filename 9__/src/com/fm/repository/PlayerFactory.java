package com.fm.repository;

import com.fm.unit.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerFactory {
    public static Player createPlayersWithoutID(String[] fields){
        Player player = new Player( fields[0], Integer.parseInt(fields[1]),
                fields[2], fields[3], Integer.parseInt(fields[4]), getPosition(fields));
        return player;

    }

    public static Player createPlayers(String[] fields){

        Player player = new Player(getId(fields), getName(fields), getHeight(fields),
                getNationality(fields), getClub(fields), getOverall(fields), getPosition(fields));

        return player;
        //your code here
    }

    private static List<String> getPosition(String[] fields) {
        List<String> positions = new ArrayList<>();
        if (fields[5].startsWith("\"")) {
            for (int i = 5; i < fields.length; i++)
                positions.add(fields[i].replace("\"", "").trim());
        }
        else if (fields[6].startsWith("\"")) {
            for (int i = 6; i < fields.length; i++)
                positions.add(fields[i].replace("\"", "").trim());
        }
        else
        {
            positions.add(fields[Player.POSITION]);
        }
        return positions;
    }

    public static int getOverall(String[] arr) {
        return Integer.parseInt(arr[5]);
    }

    public static String getClub(String[] fields) {
        return fields[4];
    }

    public static String getNationality(String[] fields) {
        return fields[3];
    }

    public static int getHeight(String[] fields) {return Integer.parseInt(fields[2]);}

    public static String getName(String[] fields) {
        return fields[1];
    }

    public static int getId(String[] fields) {
        return Integer.parseInt(fields[0]);
    }
}