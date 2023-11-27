import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        Set<Integer> set = new HashSet<>();
        int number = 2;
        while(n > 1){
            while(n % number == 0){
                n /= number;
                set.add(number);
            }
            number++;
        }
        answer = new int[set.size()];
        int index = 0;
        for(int temp : set) {
            answer[index++] = temp;
        }
        Arrays.sort(answer);
        return answer;
    }
}