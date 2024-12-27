package hashing;

import java.util.HashMap;

public class LeetCode2325 {
    public static void main(String[] args) {
        String key="the quick brown fox jumps over the lazy dog";
        String vkbsBsTSuepuv = decodeMessage(key, "vkbs bs t suepuv");
        System.out.println(vkbsBsTSuepuv);
    }
    public static String decodeMessage(String key, String message) {
        HashMap<Character, Character> keyMap = new HashMap<>();
        char[] charArray = key.toCharArray();
        char initialChar='a';
        for(int i=0;i<charArray.length;i++){
            if(charArray[i]!=' '){
                if(!keyMap.containsKey(charArray[i])){
                    keyMap.put(charArray[i],initialChar++);
                }
            }
        }
        StringBuilder result = new StringBuilder();
        char[] messageChar = message.toCharArray();
        for(int i=0;i<messageChar.length;i++){
            if(messageChar[i]==' '){
                result.append(' ');
            }
            if(keyMap.containsKey(messageChar[i])){
                result.append(keyMap.get(messageChar[i]));
            }
        }
        return result.toString();
    }

}
