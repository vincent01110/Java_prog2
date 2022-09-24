package MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Map;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label;
    Map<String, ImageIcon> map;

    MyFrame(){

        map = new HashMap<>();
        map.put("sexy", new ImageIcon("./src/MouseListener/sexy.png"));
        map.put("gae", new ImageIcon("./src/MouseListener/gae.jpg"));
        map.put("smile", new ImageIcon("./src/MouseListener/smile.jpg"));
        map.put("pain", new ImageIcon("./src/MouseListener/pain.jpeg"));

        label = new JLabel();
        label.setBounds(0,0,500,500);
        ///label.setBackground(Color.RED);
        //label.setOpaque(true);
        label.addMouseListener(this);
        label.setIcon(map.get("smile"));
        //this.addMouseListener(this);

        this.add(label);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //System.out.println("clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //System.out.println("pressed");
        //label.setBackground(Color.YELLOW);
        label.setIcon(map.get("pain"));
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //System.out.println("released");
        //label.setBackground(Color.GREEN);
        label.setIcon(map.get("sexy"));
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //System.out.println("entered");
        //label.setBackground(Color.BLUE);
        label.setIcon(map.get("gae"));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //System.out.println("exited");
        //label.setBackground(Color.RED);
        label.setIcon(map.get("smile"));
    }
}
