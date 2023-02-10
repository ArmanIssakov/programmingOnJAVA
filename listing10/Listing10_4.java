package listing10;

class MyClass104{
    private int number;

    MyClass104(int n){
        number = n;
    }

    void set(int n){
        number= n;
    }

    int get(){
        return number;
    }
}

interface MyGetter104{
    int myget();
}

interface MySetter104{
    void myset(int n);
}

public class Listing10_4 {
    public static void main(String[] args) {
        MyClass104 obj = new MyClass104(100);
        System.out.println("Создан объект с полем 100");
        //Используем ссылки на методы
        MyGetter104 A = obj::get;
        MySetter104 B = obj::set;
        //Проверяем значение поля, вызовом метода myget()
        //из интерфейсной переменной А:
        System.out.println("Переменная А: "+A.myget());
        //Проверяем значение поля объекта:
        System.out.println("Переменная obj: "+obj.get());
        //Полю объекта прсваиваетсязначение:
        obj.set(200);
        System.out.println("Полю присвоено значение 200");
        System.out.println("Переменная А: "+A.myget());
        
        B.myset(300);
        System.out.println("Выполнена команда B.myset(300)");
        System.out.println("Переменная А: "+A.myget());
        System.out.println("Переменная obj: "+obj.get());
        
        obj = new MyClass104(400);
        System.out.println("Создан объект с полем 400");
        System.out.println("Переменная А: "+A.myget());
        System.out.println("Переменная obj: "+obj.get());

        B.myset(500);
        System.out.println("Выполнена команда B.myset(500)");
        System.out.println("Переменная А: "+A.myget());
        System.out.println("Переменная obj: "+obj.get());
    }
}
