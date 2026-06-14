class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        int longest = 0;
        for(int num: set){
            int length = 0;
            if(!set.contains(num - 1)){
                length = 1;
                while(set.contains(num + 1)){
                    length ++;
                    num++;
                }
               longest = Math.max(length, longest); 

            }

        }
        return longest;
    }
}
