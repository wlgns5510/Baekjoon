package com.baek.study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;




public class Ex10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int num = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=num; i++) {
			int	number = sc.nextInt();
			
			list.add(number);
		}
		int max = Collections.max(list);
		int min = Collections.min(list);
		
		System.out.println(min + " " + max);
		

		sc.close();

	}

}
