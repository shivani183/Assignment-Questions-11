
/*Given two strings word1 and word2, return *the minimum number of **steps** required to make* word1 *and* word2 *the same*.
In one **step**, you can delete exactly one character in either string.*/

package AssignmentQuestions8;

public class Que3 {

	public int minDistance(String word1, String word2) {
		int x = word1.length();
		int y = word2.length();
		int[][] tDArr = new int[x + 1][y + 1];
		for (int i = 0; i < x + 1; i++) {
			
			for (int j = 0; j < y + 1; j++) {
				
				if (i == 0 && j == 0) {
					tDArr[i][j] = 0;
				} else if (i == 0) {
					tDArr[i][j] = j;
				} else if (j == 0) {
					tDArr[i][j] = i;
				} else {
					
					if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
						tDArr[i][j] = tDArr[i - 1][j - 1];
					} else {
						tDArr[i][j] = 1 + Math.min(tDArr[i - 1][j], tDArr[i][j - 1]);
					}
				}
			}
		}
		return tDArr[x][y];
	}

}
