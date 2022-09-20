package Buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener
{
    JButton button;
    JLabel label;

    MyFrame() {

        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        button.addActionListener(this);
        //button.addActionListener(e -> System.out.println("poo"));
        button.setText("I'm a button!");
        button.setFocusable(false);

        ImageIcon icon = new ImageIcon("icon.png");
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic sans", Font.BOLD, 25));
        button.setIconTextGap(-5);
        button.setForeground(Color.MAGENTA);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false); //disables button

        label = new JLabel();
        ImageIcon icon2 = new ImageIcon("icon2.png");
        label.setIcon(icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            /**System.out.println("poo");
            button.setEnabled(false);*/
            label.setVisible(true);
        }
    }
}

