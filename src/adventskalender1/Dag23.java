package adventskalender1;

import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


class Dag23 {
    public static void Lucka23 () {
        final ImageIcon icon = new ImageIcon(Dag23.class.getResource("/adventskalender1/julgran.png"));
        
        JOptionPane.showMessageDialog(Index.getInstance(), "23 December \nIdag ska du få testa en julplinga!", "Lucka 23",
                JOptionPane.INFORMATION_MESSAGE, icon);
        JOptionPane.showMessageDialog(Index.getInstance(), "Välkommen till årets julplinga i adventskalendern! ");
        
        plinga(5);
    }

    public static void plinga(int n) {
        for (int i = 1; i <= n; i++) {
            Toolkit.getDefaultToolkit().beep();
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}