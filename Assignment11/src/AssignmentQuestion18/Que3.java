package AssignmentQuestion18;

class VersionControl {
	boolean isBadVersion(int version) {
		return false;
	}
}
public class Que3 extends VersionControl {

	public int firstBadVersion(int n) {
		int start = 1, end = n;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (!isBadVersion(mid))
				start = mid + 1;
			else
				end = mid;
		}
		return start;
	}
	public static void main(String[] args) {
	}

}
