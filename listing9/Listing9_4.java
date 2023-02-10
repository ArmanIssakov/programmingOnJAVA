package listing9;

class MyClass94{
    String name;

    <X> void show(X arg){
        System.out.println(name+": "+arg);
    }

    public MyClass94(String txt) {
        name = txt;
    }
}
public class Listing9_4 {
    public static void main(String[] args) {
        MyClass94 A=new MyClass94("Object A");
        MyClass94 B=new MyClass94("Object B");

        A.show(123);
        A.show("Alpha");
        A.show('A');

        B.show(123);
        B.show("Bravo");
        B.show("B");
    }
}
