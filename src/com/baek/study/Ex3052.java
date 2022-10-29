package com.baek.study;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		
		for(int i=1; i<=10; i++) {
			int number = sc.nextInt();
			int remainder = number%42;
			
			set.add(remainder);
		}
		System.out.println(set.size());
		
		sc.close();

	}

}
