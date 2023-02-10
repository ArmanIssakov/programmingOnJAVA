package listing4;

public class listing4_6 {
    static String getDay(int num){
        String day;
        switch(num){
            case 1:
                day = "monday";
                break;
            case 2:
                day = "tuesday";
                break;
            case 3:
                day = "wendnesday";
                break;
            case 4:
                day = "thursday";
                break;
            case 5:
                day = "friday";
                break;
            case 6:
                day = "saturday";
                break;
            case 7:
                day = "sunday";
                break;
            default:
                day = "it's not day";
            
        }
        return day;
    }
    static String testDay(int num){
        String day;
        switch(num){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                day = "on weekdays";
                break;
            case 6:
            case 7:
                day = "weekends";
                break;
            default:
                day = "it's not day";
                
        }
        return day;
    }
    public static void main(String[] args) {
        for(int k=0;k<=8;k++){
            System.out.println(k+": "+getDay(k)+"\t- "+testDay(k));
        }
    }
    
}
