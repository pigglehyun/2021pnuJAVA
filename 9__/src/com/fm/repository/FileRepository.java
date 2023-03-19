package com.fm.repository;

import com.fm.unit.Player;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Predicate;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import static com.fm.repository.PlayerFactory.createPlayers;


public class FileRepository implements IRepository {
    public static final String[] FILE_HEADER =
            { "sofifa_id", "short_name", "height_cm", "nationality", "club", "overall", "player_positions", "\n" };
    private static FileRepository instance = new FileRepository();
    public final String FILENAME =
            Thread.currentThread().getContextClassLoader().getResource("com/fm/repository/players_20_short.csv").getPath();
    private boolean loaded = false;
    private List<Player> players;
    private int numbers ;

    private FileRepository(){
        load();
    }

    private void load() {
        if (!isLoaded()) {
            List<Player> players = new ArrayList<>();
            BufferedReader bf = null;
            try  {
                bf =  new BufferedReader(new FileReader(FILENAME));
                Files.newBufferedReader(Paths.get(FILENAME));
                String line;
                bf.readLine();
                while ( (line = bf.readLine()) != null) {

                    Player p = createPlayers(line.split(","));


                    players.add(p);
                    numbers++;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            this.players = players;
        }

    }



    public boolean isLoaded() {
        return loaded;
    }
    public static FileRepository getInstance() {return instance;}

    private Player create(String[] fields) {
        return createPlayers(fields);
    }



    @Override
    public int count() {

        return this.players.size();
    }

    @Override
    public void save(Player t) {
        PrintWriter out = null;
        try {

            FileWriter fw = new FileWriter(FILENAME, true);
            BufferedWriter bw = new BufferedWriter(fw);
            Files.newBufferedWriter(Paths.get(FILENAME));
            out = new PrintWriter(bw);

            String[] l = null;

            l = (t.toString().split(","));
            out.println(l);

            bw.close();

        } catch (IOException e) {
            System.err.println(e);
        }
        players.add(t);
        numbers++;
    }


    @Override
    public void delete(Player t) {
        List<Player> newPlayers = new ArrayList<>();

        players.remove(t);
        PrintWriter out = null;


        try {
            FileWriter fw = new FileWriter(FILENAME, false);
            BufferedWriter bw = new BufferedWriter(fw);
            out = new PrintWriter(bw);
            out.println(FILE_HEADER);

            for(Player player:players){

                String l;
                l = (player.toString());
                out.println(l);
                newPlayers.add(player);
            }

            bw.close();
        }catch (IOException e) {
            System.err.println(e);
        }

        this.players = newPlayers;
        loaded = true;

    }

    @Override
    public void deleteById(int id) {
        for(Player p: players){
            if (p.getId() == id){
                delete(p);
                break;
            }
        }
    }
    @Override
    public boolean existsById(int id) {

        return players.contains(findById(id));
    }
    @Override
    public Iterable<Player> findAll() {
        return null;
    }
    @Override
    public Optional<Player> findById(int id) {

        return players.stream().filter(player -> player.getId() == id)
                .findFirst();
    }
    @Override
    public List<Player> findByConditions(List<Predicate<Player>> conditions) {

        List<Player> p = new ArrayList<>();
        int count = 0;
        for (Player pe : players) {
            count = 0;
            for (Predicate<Player> c : conditions) {
                if (c.test(pe)) {
                    count++;
                }
            }
            if (count * 4 == conditions.size()) p.add(pe);
        }
        return p;

    }
    //your code here

}
