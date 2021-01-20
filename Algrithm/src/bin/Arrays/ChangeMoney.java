package bin.Arrays;

import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] money = {500, 100, 50, 10};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		
		for(int i=0; i<4; i++) {
			int coin = money[i];
			count += n / coin;
			n %= coin;
		}
		System.out.println(count);
	}

}
