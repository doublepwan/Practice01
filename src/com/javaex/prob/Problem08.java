package com.javaex.prob;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		int deposit;
		int withdraw;
		int totalMoney = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------");
			System.out.println("선택 : ");
			int menuNum = sc.nextInt();
			switch (menuNum) {
			case 1:
				System.out.println("예금액 : ");
				deposit = sc.nextInt();
				totalMoney += deposit;
				break;
			case 2:
				System.out.println("출금액 : ");
				withdraw = sc.nextInt();
				totalMoney -= withdraw;
				break;
			case 3:
				System.out.println("잔액 : "+totalMoney);
				break;
			case 4:
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
			default:
				System.out.println("다시 입력해 주세요");
				break;
			}
		}
	}

}
