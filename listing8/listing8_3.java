package listing8;

class Listing83{
    int number;

    Listing83(int n){
        number = n;
    }
}
public class listing8_3 {
    static void swap(Listing83 A, Listing83 B){
        System.out.println("Выполняется метод swap():");
        System.out.println("Объект A: "+A.number);
        System.out.println("Объект B: "+B.number);

        Listing83 X = B;
        B = A;
        A = X;

        System.out.println("Значения аргументов изменены");
        System.out.println("Объект А: "+A.number);
        System.out.println("Объект B: "+B.number);
        System.out.println("Завершение выполнения метода swap()");
    }

    public static void main(String[] args) {
        Listing83 A = new Listing83(100);
        Listing83 B = new Listing83(200);
        System.out.println("До вызова метода swap(): A.number= "+A.number+" и B.number= "+B.number);
        swap(A, B);
        System.out.println("После вызова метода swap(): A.number= "+A.number+" и B.number= "+B.number);
    }
}
