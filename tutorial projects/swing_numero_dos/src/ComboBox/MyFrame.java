package ComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JComboBox comboBox;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"(None)","dog", "cat", "bird"};
        Integer[] numbers = {1,2,3,4,5,6,7,8};
        Double[] smthgNumbers = {1.3, 3.6, 7.8};

        comboBox = new JComboBox(smthgNumbers);
        comboBox.addActionListener(this);
        //comboBox.setEditable(true);
        //System.out.println(comboBox.getItemCount());
        //comboBox.addItem("horse");
        //comboBox.insertItemAt("pig",5);
        comboBox.setSelectedIndex(0);
        //comboBox.removeItem("dog");
        //comboBox.removeItemAt(3);
        //comboBox.removeAllItems();


        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox) {
            System.out.println(comboBox.getSelectedItem());
            //System.out.println(comboBox.getSelectedIndex());
        }
    }
}
