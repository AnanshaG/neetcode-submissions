class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String start = strs[0];
        String end = strs[strs.length - 1];

        //int count = 0;

        int i = 0;
        while(i < start.length() && i < end.length() 
        && start.charAt(i) == end.charAt(i)){
            i++;
        }

        return start.substring(0, i);
    }
}