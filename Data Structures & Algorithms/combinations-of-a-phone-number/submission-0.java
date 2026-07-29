class Solution {
    HashMap<Character, String> map = new HashMap<>();
    
    public List<String> letterCombinations(String digits) {
    map.put('2', "abc");
    map.put('3', "def");
    map.put('4', "ghi");
    map.put('5', "jkl");
    map.put('6', "mno");
    map.put('7', "pqrs");
    map.put('8', "tuv");
    map.put('9', "wxyz");
    List<String> res = new ArrayList<>();
    StringBuilder s = new StringBuilder();
    dfs(digits, 0, 0, s, res);
    return res;

        
    }

    public void dfs(String digits, int l_ind, int d_ind, StringBuilder s, List<String> res){
        //base case
        if(digits.length() == 0){
            return;
        }
        if(s.length() == digits.length()){
            res.add(new String(s.toString()));
            return;
        }
        String letters = map.get(digits.charAt(d_ind));
        for(int i = 0; i < letters.length(); i++){
            s.append(letters.charAt(i));
            dfs(digits, i + 1, d_ind + 1, s, res);
            s.deleteCharAt(s.length()-1);
        }
        
        
    }
}
