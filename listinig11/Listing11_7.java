package listinig11;

class MyExeption extends Exception{
    private int code;

    MyExeption(int n){
        super();
        code=n;
    }

    @Override
    public String toString(){
        String txt="Exception from class MyException\n";
        txt+="Error code: "+code+"\n";
        txt+="-------------------";
        return txt;
    }
}

class MyMistake extends RuntimeException{
    private int code;

    MyMistake(int n){
        super();
        code=n;
    }

    @Override
    public String toString(){
        String txt="Exception from class MyMistake\n";
        txt+="Error code: "+code+"\n";
        txt+="*********************";
        return txt;

    }
}
public class Listing11_7 {
    static void alpha(int n) throws MyExeption{
        throw new MyExeption(n);
    }

    static void bravo(int n){
        throw new MyMistake(n);
    }

    public static void main(String[] args) {
        try {
            try {
                alpha(123);
            }
            catch (MyExeption e){
                System.out.println(e);
                bravo(321);
            }
        }
        catch (MyMistake e){
            System.out.println(e);
        }
    }
}
