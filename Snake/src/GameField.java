import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class GameField extends JPanel {

    final int x[] = new int[30];
    final int y[] = new int[30];
    GameField(){


        this.setBackground(Color.GREEN);
        this.setLayout(null);
        //game_field.setSize(300,300);
        this.setBounds(105, 105, 300,300);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintGrid(g);
    }
    public void paintGrid(Graphics g){
        for (int i = 0; i < 300/10; i++){
            g.drawLine(i*10,0,i*10, 300);
            g.drawLine(0,i*10,300, i*10);
            g.setColor(Color.WHITE);
        }
    }

}
