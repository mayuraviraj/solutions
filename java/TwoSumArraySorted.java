public class TwoSumArraySorted {
    // two loops. n squred. 
    public int[] twoSumOld(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[i] + numbers[j] == target){
                    return new int[]{i+1, j+1};
                } else if(numbers[i] + numbers[j] > target){
                    break;
                }
            }
        }
        return new int[0];
    }

    // [1,3,4,5,7,11] - target 9
    // two pointer -  works since this sorted array. O(n)
    public int[] twoSum(int[] numbers, int target){
        int l = 0;
        int r = numbers.length-1;
        while(l < r){
            int sum = numbers[l] + numbers[r];
            if(sum == target){
                return new int[]{l+1, r+1};
            } else if(sum > target){
                r--;
            } else {
                l++;
            }
        }
        return new int[0];
    }
}
