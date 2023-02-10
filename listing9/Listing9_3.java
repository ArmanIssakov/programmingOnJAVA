package listing9;

class USingStaticGenMethodDemo{
    static <X> void show(X arg){
        System.out.println(arg);
    }

    static <X> void show(X[] array){
        System.out.print("| ");
        for(int k = 0;k<array.length;k++){
            System.out.print(array[k]+" | ");
        }
        System.out.println("");
    }

    static <X> X getElement(X[] array, int index){
        return array[index];
    }

}
public class Listing9_3{
    public static void main(String[] args) {
        Integer[] nums = {1,3,7,2};

        Character[] symbs = {'A','W','L','O','B'};

        System.out.println("Вызов метода show()");
        System.out.print("С текстовым арументом: ");
        USingStaticGenMethodDemo.show("обобщенный метод");
        System.out.print("C int-аргументом: ");
        USingStaticGenMethodDemo.show(123);
        System.out.print("С double-аргументом: ");
        USingStaticGenMethodDemo.show(123.45);
        System.out.print("С char-аргументом");
        USingStaticGenMethodDemo.show('A');
        System.out.print("Целочисленный массив: ");
        USingStaticGenMethodDemo.show(nums);
        System.out.print("Символьный массив: ");
        USingStaticGenMethodDemo.show(symbs);

        System.out.println("Вызов метода getElement()");
        System.out.print("Целочисленный массив: *");
        for(int k = 0;k<nums.length;k++){
            System.out.print(USingStaticGenMethodDemo.getElement(nums, k)+"*");
        }
        System.out.print("\nСимвольный массив: *");
        for(int k = 0;k<symbs.length;k++){
            System.out.print(USingStaticGenMethodDemo.getElement(symbs, k)+"*");
        }
        System.out.println("");
    }
}