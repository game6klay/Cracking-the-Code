package SearchInRotatedArray;

/**
 * Created by jay on 1/4/17.
 */
public class SolutionA {

    public int search(int[] nums, int target) {

        return search(nums, target, 0, nums.length);
    }

    public int search(int[] nums, int target, int start, int end) {

        int pivot = findPivot(nums);

        return -1;
    }

    private int findPivot(int[] nums) {

        for (int i=0; i<nums.length-1;i++) {
            if(nums[i] > nums[i+1]) {

                return i;
            }

        }

        return -1;
    }
}
