package listing3;
import javax.swing.JOptionPane;
class MyClass{//Описание класса
    int number;//Поле класса
    char symbol;//Поле класса
}
public class Listing3_1 {//Описание класса с главным методотом программы:
    public static void main(String[] args) {//Главный метод программы
        MyClass obj = new MyClass();//Создание объекта
        obj.number = 100;
        obj.symbol = 'A';
        String myText = "Число: "+obj.number+"\n";
        myText +="Символ: "+obj.symbol;
        JOptionPane.showMessageDialog(null,myText,"Сообщение",JOptionPane.INFORMATION_MESSAGE);
    }
}
