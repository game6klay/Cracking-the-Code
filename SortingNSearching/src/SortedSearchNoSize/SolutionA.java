package SortedSearchNoSize;

/**
 * Created by jay on 1/5/17.
 */
public class SolutionA {

    // binary search

    public static int search (Listy list, int target){

        int index = 1;
        while (list.elementAt(index)!=-1 && target > list.elementAt(index)) {

            index *=2;

        }

        return search(list, target, index/2, index);
    }

    public static int binarySearch(Listy list , int target, int left , int right) {

        int mid;
        while (left<=right) {
            mid = (left+right)/2;
            int middle = list.elementAt(mid);

            if (middle > target || middle == -1) {
                right = mid-1;
            }

            else if (middle < target) {

                left = mid + 1;
            } else {return mid;}
        }
        return -1;
    }

    public static int search(Listy list , int target, int left, int right) {

        int mid = (left + right)+2;
        if (mid == target) {

            return mid;
        }

        if (left > right) {
            return -1;
        }

        if (target < mid) {
            return search(list, target, left, mid-1);
        }

        if (target >= mid) {

            return search(list, target, mid,right);
        }

        return -1;
    }
}
