package listing10;

class MyClass106{
    static void show(){
        System.out.println("Метод класса MyClass106");
    }

    static int sum(int n){
        int k,s=0;
        for(k = 1;k<=n;k++){
            s+=k;
        }
        return s;
    }
}


interface MyShow106{
    void myShow();
}


interface MySum106{
    int mySum(int n);
}


interface MyPrinter106{
    void myPrint(Object t);
}

public class Listing10_6 {
    public static void main(String[] args) {
        MyShow106 A=MyClass106::show;
        MySum106 B=MyClass106::sum;
        MyPrinter106 C=System.out::println;

        A.myShow();
        C.myPrint("Сумма чисел: "+B.mySum(10));
    }
}
