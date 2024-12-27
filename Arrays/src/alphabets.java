public class alphabets {
    public boolean checkIfPangram(String sentence) {
        int[] ints = new int[26];
        for(char c : sentence.toCharArray()){
            ints[c - 'a']++;
        }
        for(int i=0;i<26;i++){
            if(ints[i] == 0){
                return false;
            }
        }
        return true;
    }
}
