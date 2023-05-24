import java.util.ArrayList;
import java.util.List;

public class EncodeDecode {
    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public String encode(List<String> strs) {
        // write your code here
        StringBuilder encoded = new StringBuilder();
        for(String each: strs){
            encoded.append(each.length()).append("#").append(each);
        }
        return encoded.toString();
    }

    /*
     * @param str: A string
     * @return: dcodes a single string to a list of strings
     */
    // 4#lint4#code"
    public List<String> decode(String str) {
        // write your code here
        int i = 0;
        List<String> decoded = new ArrayList<>();
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            String word = str.substring(j+1, j+1+length);
            decoded.add(word);
            i = j+1+length;
        }
        return decoded;
    }
}
