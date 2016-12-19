public class StacksInArray {
	
	// we implement the method where the stacks are fixed in size 
	// the stack size is taken as user input or input 

	private int numOfStacks = 3;
	private int stackSize;
	private int[] values;
	private int[] size;

	public StacksInArray (int stackSize){

		this.stackSize= stackSize;
		values = new int[numOfStacks * stackSize];
		size = new int[numOfStacks];

	}

	// push value on to the stack 

	public void push(int value, int stackNum) throws FullStackException{

		if (isFull(stackNum)){
			throw new FullStackException;
		}
		size[stackNum] ++;
		values[indexOfTop(stackNum)];

	}

	// pop a value from the stack 

	public int pop(int stackNum) {

		if (isFull(stackNum)){
			throw new FullStackException;
		}

		int value = values[indexOfTop(stackNum)];
		values[indexOfTop(stackNum)] = -1;
		size[stackNum] -- ;
		return value;


	}

	public int peek(int stackNum) {
		if (isFull(stackNum)){
			throw new FullStackException;
		}
	}

	public boolean isEmpty(int stackNum) {

		return size[stackNum] == 0;
	}

	private int indexOfTop(int stackNum) {

		int offset = stackSize * stackNum;
		int elementInStack = size[stackNum - 1];
		return offset + elementInStack;
	}

	public boolean isFull(int stackNum) {
		return size[stackNum - 1] == stackSize;
	}


}