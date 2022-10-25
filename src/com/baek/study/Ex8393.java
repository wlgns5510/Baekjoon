package com.baek.study;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=number; i++) {
			
			list.add(i);
								
		}
		
		int sum = 0;
		
		for(int num : list) {
			sum += num;
		}
		
		System.out.println(sum);
		
		sc.close();

	}

}
