package listing8;

class Base86{
    String name;

    Base86(String txt){
        name = txt;
    }

    //Конструктор создания копии
    Base86(Base86 obj){
        name = obj.name;
    }
}

class MyClass86 extends Base86{
    int code;

    MyClass86(String txt, int n){
        super(txt);

        code = n;
    }

    MyClass86(MyClass86 obj){
        super(obj);
        code = obj.code;
    }

    void show86(){
        System.out.println("Текстовое поле: "+name);
        System.out.println("Целочисленное поле: "+code);
    }
}
public class Listing8_6 {
    public static void main(String[] args){
        MyClass86 A = new MyClass86("Yellow", 200);

        MyClass86 B = new MyClass86(A);

        A.name = "Red";
        A.code = 100;

        MyClass86 C = new MyClass86(new MyClass86("Green", 300));

        System.out.println("Объект A");
        A.show86();
        System.out.println("Объект B");
        B.show86();
        System.out.println("Объект C");
        C.show86();


    }

}
