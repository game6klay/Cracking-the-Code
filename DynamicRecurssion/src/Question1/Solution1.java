package Question1;

public class Solution1 {


    public static int countWays(int numOfSteps) {
        if (numOfSteps < 0) {

            return 0;
        } else if (numOfSteps ==0) {

            return 1;
        } else {


            return countWays(numOfSteps -1) + countWays(numOfSteps -2) + countWays(numOfSteps -3);
        }

    }

    public static void main(String[] args) {
        int numOfSteps = 20;
        int ways = countWays(numOfSteps);
        System.out.println(countWays(ways));
    }
}


