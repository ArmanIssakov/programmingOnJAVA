package listing5;

public class lisiting5_4 {
    static void show(int[] nums){
        for(int s: nums){
            System.out.print("| "+s+" ");
        }
        System.out.println("|");
    }
    public static void main(String[] args) {
        int[] odd = {1,3,5,7};
        int[] even = {2,4,6,8,10};
        System.out.println("Массив odd:");
        show(odd);
        System.out.println("Массив even");
        show(even);
        System.out.println("Выполняется присваивание");
        even = odd;
        System.out.println("Массив odd:");
        show(odd);
        System.out.println("Массив even");
        show(even);

    }
}
