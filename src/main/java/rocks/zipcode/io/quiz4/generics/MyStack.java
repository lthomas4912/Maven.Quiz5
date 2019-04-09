package rocks.zipcode.io.quiz4.generics;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> extends Group {

    private Stack<SomeType> stack = new Stack<>();

    public MyStack() {
    }
    public MyStack(Stack stack){
        this.stack = stack;
    }

    public Boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(SomeType i) {
          stack.push(i);
    }

    public SomeType peek() {
        if(stack.isEmpty()){
            return null;
        }
        return stack.peek();
    }

    public SomeType pop() {
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }else{
            return stack.pop();
            }
        }
    }
