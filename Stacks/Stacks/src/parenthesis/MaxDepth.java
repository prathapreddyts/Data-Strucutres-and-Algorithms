package parenthesis;

public class MaxDepth {
    public int maxDepth(String str) {
        int bracktCnt = 0;
        int cnt = 0;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)=='('){
                bracktCnt++;
            }
            if(str.charAt(i)==')'){
                bracktCnt--;
            }
            cnt = Math.max(cnt,bracktCnt);
        }
        return cnt;

    }
}
