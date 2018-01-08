//1.예금 선택후 금액을 입력하면 예금액이 합산
//2.출금 선택후 금액을 입력하면 예금액이 차감
//3.잔고 선택시 현재 잔고가 출력
//4.종료 선택시 종료
//1,2,3,4 이외의 숫자는 다시입력해주세요 메시지를 출력
package com.java.problem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {

		int totalmoney = 0;

		Scanner sc = new Scanner(System.in);
		
		menu : while (true) {
			System.out.println("-------------------------");
			System.out.println("1.예금 |2.출금 |3.잔고 |4.종료");
			System.out.println("-------------------------");
			int i = 0;
			try {
				i = sc.nextInt();
				sc.nextLine();
				
				int money = 0;
				switch (i) {
				case 1:
					System.out.println("예금액>");
					money = sc.nextInt();
					sc.nextLine();
					totalmoney += money;
					break;
				case 2:
					System.out.println("출금액>");
					money = sc.nextInt();
					sc.nextLine();
					if (totalmoney > money) {
						totalmoney -= money;
					} else {
						System.out.println("예금액 < 출금액 = 출금 X");
					}
					break;
				case 3:
					System.out.println("잔고액>" + totalmoney);
					break;
				case 4:
					System.out.println("프로그램종료>");
					break menu;
				default:
					System.out.println("다시 입력해주세요.");
				}

			} 
			catch (InputMismatchException ime) {
				sc.nextLine();
				System.out.println("다시 입력해주세요");
			}
		}
	}
}
