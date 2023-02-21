package listinig11;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class Listing11_2 {
    public static void main(String[] args) {
        String input;
        char[] symbs;
        int size,index;

        input=showInputDialog(null,
                "Specify array size",
                "Symbol array",
                QUESTION_MESSAGE
        );

        try {
            size=parseInt(input);
            symbs=new char[size];
            String txt="| ";
            for(int k=0;k<size;k++){
                symbs[k]=(char)('A'+k);
                txt+=symbs[k]+" |";
            }
            showMessageDialog(null,
                    txt,
                    "Symbol from array",
                    INFORMATION_MESSAGE
            );

            input=showInputDialog(null,
                    "Specify index of element",
                    "Array element index",
                    QUESTION_MESSAGE
            );

            index=parseInt(input);

            txt="Index-"+index+"\nSymbol-"+symbs[index];

            showMessageDialog(null,
                    txt,
                    "Symbol",
                    INFORMATION_MESSAGE
            );

        }
        catch (NumberFormatException e){
            showMessageDialog(null,
                    "Unfortunately an error has occurred",
                    "Error",
                    WARNING_MESSAGE
            );
        }
        catch (NegativeArraySizeException e){
            showMessageDialog(null,
                    "Invalid array size",
                    "Error",
                    ERROR_MESSAGE
            );
        }
        catch (ArrayIndexOutOfBoundsException e){
            showMessageDialog(null,
                    "Are you sure? There is no such element!",
                    "Error while selecting index",
                    QUESTION_MESSAGE
            );
        }
    }
}
