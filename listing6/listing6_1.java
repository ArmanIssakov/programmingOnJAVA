// package listing6;
// import javax.swing.*;
// class MyPane extends JOptionPane {
//     static void showMessage(String txt, String title){
//         showMessageDialog(null, txt, title,PLAIN_MESSAGE);
//     }
//     static void showMessage(String txt){
//         showMessage(txt, "Message");
//     }
//     static int getInteger(String txt){
//         String res;
//         res = showInputDialog(null, txt, "Число (по умолчанию 10)", QUESTION_MESSAGE);
//         if(res == null){
//             return 10;
//         }
//         else{
//             return Integer.parseInt(res);
//         }
//     }

// }
// public class listing6_1{
//     public static void main(String[] args) {
//         MyPane.showMessage("Hi");

//         int number;

//         number = MyPane.getInteger("Введите целое число");

//         String txt = "Числа от 1 до "+number+":\n";
//         for(int k = 1; k <= number; k++){
//             txt += k +" ";

//         }
//         MyPane.showMessage(txt, "Целые числа");
//     }
// }
