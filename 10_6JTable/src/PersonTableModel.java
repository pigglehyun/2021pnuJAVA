import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonTableModel extends DefaultTableModel {
    private static final Object[] columnNames =
            {"First Name","Last Name","Sport","# of Years","Vegetarian"};
    private static Object[][] data ={
            {"Katy" , "Smith" , "Snowboarding", "5" , "false"},
            {"John" , "Doe" , "Rowing", "3" , "true"},
            {"Sue" , "Black" , "Knitting", "2" , "false"},
            {"Jame" , "White" , "Speed reading", "20" , "true"},
            {"Joe" , "Brown" , "Pool", "10" , "false"}
    };
    public PersonTableModel(){
        super(data,columnNames);
    }
}
