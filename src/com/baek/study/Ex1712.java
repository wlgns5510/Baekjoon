package com.baek.study;

import java.util.Scanner;

public class Ex1712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int sum = A+B;
		int count = 1;
		sc.close();
		
		
		while(sum > C) {
			count ++;
			B+=B;
			C+=C;
			System.out.println(B);
			System.out.println(C);
			if(sum < C) {
				break;
			}
		}
		System.out.println(count);

	}

}

// A		 B		 C				손익분기점
//1대 1000	70		170			1070>170	X
//2대 1000	140		240			1140>240	X
//3대 1000	210		410			1210>410	X
