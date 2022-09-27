package TwoD_Graphics;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyPanel myPanel;
    MyFrame(){
        myPanel = new MyPanel();

        this.add(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null); //puts it in the middle of the screen
        this.setVisible(true);
    }
}
