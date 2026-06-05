class Solution {
    public boolean isPalindrome(String s) {
    
    String filtered = "";
    for(int i = 0; i <= s.length() - 1; i++){
        if(Character.isLetterOrDigit(s.charAt(i))){
            filtered += s.charAt(i);
        }
    }

    filtered = filtered.toLowerCase();
    System.out.print(filtered);
    int l = 0;
    int r = filtered.length() - 1;

    while(l < r){
        if(!(filtered.charAt(l) == filtered.charAt(r))){

            return false;
        }
        l++;
        r--;
    }

    return true;
        
    }

    
        
    
}
