import java.util.Scanner;
// import java.lang.Math;

public class Program {
    public static void main(String [] args){
        int number, i = 2;

        Scanner scanner = new Scanner(System.in);
        if(!scanner.hasNextInt()) {
            System.err.println(scanner.nextLine()+" is not a valid Integer");
            scanner.close();
            System.exit(-1);
         }
         
        number = scanner.nextInt();
        
        scanner.close();

       

        i = 2;
        if (number < 2)
        {
            System.out.println("IllegalArgument");
            System.exit(-1);
        }
            
        double sq = Math.sqrt(number);
        while (i <= sq)
        {
            if (number % i == 0)
            {
                System.out.println("false " + (i - 1));
                return;
            }
            i++;
        }
        System.out.println("true "+ (i - 1));
    }

   
    
}