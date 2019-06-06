package PracticeIt;

import java.util.*;

public class PracticeItAssignment {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(5);
		stack.add(-10);
		stack.add(15);
		stack.add(0);
		stack.add(-5);
		stack.add(100);
		
		splitStack(stack);
		System.out.print(stack);

	}
	
	public static void splitStack(Stack<Integer> s) {
		Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> newQ = new LinkedList<Integer>();
		int count = 0;
		
		while(count < s.size()) {
			q.add(s.pop());
		}
		
		for (int i = 0; i < q.size(); i++) {
			if (q.remove() < 0) {
				newQ.add(q.remove());
			}
		}
		System.out.println(q);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		while(!s.isEmpty()) {
//			q.add(s.pop());
//		}
//		
//		int size = q.size();
//		
//		for(int i = 0; i<size; i++) {
//			int num = q.remove();
//			if(num < 0) {
//				s.push(num);
//			}
//			else {
//				q.add(num);
//			}
//		}
//		while (!q.isEmpty()) {
//			s.push(q.remove());
//		}
	}

}
