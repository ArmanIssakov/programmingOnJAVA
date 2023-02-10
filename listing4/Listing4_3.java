package listing4;
import javax.swing.JOptionPane;
class List4_3{
    static int decoder(String code){
        int n = code.length();
        int s=0,k=1,q=1,a;
        while(k<=n){
            if(code.charAt(n-k)=='1'){//Проверяем символ в бинарном коде
                a=1;
                // System.out.println(a);
            }
            else{
                a=0;
                // System.out.println(a);
            }
            s+=q*a;
            System.out.println(s);
            //стенень двойки
            q*=2;
            // System.out.println(q);
            k++;
        }
        return s;
    }
}
public class Listing4_3 {
    public static void main(String[] args) {
        String input;
        String title = "Расшифровка бинарного кода";
        input = JOptionPane.showInputDialog(null, "Введите бинарный код", title,JOptionPane.QUESTION_MESSAGE);
        if(input==null){
            System.exit(0);

        }
        int num = List4_3.decoder(input);
        String text = "Вы ввели бинарный код "+input;
        text += "\nКод соответствует числу "+num;
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.INFORMATION_MESSAGE);
    }
}
