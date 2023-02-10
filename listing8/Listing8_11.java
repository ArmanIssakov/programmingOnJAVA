package listing8;

abstract class Base811{
    private String name;

    Base811(String txt){
        name = txt;
    }

    void show(){
        System.out.println("Имя объекта: "+name);
    }

    abstract void hello();
}

public class Listing8_11 {
    public static void main(String[] args) {
        Base811 obj = new Base811("Red"){
            void hello(){
                System.out.println("Объект анонимного класса");
            }
        };
        obj.show();
        obj.hello();

        new Base811("Green") {
            void hello(){
                System.out.println("Анонимный объект");
            }
            void showAll(){
                hello();
                show();
            }
        }.showAll();
    }    
}
