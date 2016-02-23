package adventskalender1;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
class Dag7 {
    public static void Lucka7 () {
        String timeStamp = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
        ImageIcon ikon = new ImageIcon(Dag7.class.getResource("/adventskalender1/julgran.png"));
        JOptionPane.showMessageDialog(Index.getInstance(), "07 December\nKlockan är: " + timeStamp,
                "Lucka 07", JOptionPane.INFORMATION_MESSAGE, ikon);
    }
}