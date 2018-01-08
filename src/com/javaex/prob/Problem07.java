package com.javaex.prob;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		int random = (int) (Math.random() * 100) + 1;
		Scanner sc = new Scanner(System.in);
		System.out.println(random);
		System.out.println("===========");
		System.out.println("숫자 맞추기");
		System.out.println("===========");
		System.out.println(">>");
		while(true) {
			
			int selectNum = sc.nextInt();
		if(selectNum<random) {
			System.out.println("더 높게");
			System.out.println(">>");
			
		}
		else if(selectNum>random) {
			System.out.println("더 낮게");
			System.out.println(">>");
		}
		else if(selectNum == random) {
			
			System.out.println("정답");
				System.exit(0);
				
			}
		}
		}
	}


