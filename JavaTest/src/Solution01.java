


import java.util.*;

//1차: 이름(String)이 같은 참여자를 키값, 완주자를 밸류값으로 Hashmap<String, String> 에 저장 후
// null인 밸류 탐색하여 키값 출력하려고 했으나 이중for문사용과 논리적인 오류가 있어보였음
//2차 : 모범답안 참고함

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


        HashMap<String, Integer> runnerMap = new HashMap<>();
        Arrays.sort(participant);
        Arrays.sort(completion);

        for(String name: participant) {
            runnerMap.put(name, runnerMap.getOrDefault(name, 0) + 1);
        }
        for(String name : completion){
            runnerMap.put(name, runnerMap.get(name)-1);
        }




        for(String key: runnerMap.keySet()){
            if(runnerMap.get(key) != 0){
                answer = key;
            }
        }
        return answer;


    }
}


