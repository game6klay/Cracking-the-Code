package Question2;

import java.awt.*;

/**
 * Created by jay on 1/2/17.
 */
public class Square {
    public int row;
    public int column;

    public Square(int row, int column) {

        this.row = row;
        this.column=  column;

    }

    public String toString(int row, int column) {

        return ("("+this.row+","+this.column+")");
    }

    public int hashcode(){

        return this.toString().hashCode();
    }

    public boolean equals(Object obj) {

        if ((obj instanceof Square) && (((Square) obj).row == this.row) && (((Square) obj).column == this.column)) {
            return true;
        }
        else {
            return false;
        }
    }

}
