package listing9;

class Base96{
    
    String name;

    Base96(String txt){
        name = txt;
    }

    void show(){
        System.out.println("Текстовое поле: "+name);
    }
}

class Alpha96 extends Base96{

    int number;

    Alpha96(String txt, int n){
        super(txt);
        number = n;
    }

    @Override 
    void show(){
        super.show();
        System.out.println("Целочисленное поле: "+number);
    }
}

class Bravo96 extends Alpha96{

    char symbol;

    Bravo96(String txt, int n, char s){
        super(txt,n);
        symbol = s;
    }

    @Override
    void show(){
        super.show();
        System.out.println("Символьное поле: "+symbol);
    }
}

class MyClass96<X extends Base96>{

    X obj;

    MyClass96(X obj){
        this.obj = obj;
    }

    void show(){
        System.out.println("Объект класса MyClass96");
        obj.show();
    }
}
public class Listing9_6 {
    public static void main(String[] args) {
        MyClass96<Alpha96> A = new MyClass96<>(new Alpha96("Alpha", 123));
        MyClass96<Bravo96> B = new MyClass96<>(new Bravo96("Bravo", 321, 'B'));

        A.show();
        B.show();
    }

    
}
