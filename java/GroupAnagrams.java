// Two text to be anagram it must contains same characters. Therefore if we sort it the text should be
// equal. Therefore we can use sorted text a key to group the text. But that will cause
// O(m.nlongn) where m is array size and n is text size.
// Instead sort we can use charactre frequency array which result O(m.n)
class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
            Map<List<Integer>,List<String >> data = new HashMap<>();
            for(String each: strs){
                List<Integer> charCount = new ArrayList<>(Collections.nCopies(26, 0));
                for(char c: each.toCharArray()){
                    int index = c - 'a';
                    Integer integer = charCount.get(index);
                    if(integer == null){
                        charCount.set(index, 1);
                    } else {
                        charCount.set(index, ++integer);
                    }
                }
                List<String> orDefault = data.getOrDefault(charCount, new ArrayList<>());
                orDefault.add(each);
                data.put(charCount, orDefault);
            }
            return new ArrayList<>(data.values());
        }

}