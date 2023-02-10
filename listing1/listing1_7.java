package listing1;
import java.util.Scanner;
public class listing1_7 {
    public static void main(String[] args) {
        Scanner myScaner =new Scanner(System.in, "Cp1251");//charsetName:"Cp1251" - это выбор кодировки символов для кирилицы
        String day, month;
        System.out.print("Какой сегодня день?");
        day = myScaner.nextLine();
        System.out.print("Какой сегодня месяц?");
        month = myScaner.nextLine();
        String myText;
        myText = "Сегодня" +day+", месяц -"+month;
        System.out.println(myText);
                
    }
}
