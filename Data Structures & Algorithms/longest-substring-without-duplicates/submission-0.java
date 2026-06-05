class Solution {
    public int lengthOfLongestSubstring(String s) {

        char[] arr = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
       int pointer = 0;
       int maxLength = 0;
       int i = 0;
         while(i < arr.length){
             if(!set.add(arr[i])) {
                 maxLength = Math.max(maxLength, i - pointer );
                 while(!set.add(arr[i])){
                         set.remove(arr[pointer]);
                         pointer += 1;
                     }
                 }
                i++;
             }
        maxLength = Math.max(maxLength, i - pointer );
        return maxLength;
        
    }
}
