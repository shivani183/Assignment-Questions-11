
/*Given an array of characters chars, compress it using the following algorithm:
Begin with an empty string s. For each group of **consecutive repeating characters** in chars:
- If the group's length is 1, append the character to s.
- Otherwise, append the character followed by the group's length.
The compressed string s **should not be returned separately**, but instead, be stored **in the 
input character array chars**. Note that group lengths that are 10 or longer will be split into multiple 
characters in chars. After you are done **modifying the input array,** return *the new length of the array*.
You must write an algorithm that uses only constant extra space.*/

package AssignmentQuestions8;

public class Que5 {
	public static int compress(char[] nums) {
        int n = nums.length;
        int length = 0;
        int x = 0;
        for (int i = 0; i < n; i++) {
            char ch = nums[i];
            int count = 1;
            while (i + 1 < n && nums[i + 1] == ch) {
                i++;
                count++;
            }
            length++;
            nums[x++] = ch;
            if (count == 1) 
            	continue;
            if (count > 9) {
                String newString = String.valueOf(count);
                for (int j = 0; j < newString.length(); j++) {
                    length++;
                    nums[x++] = newString.charAt(j);
                }
            } else {
                length++;
                nums[x++] = String.valueOf(count).charAt(0);
            }
        }
        return length;
    }

}
