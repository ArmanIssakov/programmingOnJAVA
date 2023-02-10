package listing3;
import javax.swing.JOptionPane;
class Class{
    int number;
    char symbol;
    // метод для присваивания значений полям
    void set(int n, char s){
        number = n;
        symbol = s;
    }
    // метод возвращает текстовую строку с описанием
    String getInfo(){
        String myText = "Число: "+number+"\n"+"Символ: "+symbol;
        return myText;
    }
}

public class Listing3_2 {
    public static void main(String[] args) {
        Class obj = new Class();
        obj.set(100, 'B');
        JOptionPane.showMessageDialog(null,obj.getInfo(),"Сообщение",JOptionPane.INFORMATION_MESSAGE);
    }
}
