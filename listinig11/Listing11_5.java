package listinig11;

public class Listing11_5 {

    public static void main(String[] args) {
        Exception me=new Exception("Artificial error");

        try{
            System.out.println("An error is generated");
            try{
                throw me;
            }
            catch (Exception one){
                System.out.println(one);
                System.out.println("And now one error yet");
                throw one;
            }
        }
        catch (Exception two){
            System.out.println(two);
        }

        System.out.println("Program execution completed");
    }
}
