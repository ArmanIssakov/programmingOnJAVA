package listing10;

class MyClass{
    private int number;

    public MyClass(int number) {
        this.number = number;
    }

    void show(){
        System.out.println("Значение поля: "+number);
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

@FunctionalInterface
interface MyInterface{
    MyClass create(int n);
}
public class Listing10_7 {
    public static void main(String[] args) {
        MyInterface ref = MyClass::new;
        MyClass obj = ref.create(100);

        obj.show();
        obj.setNumber(200);
        obj.show();
    }
}
