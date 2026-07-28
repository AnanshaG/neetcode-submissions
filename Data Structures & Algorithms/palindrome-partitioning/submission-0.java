class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> par = new ArrayList<>();
        dfs(s, par, res);
        return res;
        
    }

    public void dfs(String s, List<String> par, List<List<String>> res){
        if(s.length() == 0){
            res.add(new ArrayList<>(par));
            return;
        }
        for(int i = 0; i < s.length(); i++){
            if(isPalindrom(s.substring(0,i+1))){
                par.add(s.substring(0,i+1));
                dfs(s.substring(i+1), par, res);
                par.remove(s.substring(0,i+1));
            }
        }
    }

    public boolean isPalindrom (String st){
        int left = 0;
        int right = st.length() - 1;
        while(left <= right){
            if(st.charAt(left) != st.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
