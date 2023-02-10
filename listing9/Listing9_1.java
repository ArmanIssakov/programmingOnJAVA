package listing9;

class MyClass91<X>{
    X data;

    MyClass91(X data){
        this.data = data;
    }
    void show(){
        System.out.println("Значение поля: "+data);
    }
}
public class Listing9_1 {
    public static void main(String[] args) {
        MyClass91<Integer> A = new MyClass91<Integer>(100);

        MyClass91<Character> B = new MyClass91<Character>('B');

        MyClass91<String> C = new MyClass91<String>("Green");

        A.show();
        B.show();
        C.show();
    }
}
