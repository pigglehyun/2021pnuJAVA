package com.fm.repository;

import com.fm.unit.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class PlayerQuery {
    public static List<Player> query(List<Player> players, List<Predicate<Player>> conditions) {
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
}
