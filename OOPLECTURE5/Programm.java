package OOPLECTURE5;

public class Programm {
    public static void main(String[] args) {
        Presenter p = new Presenter(new SumModel(), new View());
        p.buttonClick();
    }
}
