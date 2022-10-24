package com.baek.study;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int price = sc.nextInt();
		int count = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=count; i++) {
			int getP = sc.nextInt();
			int getC = sc.nextInt();
			list.add(getP*getC);
		}
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		
		if(sum == price) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		sc.close();

	}

}
