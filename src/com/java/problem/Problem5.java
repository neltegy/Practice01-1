//정수 다섯개를 입력받아 가장 큰 수를 출력
package com.java.problem;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요>>");
		
		int[] n = new int[5];
		int max = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i <5; i++) {
			System.out.print("숫자 : ");
			n[i] = sc.nextInt();
			if (i == 0) {
				max = n[i];
			}
			if (max < n[i]) {
				max = n[i];
			}
		}
		System.out.println("최대값은" + max + "입니다.");
	}
}
