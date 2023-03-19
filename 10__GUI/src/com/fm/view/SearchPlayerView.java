package com.fm.view;

import com.fm.controller.SearchPlayerController;
import com.fm.model.SearchPlayerModel;

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
    private JButton Bcreate ;
    private JButton Bdelete ;
    private JTable jTable = new JTable();


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


        Bcreate = new JButton("create");
        Bcreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = new CreatePlayerDialog(controller);
                dialog.setTitle("Create a Player");
                dialog.setSize(500,300);

                dialog.setVisible(true);



            }
        });

        Bdelete = new JButton("delete");
        Bdelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
  //              new DeletePlayerActionListener(model,controller);
            }
        });

        Bsearch = new JButton("search");
        Bsearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

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

            }
        });



        jTable.setModel(model);
        jTable.setRowHeight(24);
        jTable.setPreferredScrollableViewportSize(new Dimension(600,500));

        JScrollPane scrollPane = new JScrollPane(jTable);

        line1.add(Lname);line1.add(Fname);
        line2.add(Lclub);line2.add(Fclub);
        line3.add(Lposition);line3.add(Fposition);
        line4.add(Lnationality);line4.add(Fnationality);
        line5.add(Bcreate);line5.add(Bdelete);line5.add(Bsearch);
        line6.add(scrollPane);

        pane.add(line1);pane.add(line2);pane.add(line3);pane.add(line4);pane.add(line5);pane.add(line6);
        pane.setLayout(new BoxLayout(pane,BoxLayout.Y_AXIS));
        setContentPane(pane);
        setVisible(true);
    }



    // your code here

}
class CreatePlayerDialog extends JDialog {

    private JPanel pane = new JPanel();
    private JPanel line1 = new JPanel();
    private JPanel line2 = new JPanel();
    private JPanel line3 = new JPanel();
    private JPanel line4 = new JPanel();
    private JPanel line5 = new JPanel();
    private JPanel line6 = new JPanel();
    private JPanel line7 = new JPanel();

    private JLabel Lname = new JLabel("Name");
    private JLabel Lheight = new JLabel("Height");
    private JLabel Lnationality = new JLabel("Nationality");
    private JLabel Lclub = new JLabel("Club");
    private JLabel Loverall = new JLabel("Overall");
    private  JLabel Lpositions = new JLabel("Positions");
    private JTextField Fname = new JTextField(40);
    private JTextField Fheight = new JTextField(40);
    private JTextField Fnationality = new JTextField(40);
    private JTextField Fclub = new JTextField(40);
    private JTextField Foverall = new JTextField(40);
    private JTextField Fpositions = new JTextField(40);
    private JButton OK = new JButton("OK");
    private JButton cancel = new JButton("Cancel");

    public CreatePlayerDialog(SearchPlayerController controller) {


        line1.add(Lname); line1.add(Fname); line1.setLayout(new BoxLayout(line1,2));
        line2.add(Lheight);line2.add(Fheight);
        line3.add(Lnationality);line3.add(Fnationality);
        line4.add(Lclub);line4.add(Fclub);
        line5.add(Loverall);line5.add(Foverall);
        line6.add(Lpositions);line6.add(Fpositions);
        line7.add(OK);line7.add(cancel);



        setVisible(true);

        setLayout(new FlowLayout());
        add(line1);
        add(line2);
        add(line3);
        add(line4);
        add(line5);
        add(line6);
        add(line7);


    }

    //your code here

}