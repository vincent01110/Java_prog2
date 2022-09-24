package ColorChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;
    JColorChooser colorChooser;

    MyFrame(){

        button = new JButton("Pick a Color!");
        button.addActionListener(this);
        label = new JLabel("Lorem ipsum dolor sit amet");
        label.setBackground(Color.WHITE);
        label.setOpaque(true);
        label.setFont(new Font("", Font.PLAIN, 50));

        this.add(button);
        this.add(label);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null,
                    "Pick a Color for the Font!", Color.BLACK);
            label.setForeground(color);
            Color bgcolor = JColorChooser.showDialog(null,
                    "Pick a Color for the Background!", Color.BLACK);
            label.setBackground(bgcolor);
        }
    }
}
