import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setSize(420,420); // sets x and y dimensons of the frame
        this.setTitle("JFrame title goes here"); // sets frame title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // the corner X button exits app
        this.setResizable(true); // prevent user from resizing the window
        ImageIcon image = new ImageIcon("astr.png"); // creates ImageIcon object
        this.setIconImage(image.getImage()); // change icon of frame
        this.getContentPane().setBackground(new Color(0xFCE300)); // changes color of background
        this.setVisible(true); // make frame visible
    }
}
