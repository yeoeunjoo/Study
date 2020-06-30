//1차: 이름(String)이 같은 참여자를 키값, 완주자를 밸류값으로 Hashmap<String, String> 에 저장 후
// null인 밸류 탐색하여 키값 출력하려고 했으나 이중for문사용과 논리적인 오류가 있어보였음
//2차 : 모범답안 참고함


public class Solution {
    public static void main(String[] args) {
        String s = "aabbaccc";
        Solution sol = new Solution();

        int result = sol.solution(s);
        System.out.println(result);
    }



    public int solution(String s) {
        int answer = 1001;

        if(s.length()==1) return 1;

        for(int i=1;i<=s.length()/2;i++){
            String now, next = "", result = "";
            int hit = 1;
            for(int j=0;j<=s.length()/i;j++){
                int start = j*i;
                int end = i*(j+1)>s.length()?s.length():i*(j+1);
                now = next;
                next = s.substring(start,end);
                if(now.equals(next)){
                    hit++;
                }else{ //같지않으면
                    result += (continued(hit)+now); //문자열 붙임
                    hit=1;
                }
            }
            result += (continued(hit)+next);
            answer = Math.min(answer, result.length());
        }
        return answer;

    }

    //1이면 숫자가 보이지 않게 처리 필요?
    private static String continued(int hit){
        return hit>1 ? String.valueOf(hit):"";
    }

}


