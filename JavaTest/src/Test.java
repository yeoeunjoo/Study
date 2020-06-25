import kotlin.time.TestTimeSource;

public class Test {
    public int solution(String skill, String[] skill_trees){
        int answer =0;

        for(int i=0;i<skill_trees.length;i++){
            int index=0;
            boolean flag = true;

            for(int j=0; j<skill.length();j++){
                for(int k=index; k<skill.length();k++){
                    if(skill.charAt(k)==skill_trees[i].charAt(j)){
                        if(k!=index) { flag = false; }
                        else { index++; }
                    }
                }
            }

            if(flag == true){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
    Test s = new Test();
    s.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"});
    System.out.println(s.solution("CBD",new String[]{"BACDE", "CBADF", "AECB", "BDA"}));
    }
}

