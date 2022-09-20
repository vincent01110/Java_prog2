package JOptionPane;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        /**
        JOptionPane.showMessageDialog(null, "This is some useless info",
                                        "title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is some useless info",
                                        "title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is some useless info",
                                        "title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is some useless info",
                                        "title", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is some useless info",
                                        "title", JOptionPane.ERROR_MESSAGE);
         */

        /**
        int answer = JOptionPane.showConfirmDialog(null, "do you know ligma?",
                                        "title", JOptionPane.YES_NO_OPTION);
        if (answer == 1){
            JOptionPane.showMessageDialog(null, "Deez nuts",
                    "title", JOptionPane.WARNING_MESSAGE);
        }
        */

        /**
        String name = JOptionPane.showInputDialog("What is your name?: ");
        System.out.println("Hello, " + name);
        */

        String[] responses = {"No, you are awsome!", "Thank you!", "*blush*"};
        ImageIcon icon = new ImageIcon("icon.png");
        JOptionPane.showOptionDialog(null, "You are awsome!", "secrete message",
                                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                     icon, responses, 0);


    }
}
