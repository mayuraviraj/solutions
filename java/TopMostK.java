// Find top k frequent
// Create freq map
// sort the values desc
// get top most k
// sort nlogn + on traverse which result in ologn.
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
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
}