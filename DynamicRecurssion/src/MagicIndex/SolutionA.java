package MagicIndex;

/**
 * Created by jay on 1/3/17.
 */
public class SolutionA {

    public static int magicSearch (int[] arr) {

        return magicSearch(arr,arr[0] ,arr.length-1);
    }

    public static int magicSearch(int[] arr, int start, int end) {

        if (end < start) {

            return -1;
        }
        int mid = (start + end)/2;
        if (mid == arr[mid]){

            return mid;
        }

        else if (mid < arr[mid]) {

            return magicSearch(arr, start, mid);
        }

        else {

            return magicSearch(arr, mid+1, end);
        }



    }
}
