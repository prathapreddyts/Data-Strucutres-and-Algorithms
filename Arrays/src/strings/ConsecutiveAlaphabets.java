package strings;

public class ConsecutiveAlaphabets {

    public static void main(String[] args) {
        int number=27;
        number=number-1;
        String result="";
        while(number>0){
           result+=((char)('a'+number%26));
            number=number/26;
        }
        System.out.println(result);
    }
}
