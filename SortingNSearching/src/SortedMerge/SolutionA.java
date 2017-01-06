package SortedMerge;

public class SolutionA {

    public static int[] mergeSorted(int[] A, int[] B) {

        int lastA = A.length-1;
        int lastB = B.length-1;

        return mergeSorted( A, B , lastA, lastB);
    }

    public static int[] mergeSorted(int[] A, int[] B, int lastA, int lastB) {

        int indexMerged = lastA + lastB +1;

        while(lastB >= 0){
            if (B[lastB] < A[lastA]) {

                A[indexMerged] = B[lastB];
                lastB--;
            }
            if (B[lastB] >= A[lastA]) {

                A[indexMerged] = A[lastA];
                lastA--;
            }
            indexMerged++;
        }

        return A;

    }
}