package day40;

import java.util.Stack;

public class BalancedStr {
	public static void main(String[] args) {
		System.out.println(isBalanced("[{()}]")); // true
		System.out.println(isBalanced("[((})]")); // false
		System.out.println(isBalanced("[[()]")); // false
		System.out.println(isBalanced("[](){}")); // true
		System.out.println(isBalanced("((")); // false
		System.out.println(isBalanced("({}{}([{}]))")); // true
	}
	
	/*
	 * [{()}]
	 * Find out if str is balanced or not
	 * isBalanced("[{()}]")  	   -> true
	 * isBalanced("[((})]")  	   -> false
	 * isBalanced("[[()]")         -> false
	 * isBalanced("[](){}")        -> true
	 * isBalanced("((")            -> false
	 * isBalanced("({}{}([{}]))")  -> true
	 * 
	 * to solve this problem we are going to use Stack
	 */
	public static boolean isBalanced(String str) {
		// open  parentheses - { [ (
		// closed parentheses - } ] )
		Stack<Character> st = new Stack<>();
		
		//           : [, (, (, }, ), ]
		for (char ch : str.toCharArray()) {
			//  
			if (ch == '{' || ch == '[' || ch == '(') {
				// put all open parentheses to the stack
				st.push(ch);
				
			} else {
				// if parentheses are closed ones
				// get latest open 
				char latestOpen = st.pop();
			
				// check if closed one and latest open is balanced
				if (latestOpen == '{' && ch != '}') {
					return false;
				} else if (latestOpen == '(' && ch != ')') {
					return false;
				} else if (latestOpen == '[' && ch != ']') {
					return false;
				}
				
			}
		}
		
		// if stack is empty then str is balanced
		return st.isEmpty();
	}
}