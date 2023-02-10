package listing2;
import java.util.Scanner;
public class Listing2_5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in, "Cp1251");
        int nowYear = 2022;
        String name;
        int age;
        double height;
        double mass;
        System.out.print("Как вас зовут ?");
        name = myScanner.nextLine();
        System.out.print("Сколько вам лет? ");
        age = myScanner.nextInt();
        System.out.print("Ваш рост(в метрах)? ");
        height = myScanner.nextDouble();
        System.out.print("Ваш вес (в киллограмах)? ");
        mass = myScanner.nextDouble();
        double bmi = mass/height/height;
        System.out.println("Здравствуйте "+name+"!");
        System.out.println("Вы родились "+(nowYear-age)+ "году");
        System.out.printf("Ваш индекс массы тела: %5.2f\n",bmi);
        /*% - идентификатор иструкции форматирования, 5 - значит всего 5 чисел, 
        2 - две цифры после запятой, f - отобразится числовое значение с плавающей запятой */

    }
}
