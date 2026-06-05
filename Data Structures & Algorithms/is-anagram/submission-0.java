class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        java.util.Arrays.sort(s1);
        java.util.Arrays.sort(t1);
        return java.util.Arrays.equals(s1, t1);

    }
}
