package AssignmentQuestion18;

public class Que2 {

	public void swap(int x, int y, int[] nums){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    public void sortColors(int[] nums) {
        int start=0;
        int end=0;
        int x=nums.length - 1;
        while(end <= x){
            if(nums[end] == 0){
                swap(start,end,nums);
                start++;
                end++;
            }
            else if(nums[end] == 1) end++;
            
            else{
                swap(end,x,nums);
                x--;
            }
        }
    }
	public static void main(String[] args) {

	}

}
