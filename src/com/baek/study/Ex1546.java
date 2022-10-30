package com.baek.study;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Ex1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=count; i++) {
			int point = sc.nextInt();
			list.add(point);
		}
		int M = Collections.max(list);
		System.out.println(M);
		
		sc.close();

	}

}
