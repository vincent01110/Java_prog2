package ProgressBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgressBarDemo implements ActionListener {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();
    JButton button = new JButton();

    ProgressBarDemo() {

        bar.setValue(100);
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("Calibri", Font.BOLD, 25));
        bar.setForeground(Color.GREEN);
        bar.setBackground(Color.RED);

        button.setText("Hit me!");
        button.setBounds(160, 100, 100, 30);
        button.addActionListener(this);
        button.setFocusable(false);


        frame.add(bar);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    /**
     * public void fill(){
     * int counter = 0;
     * while(counter <= 100){
     * bar.setValue(counter);
     * try {
     * Thread.sleep(50);
     * } catch (InterruptedException e) {
     * throw new RuntimeException(e);
     * }
     * counter += 1;
     * }
     * bar.setString("Done!");
     * }
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button && bar.getValue() >= 0) {
            bar.setValue(bar.getValue() - 10);
        }
        if (e.getSource() == button && bar.getValue() == 0) {
            bar.setString("DIED!");
            button.setEnabled(false);
        }
    }
}

