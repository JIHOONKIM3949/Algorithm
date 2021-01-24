package bin;

import java.util.Scanner;

public class baekjoon_10809 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		
		
		for(char i='a'; i<='z'; i++) {
			
			System.out.print(str.indexOf(i) + " ");
			
		}
		
	}
}
	