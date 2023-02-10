package listing10;

class MyClass108{

    int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setNumber(){
        this.number = 0;
    }

}

@FunctionalInterface
interface Alpha108{
    void none();
}

@FunctionalInterface
interface Bravo108{
    void one(int n);
}

public class Listing10_8 {
    public static void main(String[] args) {
        MyClass108 obj = new MyClass108();

        Alpha108 A = obj::setNumber;
        Bravo108 B = obj::setNumber;

        B.one(100);
        System.out.println("Значение поля: "+obj.number);

        A.none();
        System.out.println("Значение поля: "+obj.number);
    }
}
