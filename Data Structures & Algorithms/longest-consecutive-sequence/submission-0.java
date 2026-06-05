class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int longestStreak = 0;
        for (int num: nums){
            if(!set.contains(num-1)){
                int currentStreak = 1;
                int currentNumber = num;
                while(set.contains(currentNumber+1)){
                    currentNumber++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);

            }
        }

        return longestStreak;
    }
}
