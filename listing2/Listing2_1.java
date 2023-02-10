package listing2;
import javax.swing.JOptionPane;
public class Listing2_1 {
    public static void main(String[] args) {
    int number = 123;
    double x =12.3;
    char symb = 'A';
    boolean state = true;
    String myText = "Используемые переменные:\n Целое число: "+number+"\n"+"Действительное число:"+x+"\n"+"Символ:"+symb+"\n"+"Логическое значение:"+state;
    JOptionPane.showMessageDialog(null, myText, "Мое сообщение", JOptionPane.INFORMATION_MESSAGE);
    System.out.println(myText);
}
    
}
