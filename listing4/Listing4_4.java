package listing4;
import javax.swing.JOptionPane;
public class Listing4_4 {
    class List4_4{
        static String coder(int number){
            String s = "";
            int n = number;
            do{
                s = (n%2)+s;
                n/=2;
            }while(n!=0);
            return s;
        }
        public static void main(String[] args) {
            String input;
            String title = "Вычисление бинарного кода";
            input = JOptionPane.showInputDialog(null,"Введите целое число", title, JOptionPane.QUESTION_MESSAGE);
            if(input == null){
                System.exit(0);
            }
            int num = Integer.parseInt(input);
            String code = coder(num);
            String text = "Вы ввели число "+num;
            text += "\n Бинарный код числа "+code;
            JOptionPane.showMessageDialog(null, text, title, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
