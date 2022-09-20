package TextFields;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas", Font.ITALIC, 35));
        textField.setForeground(Color.ORANGE);
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.WHITE);
        //textField.setText("username:");


        button = new JButton("Enter");
        button.addActionListener(this);

        this.add(textField);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            System.out.println("Welcome " + textField.getText());
            textField.setEditable(false);
            button.setEnabled(false);
        }
    }
}
