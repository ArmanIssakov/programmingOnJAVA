package listing8;

class MyClass88{
    private int number;

    MyClass88(int n){
        number = n;
    }

    int get(){
        return number;
    }
}
public class Listing8_8 {
    static MyClass88[] createBinoms(int n){
        MyClass88[] bins = new MyClass88[n+1];

        bins[0] = new MyClass88(1);

        for(int k =1;k<=n;k++){
            bins[k] = new MyClass88(bins[k-1].get()*(n-k+1)/k);
        }

        return bins;
    }

    static void show88(MyClass88[] objs){
        String txt = "| ";

        for(int k =0;k<objs.length;k++){
            txt+=objs[k].get()+" | ";
        }

        System.out.println(txt);
    }

    public static void main(String[] args) {
        MyClass88[] A = createBinoms(5);

        MyClass88[] B = createBinoms(10);

        show88(A);

        show88(B);
    }
}
