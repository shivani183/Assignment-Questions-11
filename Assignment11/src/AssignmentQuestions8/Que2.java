
/*Given a string s containing only three types of characters: '(', ')' and '*', return true *if* s *is **valid***.

The following rules define a **valid** string:

- Any left parenthesis '(' must have a corresponding right parenthesis ')'.
- Any right parenthesis ')' must have a corresponding left parenthesis '('.
- Left parenthesis '(' must go before the corresponding right parenthesis ')'.
- '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".*/

package AssignmentQuestions8;


public class Que2 {
	public boolean checkValidString(String s) {
		char[] ch = s.toCharArray();

		int left = 0, right = 0;
		for (char c : ch) {
			if (c == '(' || c == '*')
				left++;
			else
				left--;
			if (left < 0)
				return false;
		}

		if (left == 0)
			return true;
		for (int i = ch.length - 1; i >= 0; i--) {
			if (ch[i] == ')' || ch[i] == '*')
				right++;
			else
				right--;
			if (right < 0)
				return false;
		}
		return true;
	}
}
