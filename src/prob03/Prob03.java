package prob03;

public class Prob03 {
	public static void main(String args[]) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };
		
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);

	}

	public static void replaceSpace(char c[]) {
		for(int i=0; i < c.length; i++) {
			if (c[i] == ' ') {
				c[i] = ',';
			}
		}
		System.out.println();
	}

	public static void printCharArray(char c[]) {
		System.out.print(c);	
	}
}
