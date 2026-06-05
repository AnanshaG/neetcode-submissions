class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] temp = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>(); // num and index

        for(int i = 0; i < temperatures.length; i++){
            if(stack.empty()){
                stack.push(new int[]{temperatures[i], i});
                continue;
            }
            if(stack.peek()[0] < temperatures[i]){
                do {
                    int[] pop = stack.pop();
                    temp[pop[1]] = i - pop[1];
                }
                    while(!stack.empty() && stack.peek()[0] < temperatures[i]);
            }
                stack.push(new int[]{temperatures[i], i});
            }
        return temp;
    }
}
