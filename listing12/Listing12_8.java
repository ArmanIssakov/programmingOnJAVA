package listing12;
class MyNumber{
    int number;
}

class MyThread127 extends Thread{
    private MyNumber obj;

    private int time;
    private int count;
    private boolean state;

    public MyThread127(String name, MyNumber obj, int time, int count, boolean state) {
        super(name);
        this.obj = obj;
        this.time = time;
        this.count = count;
        this.state = state;
        start();
    }

    private void line(){
        char s;
        if (state) s='-';
        else s='*';
        for (int k=1;k<=35;k++){
            System.out.print(s);
        }
        System.out.println("");
    }

    @Override
    public void run() {
        for(int k=1;k<=count;k++){
            synchronized (obj){
                line();
                System.out.println("Поток "+getName()+":исходное значение "+obj.number);
                try {
                    Thread.sleep(time);
                }
                catch (InterruptedException e){
                    System.out.println(e);
                }
                if (state) obj.number++;
                else obj.number--;

                System.out.println("Поток "+getName()+": новое значение "+obj.number);
                line();
            }
        }
    }
}
public class Listing12_8 {
    public static void main(String[] args) {
        int n=100,count=5,time=1000,dt=200;

        MyNumber obj=new MyNumber();
        obj.number=n;

        MyThread127 Alpha=new MyThread127("Alpha",obj,time+dt,count,true);

        MyThread127 Bravo=new MyThread127("Bravo",obj,time-dt,count,false);

        try {
            if (Alpha.isAlive()) Alpha.join();
            if (Bravo.isAlive()) Bravo.join();
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
