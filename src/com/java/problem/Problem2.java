//숫자를 입력받아 출력
package com.java.problem;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {

		System.out.println("숫자를 입력하세요>>");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}