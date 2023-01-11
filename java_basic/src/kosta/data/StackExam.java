package kosta.data;

import java.util.Scanner;
import java.util.Stack;

public class StackExam {

	public static void main(String[] args) {
		// 키보드로부터 수학수식 입력
		// ((2+3)+10) => 괄호가 일치 / 불일치 판단

		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();
		System.out.print("수식 입력 = ");
		String str = sc.nextLine();
		try {
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);

				if (ch == '(') {
					stack.push(ch + "");// char 형을 String으로 변경할때 ""을 더해주면된다.
				} else if (ch == ')') {// 빈 스택에서 내용물을 빼낼때 exception 발생
					stack.pop();
				}
				
				if(stack.isEmpty()) {
					System.out.println("괄호가 일치함");
				}else {
					System.out.println("괄호 불일치");
				}
				
			}
		} catch (Exception e) {
			System.out.println("괄호 불일치");
		}
		
		

		
		
	}

}
