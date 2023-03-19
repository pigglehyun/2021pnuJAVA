import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonView extends JFrame {
    public ButtonView(){
        JFrame jframe = new JFrame("view.ButtonView");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(600,80);
        Toolkit kit = Toolkit.getDefaultToolkit();



        JButton jButton1 = new JButton("Disable middle button");
        JButton jButton2 = new JButton("Middle button");
        JButton jButton3 = new JButton("Enable middle button");

        jButton1.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(jframe.getBackground(),8),
                BorderFactory.createLineBorder(Color.GRAY,1)
        ));
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(true);

            }
        });

        jButton2.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(jframe.getBackground(),8),
                BorderFactory.createLineBorder(Color.GRAY,1)
        ));
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jframe,"dialog");
            }
        });

        jButton3.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(jframe.getBackground(),8),
                BorderFactory.createLineBorder(Color.GRAY,1)
        ));
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton2.setEnabled(true);
                jButton1.setEnabled(true);
                jButton3.setEnabled(false);
            }
        });






        jframe.add(jButton1,BorderLayout.WEST);
        jframe.add(jButton2,BorderLayout.CENTER);
        jframe.add(jButton3,BorderLayout.EAST);
        jframe.setVisible(true);
        jframe.setVisible(true);
        jframe.setVisible(true);
    }
}
