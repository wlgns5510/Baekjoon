package com.baek.study;

import java.util.Scanner;

public class Ex2525 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
 
        int A = sc.nextInt();
        int B = sc.nextInt();
 
        int C = sc.nextInt();
 
        int min = 60 * A + B;   // 시 -> 분
        min += C;
 
        int hour = (min / 60) % 24;
        int minute = min % 60;
 
        System.out.println(hour + " " + minute);
        
        sc.close();
 
    }
}