package com.baek.study;

import java.util.Scanner;


public class Ex1157 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String str = sc.next();
		String str2 = str.toUpperCase();
// System.out.println((int)'Z'); // A = 65 Z = 90
// apple
		int[] numArr = new int[26];

		for (int i = 0; i < str.length(); i++) {
			numArr[(int) str2.charAt(i) - 65]++;
		}
// a 1 p 2 l 1 e 1
		int max = 0;
		char c = ' ';

		for (int i = 0; i < numArr.length; i++) {
			if (max < numArr[i]) {
				max = numArr[i];
				c = (char) (i + 65); // max == 2 / c == (char)P // mmaa
			} else if (max == numArr[i]) {
				c = '?';
			}
		}
		System.out.println(c);
	}
	
	
}
