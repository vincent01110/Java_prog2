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
    private Game newGame = new Game();

    MyNewWindow(){

        background = new JLabel();
        background.setBounds(0,0,500,500);

        startButton = new JButton("START");
        startButton.setFocusable(false);
        startButton.setBounds(150,100,200,75);
        startButton.setFont(new Font("",Font.ITALIC,25));
        startButton.setBackground(Color.GREEN);
        startButton.setForeground(Color.WHITE);
        startButton.addActionListener(this);

        ladderBoardButton = new JButton("Ladderboard");
        ladderBoardButton.setFocusable(false);
        ladderBoardButton.setVerticalAlignment(JLabel.CENTER);
        ladderBoardButton.setBounds(150,200,200,75);
        ladderBoardButton.setFont(new Font("",Font.ITALIC,25));
        ladderBoardButton.setBackground(Color.YELLOW);
        ladderBoardButton.setForeground(Color.WHITE);
        ladderBoardButton.addActionListener(this);

        exitButton = new JButton("Exit");
        exitButton.setFocusable(false);
        exitButton.setVerticalAlignment(JLabel.CENTER);
        exitButton.setBounds(150,300,200,75);
        exitButton.setFont(new Font("",Font.ITALIC,25));
        exitButton.setBackground(Color.RED);
        exitButton.setForeground(Color.WHITE);
        exitButton.addActionListener(this);

        background.add(exitButton);
        background.add(startButton);
        background.add(ladderBoardButton);
        frame.add(newGame);
        newGame.setVisible(false);
        frame.add(background);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(510,510);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton){
            background.setVisible(false);
            newGame.setVisible(true);
        }
        if (e.getSource() == ladderBoardButton){
            new Ladderboard();
        }
        if (e.getSource() == exitButton){

        }
    }
    public void paintGrid(Graphics g){
        for (int i = 0; i < 300/10; i++){
            g.drawLine(i*10,0,i*10, 300);
        }
    }
}
