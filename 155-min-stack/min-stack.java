import java.util.Stack;
class MinStack {

    Stack <Integer> stack=new Stack();
    Stack <Integer> min=new Stack();

    public MinStack() {
        
    }
    
    public void push(int val) {
        
        if(min.empty()||val<=min.peek()){
            min.push(val);
        }
        stack.push(val);
        
    }
    
    public void pop() {
        if(stack.peek().equals(min.peek())){
            min.pop();
        }
        stack.pop();
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */