
//Given two strings s1 and s2, return the lowest ASCII sum of deleted characters to make two strings equal.

package AssignmentQuestions8;

public class Que1 {
	public int minimumDeleteSum(String s1, String s2) {
        int x = s1.length();
        int y = s2.length();
        int[][] toDArr = new int[x+1][y+1];
        for(int i=1;i<toDArr.length;i++){
            toDArr[i][0]=toDArr[i-1][0]+s1.charAt(i-1);
        }
        for(int j=1;j<toDArr[0].length;j++){
            toDArr[0][j]=toDArr[0][j-1]+s2.charAt(j-1);
        }
        for(int i=1;i<toDArr.length;i++){
            for(int j=1;j<toDArr[0].length;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    toDArr[i][j]= toDArr[i-1][j-1];
                }else{
                    toDArr[i][j]= Math.min(toDArr[i-1][j]+s1.charAt(i-1), toDArr[i][j-1]+s2.charAt(j-1));
                }
            }
        }
        return toDArr[x][y];
    }

}
