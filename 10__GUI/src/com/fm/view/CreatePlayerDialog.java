//package com.fm.view;
//
//import com.fm.controller.SearchPlayerController;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class CreatePlayerDialog extends JDialog {
//
//    private JPanel pane = new JPanel();
//    private JPanel line1 = new JPanel();
//    private JPanel line2 = new JPanel();
//    private JPanel line3 = new JPanel();
//    private JPanel line4 = new JPanel();
//    private JPanel line5 = new JPanel();
//    private JPanel line6 = new JPanel();
//    private JPanel line7 = new JPanel();
//
//    private JLabel Lname = new JLabel("Name");
//    private JLabel Lheight = new JLabel("Height");
//    private JLabel Lnationality = new JLabel("Nationality");
//    private JLabel Lclub = new JLabel("Club");
//    private JLabel Loverall = new JLabel("Overall");
//    private  JLabel Lpositions = new JLabel("Positions");
//    private JTextField Fname = new JTextField(40);
//    private JTextField Fheight = new JTextField(40);
//    private JTextField Fnationality = new JTextField(40);
//    private JTextField Fclub = new JTextField(40);
//    private JTextField Foverall = new JTextField(40);
//    private JTextField Fpositions = new JTextField(40);
//    private JButton OK = new JButton("OK");
//    private JButton cancel = new JButton("Cancel");
//
//    public CreatePlayerDialog(SearchPlayerController controller) {
//
//
//        line1.add(Lname); line1.add(Fname); line1.setLayout(new BoxLayout(line1,2));
//        line2.add(Lheight);line2.add(Fheight);
//        line3.add(Lnationality);line3.add(Fnationality);
//        line4.add(Lclub);line4.add(Fclub);
//        line5.add(Loverall);line5.add(Foverall);
//        line6.add(Lpositions);line6.add(Fpositions);
//        line7.add(OK);line7.add(cancel);
//
//
//
//        setVisible(true);
//
//        setLayout(new FlowLayout());
//        add(line1);
//        add(line2);
//        add(line3);
//        add(line4);
//        add(line5);
//        add(line6);
//        add(line7);
//
//
//    }
//
//    //your code here
//
//}