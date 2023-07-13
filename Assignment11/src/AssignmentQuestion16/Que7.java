package AssignmentQuestion16;

import java.util.Vector;

public class Que7 {

	static int removeSame(Vector<String> s) {
		
		int n = s.size();

		for (int i = 0; i < n - 1;) {
			if (s.get(i).equals(s.get(i + 1))) {
				s.remove(i);
				s.remove(i);

				if (i > 0)
					i--;
				n = n - 2;
			} else
				i++;
		}
		return s.size();
	}
	public static void main(String[] args)
    {
        Vector<String> v = new Vector<>();
 
        v.addElement("aa"); 
        v.addElement("bb");
        v.addElement("bb");
        v.addElement("aa");
 
        System.out.println(removeSame(v));
    }
}
