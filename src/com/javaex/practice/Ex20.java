package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===================================");
		System.out.println("\t[숫자 맞추기 게임 시작]");
		System.out.println("===================================");
		
		
		int correctNum = (int)(Math.random()*100) + 1;
		System.out.println(correctNum);
		
		while(true) {
			System.out.println(">>");
			int num = sc.nextInt();
			
			
			
			
		}
		
		
		
		
		sc.close();
	}

}
