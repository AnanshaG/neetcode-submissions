class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(String s: tokens){
            if("+-*/".contains(s)){
                switch (s){
                    case "+":
                       // int val = st.pop() + st.pop();
                        st.push(st.pop() + st.pop());
                        break;
                    case "-":
                        int first = st.pop();
                        int second = st.pop();
                        st.push(second - first);
                        break;
                    case "*":
                        st.push(st.pop()*st.pop());
                        break;
                    case "/":
                        int f = st.pop();
                        int se = st.pop();
                        st.push(se / f);
                }

            }
            else {
                st.push(Integer.parseInt(s));
            }
        }

return st.pop();
        

        
    }
}
