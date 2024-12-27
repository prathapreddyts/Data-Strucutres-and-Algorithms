package prefixSum;

public class CountVowelStringsRangesLC2559 {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int wordsLen = words.length;
        int[] wordsCnt = new int[wordsLen];
        int index=0;
        for(String word: words){
            wordsCnt[index] = isWordStartsWithVowel(word);
            index++;
        }
        int[] prefixSum = new int[wordsLen+1];
        for(int i=1;i<=wordsLen;i++){
            prefixSum[i] = prefixSum[i-1]+wordsCnt[i-1];
        }
        int queriesLen = queries.length;
        int[] result = new int[queriesLen];
        index=0;
        for(int[] query: queries){
            int start = query[0];
            int end = query[1];
            result[index] = prefixSum[end+1]-prefixSum[start];
            index++;
        }

        return result;
    }
    public int isWordStartsWithVowel(String word){
        char c = word.charAt(0);
        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
            return 1;
        }
        return 0;
    }
}
