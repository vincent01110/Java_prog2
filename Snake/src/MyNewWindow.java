import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyNewWindow extends JFrame {
    private JFrame frame = new JFrame("Snake");

    Menu menu;

    MyNewWindow(){

        frame.add(menu = new Menu());
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(600,600);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setFocusable(true);
        frame.setVisible(true);
        if (menu.getStarted() == 1){
            frame.remove(menu);
            frame.add(new Game());
        }
    }
}
