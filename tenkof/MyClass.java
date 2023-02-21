package tenkof;

public class MyClass {

    int getMaxFrequency(int count, int[] cpu){
        int index = 0;
        int result = 0;
        while (index < count){
            int sum = 0;
            for(int j=0;j<count;j++){
                if (cpu[index]<=cpu[j]){
                    sum+=cpu[j]-(cpu[j]%cpu[index]);
                }
            }
            if (sum>result){
                result = sum;
            }
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {4,16,4,9,5};

        MyClass obj = new MyClass();
        int number=obj.getMaxFrequency(5,array);
        System.out.println(number);
    }

}
