package src;
// Exercise 1.1
// To check whether a string has all unique characters or not
// No additional data structures are allowed to use

public class sum2 {


    public static void main (String args[]) {

        String string1 = "jay";
        String string2 = "yaj";

        System.out.print(checkPermutation(string1,string2));

    }


    public static boolean checkPermutation(String str1, String str2){

        if (str1.length() != str2.length()) {

            return false;

        }

        int[] letters = new int[128];
        int i;
        for (i=0; i<str1.length(); i++){

            letters[str1.charAt(i)]++;
        }

        for (i=0; i<str2.length();i++){

            letters[str2.charAt(i)]--;

            if (letters[i]<0){

                return false;
            }
        }

        return true;
    }





}