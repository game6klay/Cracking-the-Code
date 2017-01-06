package Question2;


import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by jay on 1/2/17.
 */
public class SolutionB {

    public static ArrayList<Square> getPath (boolean[][] maze) {

        if ((maze == null) || maze.length == 0) return null;

        ArrayList<Square> path = new ArrayList<>();

        HashSet<Square> failedPoints = new HashSet<>();

        if (getPath(maze,maze.length -1 , maze[0].length -1, path, failedPoints)) {

            return path;
        }

        return null;

    }

    public static boolean getPath(boolean[][] maze, int row, int col, ArrayList<Square> path, HashSet<Square> failedPoints) {

        // if maze is null or out of bound return false

        if (maze == null || !maze[row][col]) {

            return false;
        }

        Square square = new Square(row, col);

        if (failedPoints.contains(square)) {

            return false;
        }

        boolean isAtOrigin = (row == 0) && (col == 0);

        if (isAtOrigin || getPath(maze, row -1, col , path, failedPoints) || getPath(maze, row, col-1, path, failedPoints)) {

            path.add(square);
            return true;
        }

        failedPoints.add(square);
        return false;
    }
}
