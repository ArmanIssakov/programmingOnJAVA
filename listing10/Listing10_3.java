package listing10;

@FunctionalInterface
interface Alpha{
    void showA();
}

@FunctionalInterface
interface Bravo{
    void showB();
}

@FunctionalInterface
interface Charlie{
    void showC();
}
public class Listing10_3 {
    public static void main(String[] args) {
        Alpha A = ()->System.out.println("Используем лямбда-выражение");
        A.showA();

        Bravo B = ()->System.out.println("Используем лямбда-выражение");
        B.showB();
        
        Charlie C = ()->System.out.println("Используем лямбда-выражение");
        C.showC();
    }
}
