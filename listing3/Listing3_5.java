package listing3;

class List3_5{
    static int count = 0;
    List3_5(){
        count ++;
        System.out.println("Создан объект номер "+count);
    }
    static void show(){
        System.out.println("Количество объектов: "+count);
    }
}
public class Listing3_5 {
    public static void main(String[] args) {
        List3_5.show();
        List3_5 objA = new List3_5();
        List3_5 objB = new List3_5();
        List3_5 objC = new List3_5();
        List3_5.show();
        objB.show();
        objC.show();
    }
}
