import java.util.Scanner;

public class Program {
	private static final int MAX_CHAR_CODES = 65535;
	private static final int MAX_HEIGHT = 10;

	private static int[] counter(String input) {
		int[] table = new int[MAX_CHAR_CODES];
		char[] array = input.toCharArray();
        
		for (int i = 0; i < input.length(); i++) {
			table[array[i]]++;
		}
		return table;
	}
    // private  static String sort(String str){
    //     for (int i = 0; i < str.length(); i++)
    //     {
            
    //     }
    // }
	


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			// String str = in.next();
			String str = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAASSSSSSSSSSSSSSSSSSSSSSSSDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDWEWWKFKKDKDSKAKLSLDKSKALLLLLLLLLLRTRTETWTWWWWWWWWWWOOOOOOO42";
			int[] count = counter(str);
            
            char[] a = str.toCharArray();
            // System.out.println(count['D']);
            int[] table = new int[10];
            int j = 0;
			for (int i = 0; i < str.length() - 1; i++)
            {
                if (count[a[i]] != count[a[i+1]] && count[a[i]] != 0 && j < 10)
                {
                    table[j] = count[a[i]];
                    count[a[i]] = 0;
                    j++;
                }
			}
            int tmp = 0;
            for (int i = 0; i < 10; i++)
            {
                for (int k = i; k < 10; k++)
                {
                    if (table[k] > table[i])
                    {
                        tmp = table[k];
                        table[k] = table[i];
                        table[i] = tmp;
                    }
                }
                System.out.println(table[i]);
            }

		} catch (Exception e) {
			System.err.println(e);
			System.exit(-1);
		}
		in.close();
	}
};
