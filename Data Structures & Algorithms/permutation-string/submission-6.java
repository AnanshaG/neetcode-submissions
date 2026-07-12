class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr_s1 = new int[26];
        int[] arr_s2 = new int[26];
        for(int i = 0; i < s1.length(); i++){
            arr_s1[s1.charAt(i) - 'a']++;
        }
        //System.out.println("arr s1: " + Arrays.toString(arr_s1));

        for(int i = 0; i <= s2.length() - s1.length(); i++){
            Arrays.fill(arr_s2, 0);
            for(int j = i; j < i+s1.length(); j++){
                arr_s2[s2.charAt(j) - 'a']++;
                //System.out.println("arr s2: " + Arrays.toString(arr_s2));
            }

             if(Arrays.equals(arr_s1, arr_s2)){
                return true;
             }
        }

        return false;

    }
}
