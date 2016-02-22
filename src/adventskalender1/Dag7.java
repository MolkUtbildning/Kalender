package adventskalender1;

import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Dag7 {
    public static void Lucka7 () {
        {   ImageIcon ikon = new ImageIcon(Dag7.class.getResource("/adventskalender1/julgran.png"));
            String s = Calendar.getInstance().getTime().toString(); int i = s.indexOf(':');
            JOptionPane.showMessageDialog(null, "07 December\nKlockan är:" + s.substring(i - 2, i + 6), "Lucka 07", JOptionPane.INFORMATION_MESSAGE, ikon); }




    }


}