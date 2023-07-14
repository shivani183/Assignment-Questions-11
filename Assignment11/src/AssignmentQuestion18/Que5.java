
/*Given an integer array nums, return true if any value appears at least twice in the array, 
and return false if every element is distinct.*/

package AssignmentQuestion18;

public class Que5 {
	
	public static boolean ifTwice(int[] a) {
		

		int n=a.length;
		
		int count=0;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
		}
		if(count>0)
			return true;
		else
			return false;
		
	}
	
	public static void main(String[] args) {
		int[] x= {1,2,3,1};
		System.out.println(ifTwice(x));
	}

}
