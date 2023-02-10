package listing8;

abstract class Base85{
    abstract void show85();
}

class Alpha85 extends Base85{
    @Override
    void show85(){
        System.out.println("Объект класса Alpha");
    }
}

class Bravo85 extends Base85{
    @Override
    void show85(){
        System.out.println("Объект класса Bravo");
    }
}

class Charlie85 extends Base85{
    @Override
    void show85(){
        System.out.println("Объект класса Charlie");
    }
}


public class Listing8_5 {
    static Base85 createObject85(int n){
        if(n==1) return new Alpha85();
        if(n==2) return new Bravo85();
        return new Charlie85();
    }
    public static void main(String[] args) {
        Base85 obj;
        for(int k =1; k<=3;k++){
            obj = createObject85(k);
            obj.show85();
        }
    }
}
