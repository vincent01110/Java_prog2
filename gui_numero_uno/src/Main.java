import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    int i = 0;
    JLabel label;
    JFrame frame;

    public Main() {
        frame = new JFrame();

        JButton button = new JButton("Click me");
        button.addActionListener(this);
        button.setSize(200, 100);
        label = new JLabel("No. clicks: 0");

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 100, 300));
        //panel.setSize(500, 300);
        frame.setSize(500, 300);
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);


        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("IDK");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {

        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        i++;
        label.setText("No. clicks: " + i);
    }
}