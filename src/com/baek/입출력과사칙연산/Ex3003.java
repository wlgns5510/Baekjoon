package com.baek.입출력과사칙연산;

import java.util.Scanner;

public class Ex3003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = {1,1,2,2,2,8};
		int b[] = new int[6];
		for(int i=0; i<b.length; i++) {
			b[i] = sc.nextInt();
			System.out.print(a[i]-b[i]+ " ");
		}
		
		sc.close();
	}

}
