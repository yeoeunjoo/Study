//1차: 이름(String)이 같은 참여자를 키값, 완주자를 밸류값으로 Hashmap<String, String> 에 저장 후
// null인 밸류 탐색하여 키값 출력하려고 했으나 이중for문사용과 논리적인 오류가 있어보였음
//2차 : 모범답안 참고함

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {
        int[] numbers = {6,10,2};
        Solution s = new Solution();

        String result = s.solution(numbers);
        System.out.println(result);
    }



    public String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {

            arr[i] = (String.valueOf(numbers[i]));
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2+s1).compareTo(s1+s2);
            }
        });

        //0000 처럼 0으로만 구성되어있으면 0 return
        if (arr[0].equals("0")) return "0";

        //그 외의 경우 순차적으로 연결하여 answer return
        for (int i = 0; i < arr.length; i++) {
            answer+=arr[i];
        }
        return answer;

    }

}


