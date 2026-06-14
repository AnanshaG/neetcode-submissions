class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
       HashMap<Integer, Integer> hash = new HashMap<>();

        for(int num: nums){
            hash.put(num, hash.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] list = new ArrayList[nums.length + 1];
        
        for(int i = 0; i <= nums.length; i++) {
        	list[i] = new ArrayList<Integer>();
        }
        
        for(Map.Entry<Integer, Integer> entry: hash.entrySet()) {
        	 list[entry.getValue()].add(entry.getKey());
        }
        
        int i = list.length - 1;//nums+1
        
        int j = 0;
        
        int[] res = new int[k];
        
        while(i >= 0) {
        	if(!list[i].isEmpty()) {
        		for(int a : list[i]) {
        			res[j] = a;
        			j++;
        			if(j == k) {
        				return res;
        			}
        		}
        		
        	}
        	
        	i--;
        }
        
        return res;
        
        
    }
}
