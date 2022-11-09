package com.baek.study;

import java.util.Scanner;

public class Ex10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		
		int[] abc = new int[26];
		
		for(int i=0; i<abc.length; i++) {
			abc[i] = -1;
		}
		
		
		
		 for(int i=0; i<S.length(); i++) {
		 
			 char get = S.charAt(i);
			 
			 if(abc[get - 'a'] == -1) {
				 abc[get - 'a'] = i;
			 }
		 }
		
		for(int var : abc) {
			System.out.print(var + " ");
		}
		 
		sc.close();

	}

}
