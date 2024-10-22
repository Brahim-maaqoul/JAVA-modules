
import java.util.Scanner;


public class Program{

    private static int reverse(int number) {
		int reverse = 0;
		while (number > 0) {
			reverse = (reverse * 10) + (number % 10);
			number /= 10;
		}
		return reverse;
	}
     public static void chart(int num){
		while (num > 0) {
			System.out.print("=");
			num--;
		}
		System.out.println(">");
	}
   
    
    public static void main(String[] args) {
        String str = "Week ";
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        int days = 5;
        int grade;
        int min;
        int memo = 0;
        int count = 0;
        String num;

       
       try {
        for (int i = 0; i < 18; i++)
        {
            min = 10;
            num = in.nextLine();
            if (num.equals("42"))
                break;
            if (!num.equals(str + (i + 1)))
                throw new Exception("IllegalArgument");
              
            for (int j = 0; j < days; j++)
            {
                grade = in1.nextInt();
                if (grade < 1 || grade > 9)
                    throw new Exception("IllegalArgument");
                min = min < grade ? min : grade;
            }
            count = i+1; //we'll need it after for the prints..
            memo = (memo * 10) + min;
        }
        int rev = 0;
		while (memo > 0) {
			rev = (rev * 10) + (memo % 10);
			memo /= 10;
		}
        for (int i = 1; i <= count; i++)
        {   
            System.out.print("Week "+ i+ " ");
            chart(rev % 10);
            rev /= 10;
        }
       }catch (Exception e){
            System.err.println("IllegalArgument");
            System.exit(-1);
       }
        
     
        System.exit(0);
    }
}