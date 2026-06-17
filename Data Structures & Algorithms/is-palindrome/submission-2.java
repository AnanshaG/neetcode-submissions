class Solution {
    public boolean isPalindrome(String s) {

        String new_string = s.replace(" ", "");
        StringBuffer og = new StringBuffer();
        for(Character c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                if(Character.isDigit(c)){
                    og.append(String.valueOf(c));
                }
                else{
                    og.append(String.valueOf(c).toLowerCase());
                }
            }
        }

        String og1 = og.toString();
        int left = 0;
        int right = og1.length() - 1;

        while(left < right){
            if(!(og1.charAt(left) == (og1.charAt(right)))){
                return false;
            }
            left++;
            right--;
        }

        return true;
        
    }
}
