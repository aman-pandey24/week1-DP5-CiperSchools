package CP_package;

import java.util.Stack;

public class sort_stack {
    public static void sort(Stack<Integer> stack){
        if (stack.isEmpty()){
            return;
        }
        int element =stack.pop();
        sort(stack);
        addInStack(stack,element);
    }
    private static void addInStack(Stack<Integer> stack,int element){
        if (stack.isEmpty()||element>stack.peek()){
            stack.push(element);
            return;
        }
        int tempElemenet=stack.pop();
        addInStack(stack,element);
        stack.push(tempElemenet);
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(4);
        stack.push(1);
        stack.push(2);
        stack.push(9);
        stack.push(7);
        sort(stack);
        System.out.println(stack);
    }
}
