import javax.swing.*;
import java.awt.*;

public class HelloSwingWorldView extends JFrame {
    public HelloSwingWorldView(){
        setTitle("HelloSwingWorldView");
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screensize = kit.getScreenSize();
        int sh = screensize.height;
        int sw = screensize.width;
        setSize(sw/2,sh/2);
        add(new JLabel("Hello World"), BorderLayout.CENTER);

    }
}
