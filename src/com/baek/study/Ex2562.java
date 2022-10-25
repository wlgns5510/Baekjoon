package com.baek.study;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Ex2562 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=9; i++) {
			int num = sc.nextInt();
			list.add(num);					
		}
		int max = Collections.max(list);
		
		System.out.println(max);
		System.out.println(list.indexOf(max) + 1);
		
		sc.close();
		}

}
