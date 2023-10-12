import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> array = new ArrayList<Integer>();
        
        for(int i = 1; i <= n; i++){
            if(i%2==1){
                array.add(i);
            }
        }
        
        answer = array.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}