package AssignmentQuestions24;

public class Que2 {

	public int lengthOfLongestSubstring(String s) {

		int start = 0;
		int end = 0;
		int[] ch = new int[128];
		int maxLength = 0;

		while (end < s.length()) {

			char currCh = s.charAt(end);
			if (ch[currCh] == 0) {
				ch[currCh] = 1;
				end += 1;
			} else {
				while (ch[s.charAt(end)] > 0) {
					ch[s.charAt(start)] = 0;
					start += 1;
				}
			}
			maxLength = Integer.max(maxLength, end - start);
		}
		return maxLength;
	}
}
