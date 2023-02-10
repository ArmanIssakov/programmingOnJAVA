package listing4;
import javax.swing.*;


public class Listing4_2 {
    public static void main(String[] args) {
        ImageIcon img;
        String animal;
        String file = "c:/Users/arman/OneDrive/Рабочий стол/codeInJava/lis4_1/";
        String wolf = "Волк";
        String fox = "Лиса";
        String tree = "Дерево";
        animal = JOptionPane.showInputDialog(null,wolf+" или "+fox+"?", "Укажите название окна",JOptionPane.QUESTION_MESSAGE);
        if (animal == null){
            System.exit(0);
        }
        else if(animal.equalsIgnoreCase(wolf)){
            file +="wolf.png";
            animal = wolf;
        }
        else if(animal.equalsIgnoreCase(fox)){
            file +="fox.png";
            animal = fox;
        }
        else{
            file +="tree.png";
            animal = tree;
        }
        img = new ImageIcon(file);
        JOptionPane.showMessageDialog(null, img, animal, JOptionPane.PLAIN_MESSAGE);

    }
    
}
