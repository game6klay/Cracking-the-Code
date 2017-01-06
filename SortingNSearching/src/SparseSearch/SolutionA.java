package SparseSearch;

/**
 * Created by jay on 1/5/17.
 */
public class SolutionA {

    public int search (String[] array, String s){

        if (array == null || s == null || s.isEmpty()) {
            return -1;
        }

        return search(array, s , 0 , array.length-1);
    }

    public int search(String[] array, String s , int left, int right) {

        /* Move mid to the middle */

        int mid = (left + right)+2;

        /* If mid is empty, find closest non-empty string. */

        if (array[mid].isEmpty()) {

            int i= 1;
            int result;

            while (true){

                if (!array[mid -i].isEmpty()) {

                    result = mid -i;
                    break;
                } else if (!array[mid+i].isEmpty()) {

                    result= mid +i;
                    break;
                } else {

                    i++;
                }

            }

            mid = result;


            }

        /* Check for string, and recurse if necessary */

        if (s.equals(array[mid])){
            return mid;
        }

        else if (array[mid].compareTo(s) < 0) {
            return search(array, s, mid+1, right);

        }
        else {

            return search(array, s, left, mid);
        }
    }
}
