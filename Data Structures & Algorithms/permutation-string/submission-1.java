class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> hashs1 = new HashMap<>();
        for (Character c: s1.toCharArray()){
            hashs1.put(c, hashs1.getOrDefault(c,0) + 1);
        }
        for(int i = 0; i <= s2.length() - s1.length(); i++){
            HashMap<Character, Integer> hashs2 = new HashMap<>();
            int j = i;
            while(j <=  i + s1.length() - 1){
                hashs2.put(s2.charAt(j), hashs2.getOrDefault(s2.charAt(j),0) + 1);
                j++;
            }

            if(hashs1.equals(hashs2))
                return true;

        }
        return false;
            
    }
}
