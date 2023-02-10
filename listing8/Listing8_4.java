package listing8;

class Listing84{
    private int code;
    private String name;

    Listing84(int n, String s){
        System.out.println("Создание объекта:");
        set(n,s).show();
    }

    Listing84 set(int n){
        code = n;
        return this;
    }

    Listing84 set(String s){
        name = s;
        return this;
    }

    Listing84 set(int n, String s){
        return set(n).set(s);
    }

    void show(){
        System.out.println("Поле code= "+code);
        System.out.println("Поле name= "+name);
        System.out.println("----------------");
    }
}
public class Listing8_4 {
    static Listing84 createObject(int n, String s){
        return new Listing84(n, s);
    }

    public static void main(String[] args) {
        Listing84 obj = createObject(100, "alpha");

        obj.set(200).show();
        obj.set("bravo").show();

        obj.show();

        createObject(300, "charlie").set(400, "delta").show();

        obj.show();
    }
}
