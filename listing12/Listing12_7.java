package listing12;
import static javax.swing.JOptionPane.*;

public class Listing12_7 {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(()->{
            int k=1,s=0;
            while (true){
                System.out.println(Thread.currentThread().getName()+": "+s);
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){}
                s+=k;
                k++;
            }
        },"Вычисление суммы");

        t.setDaemon(true);
        int res;
        t.start();
        do {
            Thread.sleep(3000);
            res=showConfirmDialog(null,
                    "Закончить вычисление суммы?",
                    "Сумма чисел",
                    YES_OPTION);
        }while (res !=YES_OPTION);
    }
}
