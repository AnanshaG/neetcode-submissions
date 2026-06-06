class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        List<int[]> p_s = new ArrayList<>();
        for(int i = 0; i < position.length; i++){
            p_s.add(new int[]{position[i], speed[i]});
        }

        p_s = p_s.stream().sorted((a,b) -> Integer.compare(b[0], a[0])).collect(Collectors.toList());
        
       float[] time = new float[p_s.size()];
       for(int i = 0; i < p_s.size(); i++){
           time[i] = (float) (target - p_s.get(i)[0]) / p_s.get(i)[1];
       }
       
       Stack<Float> fleet = new Stack<Float>();
       fleet.push(time[0]);
        for(int i = 1; i < time.length; i++){
            if(fleet.peek() >= time[i]){
                fleet.push(Math.max(fleet.pop(), time[i]));
            }
            else{
                fleet.push(time[i]);
            }
        }
        
        return fleet.size();    
    }
}
