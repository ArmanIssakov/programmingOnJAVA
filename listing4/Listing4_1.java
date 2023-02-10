package listing4;
import javax.swing.*;
public class Listing4_1 {
    public static void main(String[] args) {
        String input,txt,title;
        int number;
        /*Объектная переменная для записи ссылки
         * на объект пиктограммы*/
        ImageIcon img;
        input = JOptionPane.showInputDialog(null,"Введите целое число:","Проверка числа на четность",JOptionPane.QUESTION_MESSAGE);
        //Проверка выполнен ли ввод:
        if(input==null){//окно появится только в том случае если щелкнуть на cancel или X
            JOptionPane.showMessageDialog(null, "Вы не ввели число!", "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        number = Integer.parseInt(input);
        if(number%2 == 0){
            //Создание объекта пиктограммы
            img = new ImageIcon("naruto.png");
            txt = "Число "+number+" -четное";
            title = "Четное число";

        }
        else{
            img = new ImageIcon("naruto.png");
            txt = "Число "+number+" -нечетное";
            title = "Нечетное число";
        }
        JOptionPane.showMessageDialog(null, txt, title, JOptionPane.PLAIN_MESSAGE,img);
    }
    
}
