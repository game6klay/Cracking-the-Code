package SearchInRotatedArray;

/**
 * Created by jay on 1/5/17.
 */
public class SolutionB {

    public int search (int[] nums, int target) {

        return search(nums, target, 0, nums.length-1);
    }

    private int search(int[] nums, int target, int left, int right) {

        int mid = (left+right)/2;
        if (mid == target){

            return mid;
        }

        if (left>right) {

            return -1;
        }

        if (nums[left] < nums[mid]) {

            // then the left part of the array is sorted
            // search the left part of the array

            if (target < nums[mid] && target > nums[left]) {

                return search(nums , target, left , mid-1);
            }
            else {
                return search(nums , target , mid +1, right);


            }
        }

        else if (nums[right] > nums[mid]) {

            // then the right part of the array is already sorted

            if (target > nums[mid] && target <= right) {

                return search (nums, target, mid +1, right);
            }

            else {

                return search(nums, target, left, mid-1);
            }

        }

        else if (nums[left]== nums[mid]) {
            if (nums[mid] != nums[right]) {

                return search(nums, target, left, mid -1);
            }

            // both the halves need to be searched

            else {
                int result = search(nums, target, left, mid -1);
                if (result==-1) {

                    return search(nums, target, mid+1, right);
                }else {

                    return -1;
                }
            }
        }

        return -1;

    }
}
