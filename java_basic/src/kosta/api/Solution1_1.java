package kosta.api;

import java.util.Scanner;

public class Solution1_1 {

	public int solution(String str, char c) {
		int answer =0;
		str = str.toUpperCase();// 문자열을 대문자로
		c = Character.toUpperCase(c);// 문자를 대문자로 
		
		for(char x: str.toCharArray()) {
			if(x==c)answer++;
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Solution1_1 s = new Solution1_1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		
		System.out.println(s.solution(str, c));

	}

}
