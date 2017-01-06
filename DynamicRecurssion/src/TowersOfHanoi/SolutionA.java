package TowersOfHanoi;

import java.util.Stack;
import java.util.StringJoiner;

/**
 * Created by jay on 1/3/17.
 */
public class SolutionA {

    public static MyStack source , destination, buffer;
    public static int num;

    public SolutionA (int n) {

        source = new MyStack("source");
        destination = new MyStack("destination");
        buffer = new MyStack("buffer");
        for (int i =0; i< n ; i++) {
            source.push(i);
        }

        num =n;
    }

    public void solve(int num, MyStack source, MyStack destination, MyStack buffer) {

        if(num == 0) {
            return;
        }

        solve(num -1 ,source, destination, buffer);
        solveOne(source, destination);
        solve(num-1,buffer, destination, source);
    }

    private void solveOne(MyStack source, MyStack destination) {

        System.out.println("move from " +source+ " to " +destination);
        int a = source.pop();
        destination.push(a);
        
    }

}

class MyStack extends Stack<Integer>{

    public static String name;

    public MyStack(String name){

        super();
        this.name = name;
    }

}
