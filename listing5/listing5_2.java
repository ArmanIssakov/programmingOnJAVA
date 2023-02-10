package listing5;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class listing5_2 {
    public static void main(String[] args) {
        String[] txt = {"Chaous","Hermes","Heroes","Alecto"};

        String[] files = {"Wallpaper_Chaos.jpg","Wallpaper_Hermes.png","Wallpaper_Heroes.png","Wallpaper_Alecto.png"};

        String folder = "D:/Картинки/Hades/";

        String msg = "Кого показать?";

        String title  = "Olimp";

        ImageIcon img = new ImageIcon(folder + "Wallpaper_Tartarus.jpg");

        String persons;

        persons = (String) JOptionPane.showInputDialog(null, msg, title, JOptionPane.PLAIN_MESSAGE, img, txt, txt[0]);

        if(persons == null){
            System.exit(0);
        }
        for(int k = 0; k < txt.length;k++){
            if(persons.equals(txt[k])){
                img = new ImageIcon(folder + files[k]);
                break;
            }
        }
        JOptionPane.showMessageDialog(null, img, persons, JOptionPane.PLAIN_MESSAGE);

    }

}
