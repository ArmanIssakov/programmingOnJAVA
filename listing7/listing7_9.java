package listing7;

public class listing7_9 {
    public static void main(String[] args) {
        MyClass1 obj = new MyClass1();
        obj.show();
    }
    
}

interface First1{
    String getFirst1();

    default void show(){
        System.out.println("Интерфейс First1: метод show()");
    }
}

interface Second2 {
    String getSecond();

    default void show(){
        System.out.println("Интерфейс Second2: метод show()");
    }
}

class Base1{
    String getBase(){
        return "Класс Base1";
    }

    void show(){
        System.out.println("Класс Base1: метод show()");
    }
}

class MyClass1 extends Base1 implements First1, Second2{
    public String getFirst1(){
        return "Интерфейс First1";
    }

    public String getSecond(){
        return "Интерфейс Second2";
    }

    public void show(){
        System.out.println("Мы исользуем:");
        System.out.println(getFirst1());
        System.out.println(getSecond());
        System.out.println(getBase());
        First1.super.show();
        Second2.super.show();
        super.show();
    }
}