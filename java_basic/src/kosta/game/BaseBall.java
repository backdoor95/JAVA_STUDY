package kosta.game;

import java.util.Arrays;

public class BaseBall {
	// 난수 생성
	// 스트라이크 , 볼 체크
	int hidden[];
	

	public BaseBall() {
		hidden = new int[3];
		hidden[0] = (int) (Math.random() * 9) + 1;

		do {
			hidden[1] = (int) (Math.random() * 9) + 1;
		} while (hidden[0] == hidden[1]);

		do {
			hidden[2] = (int) (Math.random() * 9) + 1;
		} while (hidden[0] == hidden[1] || hidden[1] == hidden[2]);
		System.out.println("정답: "+ Arrays.toString(hidden));
	}

	public int countStrike(int input[]) {
		int strike = 0;

		for (int i = 0; i < 3; i++) {
			if (input[i] == hidden[i])
				strike++;
		}

		return strike;
	}

	public int countBall(int input[]) {
		int ball=0;
		for(int i=0;i<3;i++) {
			if(hidden[i] == input[(i+1)%3])// 이런 방법은 처음. % 연산자
			{
				ball++;
			}else if(hidden[i] == input[(i+2)%3]) {
				ball++;
			}
		}
		return ball;
	}
}
