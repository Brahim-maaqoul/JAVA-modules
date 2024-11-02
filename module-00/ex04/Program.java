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

	


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			// String str = in.next();
			String str = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAASSSSSSSSSSSSSSSSSSSSSSSSDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDWEWWKFKKDKDSKAKLSLDKSKALLLLLLLLLLRTRTETWTWWWWWWWWWWOOOOOOO42";
			int[] count = counter(str);
            char[] a = str.toCharArray();
            System.out.println(count['A']);
			for (int i = 0; i < 10; i++) {
                if ()
                {
                    
                }
			}

		} catch (Exception e) {
			System.err.println(e);
			System.exit(-1);
		}
		in.close();
	}
};