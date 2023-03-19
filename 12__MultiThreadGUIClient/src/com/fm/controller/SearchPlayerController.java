package com.fm.controller;




import com.fm.server.model.PlayerRepository;
import com.fm.server.model.PlayerSearchPredicateFactory;
import com.fm.server.model.SearchPlayerModel;
import com.fm.view.search.SearchCondition;


import javax.swing.table.DefaultTableModel;
import java.util.List;

public class SearchPlayerController {
    DefaultTableModel model;

    public SearchPlayerController(DefaultTableModel model){
        this.model = model;
    }

    public void searchPlayer(List<SearchCondition> conditions){
        Object[][] newData = PlayerRepository.toArray(
                PlayerRepository.getInstance().query(
                        PlayerSearchPredicateFactory.makeConditions(conditions)));
        model.setDataVector(newData, SearchPlayerModel.TABLE_HEADER);
    }

    public DefaultTableModel getModel(){
        return model;
    }


}

