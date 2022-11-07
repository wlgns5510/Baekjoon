package com.baek.study;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();	//케이스 수
		int sum = 0;
		int count = 0;
		double avg = 0;
		ArrayList<String> list = new ArrayList<>();


		for(int i=0; i<C; i++) {
			int N = sc.nextInt();	//학생수
			
			int[] point = new int[N];
			
			for(int j=0; j<N; j++) {	//학생의 점수
				point[j] = sc.nextInt();			
			}
			
			for(int j=0; j<N; j++) {
				sum += point[j];	//점수의 합
				avg = (double)sum/(double)N;	//점수의 평균							
			}
			
			for(int j=0; j<N; j++) {
				if(point[j] > avg) {
					count++;
				}
			}
			double per = (double)count / (double)N * 100.0;
			
			String p = String.format("%.3f", per) + "%";
			System.out.println(point.length);
			System.out.println(count);
			System.out.println(avg);
			System.out.println(p);
			list.add(p);
		}
			
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
			
		
		
		sc.close();

	}

}

/*
 * sum += point[j]; double avg = sum/N; //점수의 평균 System.out.println(point[j]);
 * 
 * if(point[j] > avg) { count++;
 */