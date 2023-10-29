package com.sunbeam;

public class Main {
	public static int calculate(int op1, char opr, int op2) {
		switch (opr) {
		case '+':
			return op1 + op2;
		case '-':
			return op1 - op2;
		case '*':
			return op1 * op2;
		case '/':
			return op1 / op2;
		case '%':
			return op1 % op2;
		}
		return 0;
	}

	public static int postfixEvaluate(String postfix) {
		// create stack to push operands
		Stack st = new Stack(10);
		// 1. traverse expression from left to right
		for (int i = 0; i < postfix.length(); i++) {
			// 2. read element from ith index
			char ele = postfix.charAt(i);
			//2.1
			if(ele==' ')
				continue;
			// 3. if element is operand
			if (Character.isDigit(ele)) {
				//3.1
				int n=0;
				while(Character.isDigit(ele)) {
					n=n*10+(int)(ele-'0');
					i++;
					ele=postfix.charAt(i);
				}
				i--;
				// push operand on stack
				st.push(n);
				
			}
			// 4. if element is operator
			else {
				// 5. pop two elements from stack in such a way that
				int op2 = st.pop(); // first popped will become second operand
				int op1 = st.pop(); // second popped will become first operand
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
		String postfix =  "100 200 + 2 / 5 * 7 +";
		//String postfix = "456*3/+9+7-";//not working
		
		System.out.println("Postfix : " + postfix);
		int result = postfixEvaluate(postfix);
		System.out.println("Result : " + result);
		

	}
}
