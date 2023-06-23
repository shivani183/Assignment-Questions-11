package Question4;

/*Given an array of integers `nums` containing `n + 1` integers where each integer is in the range 
 * `[1, n]` inclusive.
There is only **one repeated number** in `nums`, return *this repeated number*.
You must solve the problem **without** modifying the array `nums` and uses only constant extra space.*/

public class Que4 {

	public static int repeatedNum(int []arr) {
		int n=arr.length-1;
		int ans=-1;
		int s=0;
		
		while(s<=n) {
			
			int m= (s+n)/2;
			int count=0;
			for(int i:arr) {
				if(i<=m)
					count++;
			}
			if(count>m) {
				ans=m;
				
				
				n=m-1;
			}else
				s=m+1;
		}
	return ans;	
	}
	public static void main(String[] args) {

		int arr[]= {3,1,3,4,2};
		System.out.println(repeatedNum(arr));
	}

}
