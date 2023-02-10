package listing3;
class MyClass1{
    int number;
    char symbol;
    MyClass1(){
        number = 100;
        symbol = 'A';

    }
    MyClass1(int n, char s){
        number = n;
        symbol = s;

    }
    void show(){
        System.out.println("Значение полей: "+number+" и "+symbol);

    }

}
public class Listing3_4 {
    public static void main(String[] args) {
        MyClass1 objA = new MyClass1();
        MyClass1 objB = new MyClass1(200, 'B');
        System.out.println("Объект ObjA");
        objA.show();
        System.out.println("Объект ObjB");
        objB.show();
    }
}
