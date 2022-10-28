package com.baek.study;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int[] num = new int[N];
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			num[i] = sc.nextInt();
			
			if(num[i] < X) {
				list.add(num[i]);
			}
		}
		
		for(int i=0; i<list.size(); i++) {			
			System.out.print(list.get(i) + " ");
		}
		
		
		sc.close();

	}

}
