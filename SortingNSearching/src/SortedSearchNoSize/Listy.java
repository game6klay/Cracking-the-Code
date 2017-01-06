package SortedSearchNoSize;



/**
 * Created by jay on 1/5/17.
 */
public class Listy {

    int[] array;

    protected Listy(int[] arr) {
        this.array = arr;
    }

    public int elementAt(int index) {

        if (index >= this.array.length){

            return -1;
        }

        else {

            return this.array[index];
        }
    }

}
