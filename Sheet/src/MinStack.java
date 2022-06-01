import java.util.ArrayList;

/**
 * https://leetcode.com/problems/min-stack/
 * 
 * 155. Min Stack
 * Easy
 * 
 * 7988
 * 
 * 617
 * 
 * Add to List
 * 
 * Share
 * Design a stack that supports push, pop, top, and retrieving the minimum
 * element in constant time.
 * 
 * Implement the MinStack class:
 * 
 * MinStack() initializes the stack object.
 * void push(int val) pushes the element val onto the stack.
 * void pop() removes the element on the top of the stack.
 * int top() gets the top element of the stack.
 * int getMin() retrieves the minimum element in the stack.
 * 
 * 
 * Example 1:
 * 
 * Input
 * ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 * 
 * Output
 * [null,null,null,null,-3,null,0,-2]
 * 
 * Explanation
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin(); // return -3
 * minStack.pop();
 * minStack.top(); // return 0
 * minStack.getMin(); // return -2
 * 
 * 
 * Constraints:
 * 
 * -231 <= val <= 231 - 1
 * Methods pop, top and getMin operations will always be called on non-empty
 * stacks.
 * At most 3 * 104 calls will be made to push, pop, top, and getMin.
 */
public class MinStack {
    ArrayList<Integer> arr;
    int min = Integer.MAX_VALUE;

    public MinStack() {
        arr = new ArrayList<>();
    }

    public void push(int val) {
        min = Math.min(val, min);
        arr.add(val);
    }

    public void pop() {
        arr.remove(arr.size() - 1);
        min = Integer.MAX_VALUE;
        for (Integer i : arr) {
            min = Math.min(min, i);
        }
    }

    public int top() {
        return arr.get(arr.size() - 1);
    }

    public int getMin() {
        return min;
    }
}
