package listing10;

//Функциональный интерфейс
interface MyNums{

    default void show(int n){
        System.out.println("Аргумент: "+n);
        System.out.println("Результ: "+get(n));
    }

    //Абстрактный метод
    int get(int n);

}
public class Listing10_1 {
    public static void main(String[] args) {
        //Присваивание лямбда-выражения значением 
        //переменной интерфейсного типа
        MyNums A = (int n)->{
            int k,s=0;
            for(k=1;k<=n;k++){
                s+=k;
            }
            return s;
        };

        System.out.println("Используем лямбда-выражение:");

        A.show(10);

        System.out.println("Проверка: "+A.get(10));

        MyNums B = A;

        System.out.println("Новое лямбда-выражение:");

        A=n->n*n;

        System.out.println("Вызов метода show() из A:");

        A.show(10);

        System.out.println("Вызов метода show() из B");

        B.show(10);
    }
}
