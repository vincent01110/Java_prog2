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



}
