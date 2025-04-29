package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//
		while(true) {

			System.out.println("===================================");
			System.out.println("\t[숫자 맞추기 게임 시작]");
			System.out.println("===================================");
			
			
			int num = (int)(Math.random()*100) + 1;
			int inputNum;
			String yn;
			System.out.println(num);
			while(true) {
				System.out.print(">>");
				inputNum = sc.nextInt();
				if(inputNum < num ) {
					System.out.println("더 높게");
					
				} else if(inputNum > num) {
					System.out.println("더 낮게");
					
				} else{
					System.out.println("맞았습니다.");
					break;
				}
					
			}
					
			sc.nextLine();
			
			System.out.print("게임을 종료하시겠습니까? (y/n) >>");
			yn = sc.nextLine();
			if("y".equals(yn)) {
				System.out.println("===================================");
				System.out.println("\t[숫자 맞추기 게임 종료]");
				System.out.println("===================================");	
		
				break;
			}
			
			
			
			
		}
		sc.close();	
	}//while
	
}
				
			 

		
		
		
		
	
	

		
		
				
				
				
				
		
		
		
		
		
		
			
