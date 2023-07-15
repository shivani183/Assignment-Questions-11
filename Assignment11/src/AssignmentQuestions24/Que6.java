
/*Given an array of strings `words` and an integer `k`, return *the* `k` *most frequent strings*.
Return the answer **sorted** by **the frequency** from highest to lowest. Sort the words with 
the same frequency by their **lexicographical order**.*/

package AssignmentQuestions24;
import java.util.*;
public class Que6 {
	public List<String> topKFrequent(String[] words, int k) {

		HashMap<String, Integer> hm = new HashMap<>();

		for (int i = 0; i < words.length; i++) {
			hm.put(words[i], hm.getOrDefault(words[i], 0) + 1);
		}

		PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
			if ((hm.get(b) - hm.get(a)) == 0)
				return a.compareTo(b);
			else
				return hm.get(b) - hm.get(a);
		});

		for (String s : hm.keySet()) {

			pq.add(s);

		}

		List<String> result = new ArrayList<>();
		while (k-- > 0) {
			result.add(pq.remove());
		}
		return result;
	}
}
