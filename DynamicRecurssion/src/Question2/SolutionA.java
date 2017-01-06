package Question2;

import java.util.ArrayList;

/**
 * Created by jay on 1/2/17.
 */
public class SolutionA {

    public static ArrayList<Square> getPath(boolean[][] maze) {

        if (maze == null || maze.length == 0) {

            return null;
        }

        ArrayList<Square> path = new ArrayList<>();

        if (getPath(maze,maze.length-1, maze[0].length - 1, path)) {
            return path;
        }
        return null;
    }

    public static boolean getPath(boolean[][] maze, int row, int col, ArrayList<Square> path) {

        if (row<0 || col <0 || !maze[row][col]) {

            return false;
        }

        boolean isAtOrigin = (row == 0) && (col == 0);

        if (isAtOrigin || getPath(maze, maze.length-1,maze.length, path) || getPath(maze,maze.length,maze.length-1,path)) {

            Square square = new Square(row, col);
            path.add(square);
            return true;
        }

        return false;

    }

    public static void main(String[] args) {

        int row = 5;
        int col = 4;

        //boolean[][] maze = AssortedMethods.randomBooleanMatrix
    }
}
