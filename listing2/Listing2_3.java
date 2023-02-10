package listing2;
import javax.swing.JOptionPane;
public class Listing2_3 {
    public static void main(String[] args) {
        int age,year,birth;
        String result;
        result = JOptionPane.showInputDialog("Какой сейчас год?: ");
        //Преобразование текста в целое число
        year = Integer.parseInt(result);
        result = JOptionPane.showInputDialog("Сколько вам лет?: ");
        age = Integer.parseInt(result);
        birth = year - age;
        JOptionPane.showMessageDialog(null,birth,"Год рождение пользователя",JOptionPane.INFORMATION_MESSAGE);
    }
}
