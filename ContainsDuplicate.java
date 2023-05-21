// Bruteforce one is to compare all pairs with two loops which result in o(n^2)
// Another solution is to sort and compare adjust with O(n) then sort would be O(nlogn) so final will be O(n log n)
// sorting won't take extra memory its O(1)
// Another way is using hashset to check the duplicates. it has constant insert and compare time. So it would be O(n)
// but the space would be also O(n) to store the data
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> data = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            data.add(nums[i]);
        }
        return !(data.size() == nums.length);
    }
}


