import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyNewWindow extends JFrame implements ActionListener {

    private JFrame frame = new JFrame("Snake");
    private JButton startButton;
    private JButton ladderBoardButton;
    private JButton exitButton;
    private JLabel background;
    private JLabel label;

    MyNewWindow(){

        background = new JLabel();
        background.setPreferredSize(new Dimension(500,500));
        background.setBackground(Color.BLACK);
        background.setOpaque(true);

        startButton = new JButton("START");
        startButton.setSize(200,75);

        frame.add(background);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
