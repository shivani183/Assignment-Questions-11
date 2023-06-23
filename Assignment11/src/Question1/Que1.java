package Question1;
/*
Given a non-negative integer `x`, return *the square root of* `x` *rounded 
down to the nearest integer*. The returned integer should be **non-negative** as well.
You **must not use** any built-in exponent function or operator.
- For example, do not use `pow(x, 0.5)` in c++ or `x ** 0.5` in python.
*/

public class Que1 {
	public static int sqrt(int n) {
		if(n==0 && n==1)
			return n;
		else {
			int s=0;
			int ans;
			int m=(s+n)/2;
			while(s<n) {
				ans=m*m;
				if(n>=ans)
					return m;
				else
					m=m-1;
			}
			return m;
		}
	}
	public static void main(String[] args) {
		int n=24;
		System.out.println(sqrt(n));
		
	}
}
