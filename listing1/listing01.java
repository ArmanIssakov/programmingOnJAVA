package listing1;
import javax.swing.JOptionPane; /* для использования в программе класса JOptionPlane из библиотеки Swing. 
Библиотека Swing содержит набор классов для разработка приложений с графическим интерфейсом*/

public class listing01 {
    /*инструкция public означает,что метод открытый, и доступ к нему существует и вне пределов класса  */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Первая программа на Java","Сообщение",JOptionPane.WARNING_MESSAGE);
        /*showMessageDialog является методом описанным в классе JoptionPlane */
    }
}
