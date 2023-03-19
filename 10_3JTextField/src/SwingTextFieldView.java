import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingTextFieldView extends  JFrame implements ActionListener {


        JTextField textField;
        JTextArea textArea;


    public SwingTextFieldView() {

        textField = new JTextField(10);
        Font font = new Font(textField.getFont().getName(), textField.getFont().getStyle(), 24);
        textField.setFont(font);
        textField.addActionListener(this);
        Button button = new Button("Enter");



        textArea = new JTextArea(5, 10);
        textArea.setFont(font);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);


        setLayout(new FlowLayout());
        add(textField);
        add(button);
        add(scrollPane);
        this.setSize(10,10);
        this.setVisible(true);



    }

        @Override
        public void actionPerformed (ActionEvent e){
        String text = textField.getText();
        textArea.append(text + "\n");
        textField.selectAll();

        textArea.setCaretPosition(textArea.getDocument().getLength());
    }

}
