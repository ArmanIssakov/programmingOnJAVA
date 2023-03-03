package listing12;

class MyThread implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("Дочерний поток:\t"+i);
            try {
                Thread.sleep(1200);
            }
            catch (InterruptedException e){
                System.out.println("Прерывание дочернего потока");
            }
        }
    }
}
public class Listing12_1 {
    public static void main(String[] args) {
        System.out.println("Начинается выполнение программы");
        Thread t=new Thread(new MyThread());
        System.out.println("Запускается дочерный поток");
        t.start();
        for (int k=0;k<=5;k++){
            System.out.println("Главный поток:\t"+(char)('A'+k));
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                System.out.println("Прерывание главного потока");
            }
        }
        System.out.println("Выполнение программы завершено");
    }
}
