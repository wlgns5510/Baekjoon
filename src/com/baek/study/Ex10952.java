package com.baek.study;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex10952 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		ArrayList<Integer> list = new ArrayList<>();
		
		
		int num1 = 1;
		int num2 = 1;	//초기값
		
		while (num1 != 0 && num2 != 0) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			int sum = num1+num2;
			list.add(sum);
			
			
			if(num1 == 0 && num2 == 0) {
				break;
			}
			
		}
		
		
		 for(int i=0; i<list.size()-1; i++) { 
			 System.out.println(list.get(i)); 
		 }
		 
		
		
		
		sc.close();

	}

}
