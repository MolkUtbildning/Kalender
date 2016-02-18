package adventskalender1;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



class Dag22 {
    public static void Lucka22 () {
        while (true) {
            try {
                ImageIcon ikon = new ImageIcon(Dag22.class.getResource("/adventskalender1/julgran.png"));
                
                JOptionPane.showMessageDialog(Index.getInstance(), "22 December \nIdag ska vi rita ut en gran gjord av plustecken",
                        "Lucka 22", JOptionPane.INFORMATION_MESSAGE, ikon);

                String s = JOptionPane.showInputDialog(Index.getInstance(), "Mata in höjden på granen");
                
                if (s == null)
                    break;

                String tree = "";
                int treeSize = Integer.parseInt(s);

                for (int i = 0; i < treeSize; i++) {
                    int loopCount = 0;
                    
                    for (int j = 0; j < treeSize - i; j++) {
                        tree = tree + "  ";
                    }
                    
                    while (loopCount < 2 * i + 1) {
                        tree = tree + "+";
                        loopCount++;
                    }
                    tree = tree + "\n";
                }

                JLabel label = new JLabel();
                label.setForeground(Color.GREEN);
                JOptionPane.showMessageDialog(Index.getInstance(), tree);
                
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(Index.getInstance(), "Felaktig inmatning!");
            }
        }
    }    
}
