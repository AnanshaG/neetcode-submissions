class Solution {
    public int characterReplacement(String s, int k) {

        int[] arr = new int[26];
        int right = 0;
        int left = 0;
        int res = 0;

        while(right < s.length()){
            arr[s.charAt(right) - 'A']++;
            int max = Arrays.stream(arr).max().getAsInt();
            if((right - left + 1) - max <= k){
                res = Math.max(res, right - left + 1);
            }
            else{
                arr[s.charAt(left) - 'A']--;
                left++;
            }
            right++;

        }

        return res;
        
    }
}
