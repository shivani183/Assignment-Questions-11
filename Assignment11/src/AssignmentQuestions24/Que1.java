
//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

package AssignmentQuestions24;

public class Que1 {

	public int romanToInt(String s) {
        int numb = 0;
        int ans = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'I') {
                numb = 1;
            } else if (s.charAt(i) == 'V') {
                numb = 5;
            } else if (s.charAt(i) == 'X') {
                numb = 10;
            } else if (s.charAt(i) == 'L') {
                numb = 50;
            } else if (s.charAt(i) == 'C') {
                numb = 100;
            } else if (s.charAt(i) == 'D') {
                numb = 500;
            } else if (s.charAt(i) == 'M') {
                numb = 1000;
            }
            if (numb < prev) {
                ans -= numb;
            } else {
                ans += numb;
            }
            prev = numb;
        }
        return ans;
    }
}
