package listing1;
import javax.swing.JOptionPane;
public class listing1_5 {
    public static void main(String[] args) {
        String myText;
        myText = JOptionPane.showInputDialog(null, "Введите текст");
        JOptionPane.showMessageDialog(null, "Вы ввели такой текст: \n" + myText);

    }
}
