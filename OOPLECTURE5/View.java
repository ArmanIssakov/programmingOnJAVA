package OOPLECTURE5;

import javax.swing.JOptionPane;

public class View extends JOptionPane {
    
    public int getValueX(){
        String x = showInputDialog(null, "x: ", "Messege",QUESTION_MESSAGE);
        return Integer.parseInt(x);
    }

    public int getValueY(){
        String y = showInputDialog(null, "y: ", "Messege",QUESTION_MESSAGE);
        return Integer.parseInt(y);
    }

    public void showMessage(int result, int x, int y){
        showMessageDialog(null, x +" + "+ y +" = "+ result,"Result Message",INFORMATION_MESSAGE);
    }
}
