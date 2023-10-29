package com.sunbeam;

public class Main {
	public static int calculate(int op1, char opr, int op2) {
		switch(opr) {
		case '+': return op1 + op2;
		case '-': return op1 - op2;
		case '*': return op1 * op2;
		case '/': return op1 / op2;
		case '%': return op1 % op2;
		}
		return 0;
	}
	public static int prefixEvaluate(String prefix) {
		// create stack to push operands
		Stack st = new Stack(10);
		// 1. traverse expression from right to left
		for (int i = prefix.length() - 1; i >= 0; i--) {
			// 2. read element from ith index
			char ele = prefix.charAt(i);
			// 3. if element is operand
			if (Character.isDigit(ele)) {
				// push operand on stack
				st.push(ele - '0');
			}
			// 4. if element is operator
			else {
				// 5. pop two elements from stack in such a way that
				int op1 = st.pop(); // first popped will become first operand
				int op2 = st.pop(); // second popped will become second operand
				// 6. perform operation on op1 and op2
				int res = calculate(op1, ele, op2);
				// 7. push result on stack
				st.push(res);
			}
		}
		// 8. pop result from stack and return it
		if (!st.isEmpty())
			return st.pop();
		return 0;
	}
	
	public static void main(String[] args) {

		
		String prefix = "-++4/*56397";
		
		System.out.println("Prefix : " + prefix);
		int result = prefixEvaluate(prefix);
		System.out.println("Result : " + result);
		
		// 12 32 +
		// 12,32,+
	}
}//remain for multidigit
