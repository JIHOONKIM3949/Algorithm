package bin;

import java.util.Scanner;

public class TestExample {

	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		int startNum = sc.nextInt();
		String str = sc.next();
		sc.close();
		
		int[] ary = new int[startNum];
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			ary[i] = str.charAt(i) - '0';
			
			sum += ary[i];
		}
		
		System.out.println(sum);
		

	}

}
