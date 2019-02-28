package tests.stack;

import static org.junit.Assert.*;

import org.junit.Test;

import srcs.stack.Stack;

public class StackTest {

	@Test(expected = IllegalAccessError.class)
	public void test() {
		Stack<Integer> stk = new Stack<>();
		
		stk.push(5);
		stk.push(6);
		stk.push(7);
		
		assertEquals("First Case", new Integer(7), stk.top());
		
		stk.pop();
		stk.pop();
		
		assertEquals("Second Case", new Integer(5), stk.top());
		
		stk.pop();
		
		
		Stack<Double> nstk = new Stack<>();
		
		nstk.push(7.3);
		nstk.push(8.5);
		
		nstk.pop();
		nstk.pop();
		nstk.pop();
		
	}

}
