class Solution {
    public int findMin(int[] num) {
       int l = 0;
		int r = num.length - 1;
		while(l < r && Math.abs(l - r) > 1) {
			if(num[l] < num[r]){
				return num[l];
			}
			int mid = (l + r)/2;
			if(num[l] > num[mid]) {
				r = mid;
			}
			else {
				l = mid;
			}
		}
		
		return num[l] > num[r] ? num[r] : num[l];
    }
        
    
}
