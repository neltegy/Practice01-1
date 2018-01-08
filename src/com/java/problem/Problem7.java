//숨겨진 숫자를 맞추는 게임
//프로그램이 실행되면 1~100 사이의 숫자가 결정
//사용자가 입력한 숫자가 결정된 숫자보다 높으면 “더 낮게” 출력
//사용자가 입력한 숫자가 결정된 숫자보다 낮으면 “더 높게” 출력 
//정답을 맞춘경우 “맞았습니다.” 출력
//게임을 반복하기 위해 yes/no이라 묻고 yes인 경우 종료됩니다.
//(no인경우 다시 게임이 시작됩니다.)
package com.java.problem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		System.out.println("================");
		System.out.println("[숫자맞추기게임 시작]");
		System.out.println("================");

		int random = (int) (Math.random() * 100+1);

		Scanner sc = new Scanner(System.in);

		int num = 0;
		while (true) {
			try {
				num = sc.nextInt();
				sc.nextLine();
				if (random < num) {
					System.out.println("더 낮게");
				} 
				else if (random > num) {
					System.out.println("더 높게");
				} 
				else {
					System.out.println("맞았습니다.");
					break;
				}
			} 
			catch (InputMismatchException ime) {
				System.out.println("숫자만 입력해주세요.");
				break;
			}
		}
		System.out.println("================");
		System.out.println("[숫자맞추기게임 종료]");
		System.out.println("================");
	}
}
