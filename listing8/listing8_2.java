package listing8;

class Listing82{
    int number;

    Listing82(int n){
        number = n;
    }
}
public class listing8_2 {
    static void swap(Listing82 A, Listing82 B){
        System.out.println("Выполняется метод swap()");
        System.out.println("Объект А: "+A.number);
        System.out.println("Объект В: "+B.number);
        int number = B.number;
        B.number = A.number;
        A.number = number;
        System.out.println("Значения полей изменены");
        System.err.println("Объект А: "+A.number);
        System.err.println("Объект B: "+B.number);
        System.out.println("Завершение выполнения метода swap()");
    }

    public static void main(String[] args) {
        Listing82 A = new Listing82(100);
        Listing82 B = new Listing82(200);
        System.out.println("До вызова метода swap(): A.number: "+A.number+" и B.number: "+B.number);
        swap(A, B);
        System.out.println("После вызова метода swap(): A.number: "+A.number+" и B.number: "+B.number);
    }
}
