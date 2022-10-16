import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JPanel implements ActionListener {
    private JButton startButton;
    private JButton ladderBoardButton;
    private JButton exitButton;
    private int started = 0;

    Menu(){

        this.setBounds(0,0,600,600);

        startButton = new JButton("START");
        startButton.setFocusable(false);
        startButton.setBounds(200,100,200,75);
        startButton.setFont(new Font("",Font.ITALIC,25));
        startButton.setBackground(Color.GREEN);
        startButton.setForeground(Color.WHITE);
        startButton.addActionListener(this);

        ladderBoardButton = new JButton("Ladderboard");
        ladderBoardButton.setFocusable(false);
        ladderBoardButton.setVerticalAlignment(JLabel.CENTER);
        ladderBoardButton.setBounds(200,200,200,75);
        ladderBoardButton.setFont(new Font("",Font.ITALIC,25));
        ladderBoardButton.setBackground(Color.YELLOW);
        ladderBoardButton.setForeground(Color.WHITE);
        ladderBoardButton.addActionListener(this);

        exitButton = new JButton("EXIT");
        exitButton.setFocusable(false);
        exitButton.setVerticalAlignment(JLabel.CENTER);
        exitButton.setBounds(200,300,200,75);
        exitButton.setFont(new Font("",Font.ITALIC,25));
        exitButton.setBackground(Color.RED);
        exitButton.setForeground(Color.WHITE);
        exitButton.addActionListener(this);

        this.add(exitButton);
        this.add(startButton);
        this.add(ladderBoardButton);
        this.setBackground(Color.BLACK);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton){
            this.setVisible(false);
            started = 1;
        }
        if (e.getSource() == ladderBoardButton){
            new Ladderboard();
        }
        if (e.getSource() == exitButton){
            System.exit(0);
        }
    }

    public int getStarted() {
        return started;
    }
}
