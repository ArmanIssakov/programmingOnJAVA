package listing8;

class MyClass89{
    int number;

    MyClass89 next;
}

public class Listing8_9 {
    static MyClass89 createList(int n){
        MyClass89 obj = new MyClass89();

        obj.number = 1;

        MyClass89 t = obj;

        for(int k=1;k<=n;k++){
            t.next = new MyClass89();

            t.next.number = t.number*(n-k+1)/k;

            t = t.next;
        }
        t.next = null;

        return obj;
    }    

    static void showList(MyClass89 obj){
        String txt = " |";

        MyClass89 t = obj;

        do{
            txt+=t.number+" | ";

            t = t.next;
        } while(t != null);
        System.out.println(txt);
    }

    public static void main(String[] args) {
        MyClass89 A = createList(5);
        MyClass89 B = createList(10);

        showList(A);
        showList(B);
    }
}
