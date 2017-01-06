package RecursiveMultiply;

/**
 * Created by jay on 1/3/17.
 */
public class SolutionA {

    public static int counter = 0;

    public static int sum (int x , int y){
        counter += 1;
        return x+y;
    }

    public static int minProduct (int a, int b){

        int smaller = a<b ? a : b;
        int bigger = a>b ? a : b;

        int[] memo = new int[sum(smaller,1)];
        return minProduct(smaller,bigger, memo);

    }

    public static int minProduct(int smaller , int bigger, int[] memo) {

        if (smaller == 0) {
            return 0;
        }
        else if (smaller == 1) {
            return bigger;
        }
        else if (memo[smaller] > 0) {
            return memo[smaller];
        }

        int sMid = smaller >> 1; // basically s/2
        int side1 = minProduct(sMid,bigger,memo);
        int side2 = 0;
        if (smaller % 2 == 1) {
            side2= side1 + smaller;
        }
        else side2 = side1;

        memo[smaller] = side1+side2;
        return memo[smaller];

    }
}
