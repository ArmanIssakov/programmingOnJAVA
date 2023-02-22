package listinig11;
import java.util.*;
public class Listing11_3 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        char[] symbs;

        int size,index;

        try{
            System.out.print("Specify array size");

            size=input.nextInt();

            symbs=new char[size];

            System.out.print("| ");

            for(int k=0;k<size;k++) {
                symbs[k] = (char) ('A' + k);
                System.out.print(symbs[k] + " |");

            }
            try{
                    System.out.print("\nSpecify index:");
                    index=input.nextInt();
                    System.out.println("Symbol-"+symbs[index]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("No such element");
            }
            finally {
                System.out.println("Array created successfully");
            }
            System.out.println("Numeric value specified for index");
        }
        catch (InputMismatchException e){
            System.out.println("Error:you didn't enter number");
        }
        catch (NegativeArraySizeException e){
            System.out.println("Invalid size array");
        }
        System.out.println("Program execution completed");

    }
}
