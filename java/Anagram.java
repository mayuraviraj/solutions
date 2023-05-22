// This solutions sort the array and compare. Sorting is nlogn. So slogs+tlogt
// Another solution is to use frequency map. Use hashmap to keey frequency of each char then compare that.
// so, two hashmap need as size s and t ( more memory ). Comparison would take one pass as s+t
// also note in case of anagram size(s) == size(t)
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return new String(sArray).equals(new String(tArray));
    }
}

class Solution2 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Integer> sCount = new HashMap<>();
        Map<Character,Integer> tCount = new HashMap<>();
        for(int i  = 0; i < s.length(); i++){
            sCount.put(s.charAt(i), 1+sCount.getOrDefault(s.charAt(i),0));
            tCount.put(t.charAt(i), 1+tCount.getOrDefault(t.charAt(i),0));
        }
        return sCount.equals(tCount);

    }
}