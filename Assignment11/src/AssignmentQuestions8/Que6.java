
/*Given two strings s and p, return *an array of all the start indices of* p*'s anagrams in* s. 
You may return the answer in **any order**.
An **Anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, 
typically using all the original letters exactly once.*/

package AssignmentQuestions8;

import java.util.*;

public class Que6 {

	public List<Integer> findAnagrams(String s, String p) {

		ArrayList<Integer> newList = new ArrayList();

		if (s == null || s.isEmpty() || s.length() < p.length())
			return newList;

		char[] chArr = p.toCharArray();
		Arrays.sort(chArr);
		p = new String(chArr);

		StringBuilder sb = new StringBuilder(s.substring(0, p.length()));
		char[] sbArr = sb.toString().toCharArray();
		Arrays.sort(sbArr);
		int x = s.length();
		
		for (int i = p.length(); i <= x; i++) {
			if (p.equals(String.valueOf(sbArr))) {
				newList.add(i - p.length());
			}
			sb.deleteCharAt(0);
			if (i == x) {
				break;
			}
			sb.append(s.charAt(i));
			sbArr = sb.toString().toCharArray();
			Arrays.sort(sbArr);
		}

		return newList;
	}

}
