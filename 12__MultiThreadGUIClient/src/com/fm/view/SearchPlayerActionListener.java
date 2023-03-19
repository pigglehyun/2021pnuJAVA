package com.fm.view;

import com.fm.client.PlayerClient;
import com.fm.controller.SearchPlayerController;
import com.fm.unit.Player;
import com.fm.view.search.SearchCondition;
import com.fm.view.search.SearchField;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class SearchPlayerActionListener implements ActionListener {
    private JTextField[] searchTermTextFields;
    private SearchPlayerController controller;
    private JTextArea jTextArea = new JTextArea(10,10);

    public SearchPlayerActionListener(JTextField[] searchTermTextFields, SearchPlayerController controller) {
        super();
        this.searchTermTextFields = searchTermTextFields;
        this.controller = controller;
    }
    public JTextArea getjTextArea(){
        return jTextArea;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        List<SearchCondition> searchConditionList = new ArrayList<>();

        List<Player> players = PlayerClient.playerClient(searchTermTextFields,controller);
        controller.searchPlayer(searchConditionList);


        jTextArea.setSize(200,100);
        jTextArea.append(players.toString());





    }


}