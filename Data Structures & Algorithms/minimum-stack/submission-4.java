class MinStack {

    ArrayList<Integer> stack;
    int minYet = Integer.MAX_VALUE;

    public MinStack() {

         stack = new ArrayList<>();

    }

    public void push(int val) {
        this.minYet = Math.min(minYet, val);
        stack.add(val);
        

    }

    public void pop() {
        int popped = stack.remove(stack.size() - 1);
        if (stack.isEmpty()){
            minYet = Integer.MAX_VALUE;
        }
        if(popped == minYet && !stack.isEmpty()){
           minYet = Collections.min(stack);
        }
        
    }

    public int top() {

        return stack.get(stack.size()-1);

    }

    public int getMin() {
    return minYet;
    }
}

