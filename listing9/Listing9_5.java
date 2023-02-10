package listing9;

class Base95<X>{
    X data;

    Base95(X data){
        this.data = data;
    }

    void show(){
        System.out.println(data);
    }
}

class Alpha95 extends Base95<Integer>{
    Alpha95(Integer n){
        super(n);
    }

    @Override
    void show(){
        System.out.print("Целочисленное поле: ");
        super.show();
    }
}

class Bravo95 extends Base95<String>{
    Bravo95(String txt){
        super(txt);
    }

    @Override
    void show(){
        System.out.print("Текстовое поле: ");
        super.show();
    }
}

class Charlie95 extends Base95<Character>{
    Charlie95(Character s){
        super(s);
    }

    @Override
    void show(){
        System.out.print("Символьное поле: ");
        super.show();
    }
}
public class Listing9_5 {
    public static void main(String[] args) {
        Alpha95 A = new Alpha95(123);
        Bravo95 B = new Bravo95("Object B");
        Charlie95 C = new Charlie95('C');

        A.show();
        B.show();
        C.show();
    }
}
