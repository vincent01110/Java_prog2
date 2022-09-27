package DragNDrop;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    DragPanel dragPanel = new DragPanel();
    MyFrame(){

        this.add(dragPanel);
        this.setSize(1800,950); // sets x and y dimensons of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // the corner X button exits app
        this.setResizable(true); // prevent user from resizing the window
        this.setVisible(true); // make frame visible
    }
}
