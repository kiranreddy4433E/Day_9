package dsa;

import java.util.Scanner;

public class pro_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int count = 0;
		if(num==0)
		System.out.print("Number of Digits = 1");
		else{
		while(num != 0)
		{
		count++;
		num = num / 10;
		}
		System.out.print("Number of Digits is "+count);
		}

	}

}
