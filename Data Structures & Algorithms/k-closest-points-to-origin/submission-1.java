class Solution {
    public int[][] kClosest(int[][] points, int k) {
        HashMap<Double, List<List<Integer>>> hash = new HashMap<>();
        PriorityQueue<Double> q = new PriorityQueue<>();

        for (int[] point : points) {
            double dis = Math.sqrt(Math.pow(point[0], 2) + Math.pow(point[1], 2));
            if (hash.get(dis) == null) {
                hash.put(dis, new ArrayList());
            }
            hash.get(dis).add(Arrays.asList(point[0], point[1]));
            q.add(dis);
        }

        System.out.println("q " + q);
        System.out.println("hash " + hash);

        List<int[]> res = new ArrayList<>();

        while (res.size() < k) {
            double dis = q.poll();

            List<List<Integer>> list = hash.get(dis);

            List<Integer> point = list.remove(0);

            res.add(new int[] {point.get(0), point.get(1)});

        }

        return res.toArray(new int[res.size()][]);
    }
}
