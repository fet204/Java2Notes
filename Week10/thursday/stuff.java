package thursday;

import java.util.Queue;
import java.util.Stack;

public class stuff {
	
	// reverseFirstK Assignment 
	public void reverseFirstK(int k, Queue<Integer> q) {
		
		if(k <= 0) {
			System.out.println("no change");
		}
		
		else if(q == null || q.size() < k) {
			throw new IllegalArgumentException();
		}
		
		else {
			
		}
		
	}
	
	// Answer from prof
	public void reverse(int k, Queue<Integer> q) {
		Stack<Integer> s = new Stack<Integer>();
		if(q.size() == 0 || k > q.size()) {
			throw new IllegalArgumentException();
		}
		
		for (int i = 0; i < k; i++) {
			s.push(q.remove());
		}
		
		while(s.isEmpty()) {
			q.add(s.pop());
		}
		
		for (int i = 0; i < q.size() - k; i++) {
			q.add(q.remove());
		}
		
	}

}
