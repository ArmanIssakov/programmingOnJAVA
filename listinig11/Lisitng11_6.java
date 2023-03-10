package listinig11;

public class Lisitng11_6 {
    static void alpha(int n) throws Exception{

        String txt="Method alpha() with argument "+n;

        throw new Exception(txt);
    }

    static void bravo(int n){

        String txt="Method bravo() with argument "+n;

        try{
            if(n>0){
                throw new Exception(txt);
            }
            else{
                throw new  RuntimeException(txt);
            }
        }
        catch (RuntimeException e){
            throw e;
        }
        catch (Exception e){
            System.out.println("Error handling in cravo():");
            System.out.println(e.getMessage());
            System.out.println("************************");
        }
    }

    static void catchMe(Exception e){
        System.out.println("Error handling in main(): ");
        System.out.println(e.getMessage());
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        try{
            alpha(123);
        }
        catch (Exception e){
            catchMe(e);
        }

        try{
            bravo(123);
        }
        catch (Exception e){
            catchMe(e);
        }

        try{
            bravo(-1);
        }
        catch (Exception e){
            catchMe(e);
        }
    }
}
