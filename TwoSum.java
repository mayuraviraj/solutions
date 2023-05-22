// We can use calculate complement from each array element and see that complement
// exists in the array using hashmap. This is On.
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> data = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(data.containsKey(target-nums[i])){
                return new int[]{i, data.get(target-nums[i])};
            }
            data.put(nums[i],i);
        }
       
        return new int[0];
    }
}