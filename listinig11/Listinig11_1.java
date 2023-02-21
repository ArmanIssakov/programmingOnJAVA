package listinig11;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class Listinig11_1 {
    public static void main(String[] args) {
        String input;
        int num;
        input=showInputDialog(null,
                "Enter number",
                "Nmber",
                QUESTION_MESSAGE
        );
        try{
            num=parseInt(input);
            showMessageDialog(null,
                    "Numbers "+(num-1)+","+num+","+(num+1),
                    "Numbers",
                    INFORMATION_MESSAGE
            );
        }catch(Exception e){
            showMessageDialog(null,
                    "Something went wrong",
                    "Error",
                    ERROR_MESSAGE
            );
        }
    }
}
