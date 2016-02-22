package adventskalender1;

import javax.swing.*;
import java.awt.*;

class Dag17 {
    public static void Lucka17 () {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();

        try {
            ImageIcon ikon = new ImageIcon(Dag17.class.getResource("/adventskalender1/julgran.png"));
            
            JOptionPane.showMessageDialog(Index.getInstance(), "17 December \n Idag ska vi testa på att skriva ut gångertabellen.",
                    "Lucka 17", JOptionPane.INFORMATION_MESSAGE, ikon);

            while (true) {
                String rader = JOptionPane.showInputDialog(Index.getInstance(), "Ange hur många gångertabeller du vill visa (Ej decimaler, bara heltal):");
                String tabell = "";
                
                if (rader == null)
                    break;

                
                int rad = Integer.parseInt(rader);

                if (rad > 170) {
                    JOptionPane.showMessageDialog(Index.getInstance(), "Värdet är för högt!");
                    break;
                }

                for (int i = 1; i <= rad; i++) {
                    for (int x = 1; x <= i; x++) {
                        tabell = tabell + i * x + "  ";
                    }
                    tabell = tabell + "\n";
                    //System.out.println(i);
                }


                JTextArea textArea = new JTextArea(tabell);
                JScrollPane scrollPane = new JScrollPane(textArea);
                textArea.setLineWrap(true);
                textArea.setWrapStyleWord(true);
                scrollPane.setPreferredSize(new Dimension((int) ( Math.round(width) - (0.5 * Math.round(width))), (int) (Math.round(height) - (0.5 * Math.round(height)))));

                JOptionPane.showMessageDialog(null, scrollPane, "Lucka 17",
                        JOptionPane.YES_NO_OPTION);


              //  JOptionPane.showMessageDialog(Index.getInstance(), tabell, "Lucka 17", JOptionPane.INFORMATION_MESSAGE, ikon);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(Index.getInstance(), "Felaktig inmatning!");
        }
    }
}