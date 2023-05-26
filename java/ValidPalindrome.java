// This is using two pointers. time complexity is O(n) memory complexiy is O(1)
class Solution {
    public boolean isPalindrome(String s) {
        String upperCaseStr = s.toUpperCase();
        char[] charArray = upperCaseStr.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while(left <= right ){
            while(left < right && !isAlphaNumaric(charArray[left])){
                left++;
            }
             while(left < right && !isAlphaNumaric(charArray[right])){
                right--;
            }
            if(charArray[left] != charArray[right]){
                return false;
            }
            left++;
            right--;
            
        }
        return true;
    }

    private boolean isAlphaNumaric(char ch){
        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') 
          || (ch >= '0' && ch <= '9')){
              return true;
          } else {
              return false;
          }
    }
}