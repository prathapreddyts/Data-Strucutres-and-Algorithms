package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1002 {

    public static List<String>bruteForce(String[] words){
        ArrayList<String> storage = new ArrayList<>();
        List<String>result=new ArrayList<>();
        for(String word:words){
            storage.add(word);
        }
        for(int i=0;i<storage.size();i++)
        {
            String word = storage.get(i);
            storage.remove(i);
            for (char c : word.toCharArray())
            {
                boolean found = false;
                for(int j=0;j<storage.size();j++)
                {
                    String searchWord = storage.get(j);
                    for (char c1 : searchWord.toCharArray()) {
                        if(c1==c){
                            found=true;
                        }else {
                            found=false;
                        }
                    }
                    if(found){
                        result.add(String.valueOf(c));
                        for(int k=0;k<storage.size();k++){
                            String temp = storage.get(k);
                            temp = temp.replaceFirst(String.valueOf(c),"");
                            storage.set(k,temp);
                        }
                    }
                }
            }

            storage.add(i,word);
        }
        return result;
    }

    public List<String> commonChars(String[] words) {
        int[] commonFrequency = new int[26];
        Arrays.fill(commonFrequency, Integer.MAX_VALUE);
        for (String word : words)
        {
            int[] wordFrequency = new int[26];
            for (char c : word.toCharArray()) {
                wordFrequency[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                commonFrequency[i] = Math.min(commonFrequency[i], wordFrequency[i]);
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (commonFrequency[i] > 0) {
                result.add(String.valueOf((char) (i + 'a')));
                commonFrequency[i]--;
            }
        }

        return result;
    }



}
