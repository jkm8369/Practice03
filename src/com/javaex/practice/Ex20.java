package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===================================");
		System.out.println("\t[숫자 맞추기 게임 시작]");
		System.out.println("===================================");
		
		
		int num = (int)(Math.random()*100) + 1;
		boolean run = true;
		
		while(run) {
			System.out.print(">>");
			System.out.println(num);
			if(num>num) {
				System.out.println("더 낮게");
			}
			
		}
		
		
		
		
		sc.close();
	}

}
