


import java.util.*;

//1. 이름String이 같은 참여자를 키값, 완주자를 밸류값으로  해시맵에 저장
//2. null인 밸류 탐색하여 키값 출력.
public class Solution01 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko",  "mislav"};
        Solution01 s = new Solution01();

        String result = s.solution(participant, completion);
        System.out.println(result);
    }


    public String solution(String[] participant, String[] completion) {

        String answer="";
        int count;

        HashMap<String, String> runnerMap = new HashMap<>();
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i=0; i<participant.length;i++) {
            for(int i)
            if(participant[i] == completion[i])
            runnerMap.put(participant[i],completion[i]);
        }
        for (String p : participant) {
            if (runnerMap.get(p) == null) {
                runnerMap.put(p, 1);
            } else {
                count = runnerMap.get(p) + 1;
                runnerMap.put(p, count);

            }
        }

        for(String c:completion){
            count = runnerMap.get(c)-1;
            System.out.println(count);
            runnerMap.put(c,count);
        }

        for(String key : runnerMap.keySet()){
            if(runnerMap.get(key) != 0) {
                answer = key;
            break;
            }
        }
        return answer;


    }
}


