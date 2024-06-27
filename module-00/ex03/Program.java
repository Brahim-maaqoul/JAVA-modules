
import java.util.Scanner;


public class Program{
    public static String chart(int num){
        String str;
        switch (num) {
            case 1:
                str = "=>";
                break;
            case 2:
                str = "==>";
                break;
            case 3:
                str = "===>";
                break;
            case 4:
                str = "====>";
                break;
            case 5:
                str = "=====>";
                break;
            case 6:
                str = "======>";
                break;
            case 7:
                str = "=======>";
                break;
            case 8:
                str = "========>";
                break;
            case 9:
                str = "=========>";
                break;
            default:
                throw new AssertionError();
        }
        return str;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "Week ";

        int num;

        do {
            num = in.nextInt();
           
        } while (num != 42);

     
        System.exit(0);
    }
}