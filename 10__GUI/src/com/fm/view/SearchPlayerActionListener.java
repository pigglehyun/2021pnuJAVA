package com.fm.view;

import com.fm.controller.SearchPlayerController;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class SearchPlayerActionListener implements ActionListener {
    private JTextField[] searchTermTextFields;
    private SearchPlayerController controller;
    private JTable jTable = new JTable();

    public SearchPlayerActionListener(JTextField[] searchTermTextFields, SearchPlayerController controller) {
        super();
        this.searchTermTextFields = searchTermTextFields;
        this.controller = controller;
    }
    public JTable getjTable(){
        return jTable;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        List<SearchCondition> searchConditionList = new ArrayList<>();

        String name = searchTermTextFields[0].getText();
        String club = searchTermTextFields[1].getText();
        String position = searchTermTextFields[2].getText();
        String nationality = searchTermTextFields[3].getText();


        if(!Objects.equals(name, "")){
            SearchCondition searchCondition = new SearchCondition("name",searchTermTextFields[0].getText());
            searchConditionList.add(searchCondition);
        }
        if(!Objects.equals(club, "")){
            SearchCondition searchCondition = new SearchCondition("club",searchTermTextFields[1].getText());
            searchConditionList.add(searchCondition);
        }
        if(!Objects.equals(position, "")){
            SearchCondition searchCondition = new SearchCondition("position",searchTermTextFields[2].getText());
            searchConditionList.add(searchCondition);
        }
        if(!Objects.equals(nationality, "")){
            SearchCondition searchCondition = new SearchCondition("nationality",searchTermTextFields[3].getText());
            searchConditionList.add(searchCondition);
        }

        controller.searchPlayer(searchConditionList);

        jTable.setModel(controller.getModel());
       for(SearchCondition s : searchConditionList){
           System.out.println("field"+s.getField());
           System.out.println("condi"+s.getCondition());
       }




    }


}