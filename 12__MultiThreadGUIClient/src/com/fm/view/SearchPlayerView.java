package com.fm.view;

import com.fm.controller.SearchPlayerController;
import com.fm.server.Task;
import com.fm.server.model.SearchPlayerModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchPlayerView  extends JFrame {
    private JPanel pane = new JPanel();
    private JPanel line1 = new JPanel();
    private JPanel line2 = new JPanel();
    private JPanel line3 = new JPanel();
    private JPanel line4 = new JPanel();
    private JPanel line5 = new JPanel();
    private JPanel line6 = new JPanel();

    private JTextField Fname;
    private JTextField Fclub ;
    private JTextField Fposition ;
    private JTextField Fnationality ;
    private JLabel Lname;
    private JLabel Lclub ;
    private JLabel Lposition ;
    private JLabel Lnationality ;
    private JButton Bsearch;
    private JTextArea resultArea = new JTextArea(10,50);


    private Task task;

    public SearchPlayerView(SearchPlayerController controller, SearchPlayerModel model){

 //       JFrame jFrame = new JFrame("FM - Find a Player");
  //      jFrame.setSize(500,500);
  //      jFrame.setVisible(true);

  //      jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setName("FM - Find a Player");
        setSize(600,500);
        Font font = new Font("Serif",Font.PLAIN,24) ;


        Lname = new JLabel("name");
        Lname.setFont(font);
        Fname = new JTextField(60);
        Lname.add(Fname);

        Lclub = new JLabel("club");
        Lclub.setFont(font);
        Fclub = new JTextField(60);
        Lclub.add(Fclub);

        Lposition = new JLabel("position");
        Lposition.setFont(font);
        Fposition = new JTextField(60);
        Lposition.add(Fposition);

        Lnationality = new JLabel("nationality");
        Lnationality.setFont(font);
        Fnationality = new JTextField(60);
        Lnationality.add(Fnationality);



        Bsearch = new JButton("search");
        Bsearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                task = new Task();
                task.execute();

                JTextField[] searchConditionList = new JTextField[4];
                if ( Fname.getText() != "null"){
                    searchConditionList[0] = Fname;
                }
                if ( Fclub.getText() != "null"){
                    searchConditionList[1] = Fclub;
                }
                if ( Fposition.getText() != "null"){
                    searchConditionList[2] = Fposition;
                }
                if ( Fnationality.getText() != "null"){
                    searchConditionList[3] = Fnationality;
                }
                SearchPlayerActionListener spal = new SearchPlayerActionListener(searchConditionList,controller);

                spal.actionPerformed(e);

                resultArea.setSize(200,100);
                resultArea.append(spal.getjTextArea().getText());



            }
        });


        resultArea.scrollRectToVisible(new Rectangle(600,500));

        JScrollPane scrollPane = new JScrollPane(resultArea);

        line1.add(Lname);line1.add(Fname);
        line2.add(Lclub);line2.add(Fclub);
        line3.add(Lposition);line3.add(Fposition);
        line4.add(Lnationality);line4.add(Fnationality);
        line5.add(Bsearch);
        line6.add(scrollPane);

        pane.add(line1);pane.add(line2);pane.add(line3);pane.add(line4);pane.add(line5);pane.add(line6);
        pane.setLayout(new BoxLayout(pane,BoxLayout.Y_AXIS));
        setContentPane(pane);
        setVisible(true);
    }



    // your code here

}

