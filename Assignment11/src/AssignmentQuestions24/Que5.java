
/*An **ugly number** is a positive integer whose prime factors are limited to `2`, `3`, and `5`.
Given an integer `n`, return *the* `nth` ***ugly number***.*/


package AssignmentQuestions24;

import java.util.*;

public class Que5 {

	static long nthUglyNumber(int n) {

		TreeSet<Long> ts = new TreeSet<>();
		ts.add(1L);
		int i = 1;
		while (i < n) {
			long numb = ts.pollFirst();
			ts.add(numb * 2);
			ts.add(numb * 3);
			ts.add(numb * 5);
		}

		return ts.pollFirst();

	}
}