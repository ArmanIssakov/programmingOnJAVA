package listing12;

class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<=5;i++){
            System.out.println("Дочерний поток:\t"+i);
            try {
                Thread.sleep(4500);
            }
            catch (InterruptedException e){
                System.out.println("Прерывание дочернего потока");
            }
        }
    }
}
public class Listing12_4 {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Начинается выполнение программы");
        MyThread1 t=new MyThread1();
        System.out.println("Запускается дочерний поток");
        t.start();
        for (int k=0;k<=5;k++){
            System.out.println("Главный поток:\t"+(char)('A'+k));
            Thread.sleep(2000);
        }
        if (t.isAlive()){
            t.join();
        }
        System.out.println("Выполнение программы завершено");
    }
}
