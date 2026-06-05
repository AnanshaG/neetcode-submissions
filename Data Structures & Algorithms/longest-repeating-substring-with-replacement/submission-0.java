class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int maxLen = 0;
        int max_count = 0;
        HashMap<Character, Integer> hash = new HashMap<>();
        for(int r = 0; r < s.length(); r++){
            hash.put(s.charAt(r), hash.getOrDefault(s.charAt(r),0) + 1);
            max_count = Collections.max(hash.values());
            if((r-l+1) - max_count <= k){
                maxLen = Math.max(maxLen, r-l+1);
            }
            else{
                hash.put(s.charAt(l), hash.get(s.charAt(l)) - 1);
                l++;
            }

        }
        return maxLen;
    }
}
