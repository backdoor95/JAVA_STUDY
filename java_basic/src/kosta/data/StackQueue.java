package kosta.data;

import java.util.LinkedList;
import java.util.Stack;

public class StackQueue {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		LinkedList<Integer> q = new LinkedList<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println("------stack-------");
		while (!s.isEmpty()) {
			System.out.println(s.pop());// pop은 데이터를 뽑아냄
		}
		
		q.offer(1);// queue에서 데이터를 넣기
		q.offer(2);
		q.offer(3);
		
		System.out.println("-------queue------");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
		
		
		
		
	}

}
