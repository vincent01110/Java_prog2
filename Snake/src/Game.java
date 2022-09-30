import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;

public class Game extends JPanel {
    private JLabel shadow;
    Game(){
        shadow = new JLabel();
        shadow.setBounds(100,100,310,310);
        shadow.setBackground(Color.WHITE);
        shadow.setOpaque(true);

        this.add(new GameField());
        this.add(shadow);
        this.setLayout(null);
        this.setBounds(0,0,500,500);
        this.setBackground(Color.BLACK);
    }


}
