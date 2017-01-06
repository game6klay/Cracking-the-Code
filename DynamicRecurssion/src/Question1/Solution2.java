package Question1;

import java.util.Arrays;

public class Solution2 {

    public static int countWays(int numOfSteps) {

        int[] memo = new int[numOfSteps +1];
        Arrays.fill(memo, -1);
        return countWays(memo, numOfSteps);
    }

    public static int countWays(int[] memo, int numOfSteps){

        if (numOfSteps <0){

            return 0;
        } else if (numOfSteps ==0) {

            return 1;

        } else if (memo[numOfSteps] > -1){
            return memo[numOfSteps];
        }

        else {

            memo[numOfSteps] = countWays(numOfSteps -1) + countWays(numOfSteps-2) + countWays(numOfSteps -3);
            return memo[numOfSteps];
        }


    }

    public static void main(String[] args) {
        int numOfSteps = 50;
        int ways = countWays(numOfSteps);
        System.out.println(countWays(ways));
    }



}