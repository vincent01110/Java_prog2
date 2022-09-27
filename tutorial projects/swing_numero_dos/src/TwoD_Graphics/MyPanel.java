package TwoD_Graphics;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    MyPanel(){
    this.setPreferredSize(new Dimension(500,500));
    this.setBackground(Color.BLACK);
    this.setOpaque(true);
    }
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(5));
        g2d.setPaint(Color.MAGENTA);
        //g2d.drawLine(0,0,500,500);
        //g2d.drawRect(50,50,200,100);
        //g2d.fillRect(50,50,200,100);
        //g2d.drawOval(50,50,100,100);
        //g2d.fillOval(50,50,100,100);
        //g2d.drawArc(50,50,100,100,90,180);

        //g2d.setPaint(Color.RED);
        //g2d.fillArc(50,50,100,100,0,180);
        //g2d.setPaint(Color.WHITE);
        //g2d.fillArc(50,50,100,100,180,180);

        //int[] xpoints = {150,250,350};
        //int[] ypoints = {300,150,300};
        //g2d.setPaint(new Color(0xFCE300));
        //g2d.drawPolygon(xpoints, ypoints,3);
        //g2d.fillPolygon(xpoints, ypoints,3);

        g2d.setFont(new Font("", Font.ITALIC, 50));
        g2d.drawString("Fuck You!", 100, 100);
    }
}
