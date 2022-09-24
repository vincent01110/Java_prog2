package KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon rocket;
    MyFrame(){
        
        label = new JLabel();
        label.setBounds(200,200,100,100);
        //label.setBackground(Color.RED);
        //label.setOpaque(true);
        rocket = new ImageIcon("./src/KeyListener/rocket.png");
        label.setIcon(rocket);

        this.getContentPane().setBackground(new Color(0x000000));
        this.add(label);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()){
            case 'a' :
                label.setLocation(label.getX()-10,label.getY());
                break;
            case 'w' :
                label.setLocation(label.getX(),label.getY()-10);
                break;
            case 's' :
                label.setLocation(label.getX(),label.getY()+10);
                break;
            case 'd' :
                label.setLocation(label.getX()+10,label.getY());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case 37 :
                label.setLocation(label.getX()-10,label.getY());
                break;
            case 38 :
                label.setLocation(label.getX(),label.getY()-10);
                break;
            case 40 :
                label.setLocation(label.getX(),label.getY()+10);
                break;
            case 39 :
                label.setLocation(label.getX()+10,label.getY());
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //System.out.println("You released key char: " + e.getKeyChar());
        //System.out.println("You released key char: " + e.getKeyCode());

    }
}
