//a.입력 받은 숫자가 홀수인 경우에는, 입력 값까지 홀수의 합을 출력
//-예시)입력이 7 이면 16을 출력(1 + 3 + 5 + 7 = 16) 
//b.입력 받은 숫자가 짝수인 경우에는, 입력 값까지 짝수의 합을 출력
//-예시)입력이 10 이면 30을 출력(2 + 4 + 6 + 8 + 10 = 30)
package com.java.problem;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요>>");

		int total = 0;
		int input = sc.nextInt();
		sc.nextLine();

		if (input % 2 == 0) {
			for (int i = 2; i <= input; i += 2) {
				total += i;
			}
		} 
		else {
			for (int i = 1; i <= input; i += 2) {
				total += i;
			}
		}
		System.out.println("결과값:" + total);
	}
}
