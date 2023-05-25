class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int max = 0;
        for(int i: nums){
            if(!set.contains(i-1)){
                int curLen = 0;
                while(set.contains(i)){
                    i++;
                    curLen++;
                }
                max = Math.max(curLen, max);
            }
        }
        return max;
    }
}