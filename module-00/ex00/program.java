public class Program {
    public static void main(String[] args){
        int num = 479985;
        
        
        int res1 = num / 100000;
        num -= res1 * 100000;
        int res2 = num / 10000;
        num -= res2 * 10000;
        int res3 = num / 1000;
        num -= res3 * 1000;
        int res4 = num / 100;
        num -= res4 * 100;
        int res5 = num / 10;
        num -= res5 * 10;
        int sum = num + res1 + res2 + res3 + res4 + res5;
        System.out.println(sum);

    }
    }