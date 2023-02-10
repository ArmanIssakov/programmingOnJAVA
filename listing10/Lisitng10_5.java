package listing10;

class MyClass105{
    private int number;

    MyClass105(int n){
        number = n;
    }    

    void set(int n){
        number = n;
    }

    int get(){
        return number;
    }
}

@FunctionalInterface
interface MyGetter105{
    int myget(MyClass105 obj);
}

@FunctionalInterface
interface MySetter105{
    void myset(MyClass105 obj, int n);
}


public class Lisitng10_5 {
    public static void main(String[] args) {
        MyClass105 obj = new MyClass105(100);
        System.out.println("Создан объект с полем 100");

        MyGetter105 A = MyClass105::get;
        MySetter105 B = MyClass105::set; 

        System.out.println("Переменная А: "+A.myget(obj));
        System.out.println("Перенная obj: "+obj.get());

        obj.set(200);
        System.out.println("Полю присвоено значение 200");
        System.out.println("Переменная А: "+A.myget(obj));
        
        B.myset(obj, 300);
        System.out.println("Выполнена команда B.myset(obj,300)");
        System.out.println("Переменная А: "+A.myget(obj));
        System.out.println("Перенная obj: "+obj.get());

        obj = new MyClass105(400);
        System.out.println("Создан объект с полем 400");
        System.out.println("Переменная А: "+A.myget(obj));
        System.out.println("Перенная obj: "+obj.get());

        B.myset(obj, 500);
        System.out.println("Выполнена команда B.myset(obj,500)");
        System.out.println("Переменная А: "+A.myget(obj));
        System.out.println("Перенная obj: "+obj.get());

    }
}
