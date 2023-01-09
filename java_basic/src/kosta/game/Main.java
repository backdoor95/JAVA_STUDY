package kosta.game;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BaseBall bb = new BaseBall();
		int input[] = new int[3];
		int strike = 0;
		int ball=0;
		int count =0;
		
		do {
			System.out.println("도전 :");
			for(int i=0;i<3;i++)
			{
				input[i] = sc.nextInt();
			}
			strike= bb.countStrike(input);
			ball = bb.countBall(input);
			System.out.println(strike+"S"+ball+"B");
			count++;
		} while (strike != 3);

		System.out.println(count+"번째 성공!");
	}
}
