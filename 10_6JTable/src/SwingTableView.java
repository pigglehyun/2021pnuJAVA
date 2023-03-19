import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class SwingTableView extends JFrame implements ActionListener {
    JTable jTable = new JTable();
    public SwingTableView(DefaultTableModel model){
        Font font = new Font("serif",Font.PLAIN,24);
        UIManager.put("Table.font",font);
        jTable = new JTable();
        jTable.setModel(model);
        jTable.setRowHeight(24);
      //  jTable.getPreferredScrollableViewportSize(new Dimension(800,150));

        JScrollPane scrollPane = new JScrollPane(jTable);
        final JButton button = new JButton("Info");
        button.setMnemonic(KeyEvent.VK_I);
        button.setAlignmentX(CENTER_ALIGNMENT);
        button.setFont(font);
        button.addActionListener(this);

        getContentPane().setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        add(scrollPane);
        add(button);



    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if( 0<= jTable.getSelectedRow()){
            int colnum = jTable.getColumnCount();
            for(int i = 0 ; i < colnum ; i++){
                System.out.print("\t\t\t" + jTable.getModel().getValueAt(jTable.getSelectedRow(),i));
            }
            System.out.println();
        }

    }

}
