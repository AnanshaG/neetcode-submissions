class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int res = 0;

        HashSet<Character> set = new HashSet<>();
        while(right < s.length()){
            if(set.add(s.charAt(right))){
                res = Math.max(right - left + 1, res);
                right++;
            }
            else{
                while(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(right));
                right++;
            }
        }

        return res;
        
    }
}
