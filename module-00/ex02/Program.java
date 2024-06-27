import java.util.Scanner;

public class Program {

    private static int cp = 0;

    public static void PrimeNumber(int number) {
        int i = 2;
        if (number < 2)
        {
            System.out.println("IllegalArgument");
            System.exit(-1);
        }
            
        double sq = Math.sqrt(number);
        while (i <= sq)
        {
            if (number % i == 0)
                return;
            i++;
        }
        cp++;
    }
        
    

    public static void sumOfNum(int num) {
        int n = String.valueOf(num).length();
        int suma = 0;
        System.out.println("n length: "+ n);
        for (int i = 0; i < n; ++i) {
            suma += num % 10;
            num /= 10;
        }
        System.out.println("siuuuu: "+ suma);
        PrimeNumber(suma);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        do {
            num = in.nextInt();
            sumOfNum(num);
        } while (num != 42);

        System.out.println("Count of coffee-request : " + cp);
        System.exit(0);
    }
}