// We can solve this using On by prefix and sufix multipications
// Idea is for multipcation at n -> mul(n) = prefix_mul_until(n-1) * sufix_mul_from(n+1) will
// give all the proudcts without item at n.
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int product = 1;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = product;
            product *= nums[i];
        }
        product = 1;
        for(int i = n-1; i >= 0; i--){
            ans[i] = ans[i] * product;
            product *= nums[i];
        }
        return ans;
    }
}