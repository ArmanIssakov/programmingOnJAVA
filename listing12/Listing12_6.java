package listing12;
import java.util.Random;

class MyThread126 extends Thread{
    private int count;
    MyThread126(String name, int count){
        super(name);
        this.count=count;
        start();
    }

    @Override
    public void run() {
        System.out.println("Выполняется поток "+getName());

        Random rnd=new Random();

        for (int k=1;k<=count;k++){
            System.out.println("Сообщение от потока "+getName()+":\t"+getName().charAt(0)+k);
            try {
                Thread.sleep(1000+rnd.nextInt(2001));
            }
            catch (InterruptedException e){
                System.out.println("Прерывание потока "+getName());
            }
        }
        System.out.println("Поток "+getName()+" завершен");
    }
}
public class Listing12_6 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Начинает выполняться главный поток");

        //Создание объктов запусков

        MyThread126 A=new MyThread126("ALPHA",5);
        MyThread126 B=new MyThread126("BRAVO",3);
        MyThread126 C=new MyThread126("CHARLY",7);

        for (int k=1;k<=4;k++){
            System.out.println("Сообщение от главного потока:\t"+k);
            Thread.sleep(2000);
        }
        if(A.isAlive()){
            A.join();
        }

        if(B.isAlive()){
            B.join();
        }

        if(C.isAlive()){
            C.join();
        }

        System.out.println("Главный поток завершен");
    }
}
