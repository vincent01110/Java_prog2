package Labels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);

        JLabel label = new JLabel(); // create a label object
        label.setText("¿Qué hora es?"); // set text of label
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); //set text TOP, CENTER, BOTTOM of imageicon

        label.setForeground(Color.MAGENTA);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setIconTextGap(100); // gape between image and text
        label.setBackground(Color.BLACK);
        label.setOpaque(true); //display background color

        /**ImageIcon image = new ImageIcon("astr.png");
        label.setIcon(image);*/

        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.setLayout(null);
        label.setBounds(frame.getWidth()/4,frame.getHeight()/4,
                        frame.getWidth()/2,frame.getWidth()/2);



        frame.add(label);
        //frame.pack();
    }
}
