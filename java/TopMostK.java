class Solution {
    // Find top k frequent
    // Create freq map
    // sort the values desc
    // get top most k
    // sort nlogn + on traverse which result in ologn.
    public int[] topKFrequentWithSortedList(int[] nums, int k) {
        Map<Integer,Integer> intFreq = new HashMap<>();
        for(int i : nums){
            intFreq.put(i, intFreq.getOrDefault(i,0) + 1);
        }
        List<Map.Entry<Integer, Integer>> sorted = new ArrayList<>(intFreq.entrySet());
        Collections.sort(sorted, (a, b) -> b.getValue() - a.getValue());
        
        int[] array = new int[k];
        for(int i = 0; i < k; i++){
            array[i] = sorted.get(i).getKey();
        }
        return array;
    }

    // Instead of sort we can use maxheap as it would cost only log n create poll.
    // Max heap is possilbe because we need top most priority ( in this case max values) values
    public int[] topKFrequentWithMaxHeap(int[] nums, int k) {
        Map<Integer, Integer> intFreq = new HashMap<>();
        for (int i : nums) {
            intFreq.put(i, intFreq.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        queue.addAll(intFreq.entrySet());
        
        int[] array = new int[k];
        for (int i = 0; i < k; i++) {
            array[i] = queue.poll().getKey();
        }
        return array;
    }
}