package com.fm.repository;

import com.fm.view.SearchCondition;
import com.fm.unit.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PlayerSearchPredicateFactory {
    public static List<Predicate<Player>> makeConditions(List<SearchCondition> searchConditions) {

        List<Predicate<Player>> predicateList= new ArrayList<>();


        for(SearchCondition s : searchConditions) {

            Predicate<Player> players = player -> (player.getName().contains(s.getCondition()));
            Predicate<Player> players1 = player -> player.getClub().contains(s.getCondition());
            Predicate<Player> players2 = player -> player.getNationality().contains(s.getCondition());
            Predicate<Player> players3 = player -> player.getPositions().contains(s.getCondition());

            predicateList.add(players);
            predicateList.add(players1);
            predicateList.add(players2);
            predicateList.add(players3);
        }
        return predicateList;
    }
}
