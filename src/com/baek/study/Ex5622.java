package com.baek.study;

import java.util.Scanner;

public class Ex5622 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();	//문자열을 받아준다
		
		String array[] = str.split("");		//받은 문자를 split으로 하나씩 쪼개서 배열에 넣어준다
		
		int sum = 0;	//sum의 초기값
		
		//배열을 0부터 배열의 크기까지 돌리면서 값을 비교하고, sum에 더해준다
		for(int i=0; i<array.length; i++) {
			
				
			if(array[i].equals("A") || array[i].equals("B") || array[i].equals("C")) {
		
				sum = sum + 3;
			}
			else if(array[i].equals("D") || array[i].equals("E") || array[i].equals("F")) {
				sum = sum + 4;
			}
			else if(array[i].equals("G") || array[i].equals("H") || array[i].equals("I")) {
				sum = sum + 5;
			}
			else if(array[i].equals("J") || array[i].equals("K") || array[i].equals("L")) {
				sum = sum + 6;
			}
			else if(array[i].equals("M") || array[i].equals("N") || array[i].equals("O")) {
				sum = sum + 7;
			}
			else if(array[i].equals("P") || array[i].equals("Q") || array[i].equals("R") || array[i].equals("S")) {
				sum = sum + 8;
			}
			else if(array[i].equals("T") || array[i].equals("U") || array[i].equals("V")) {
				sum = sum + 9;
			}
			else if(array[i].equals("W") || array[i].equals("X") || array[i].equals("Y") || array[i].equals("Z")) {
				sum = sum + 10;
			}
		}
		System.out.println(sum);	//결과
		
		sc.close();
	}

}
