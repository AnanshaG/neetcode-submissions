class Solution {
    public int[] getConcatenation(int[] nums) {

        int[] res = IntStream.concat(Arrays.stream(nums), Arrays.stream(nums)).toArray();
        return res;
        
    }
}