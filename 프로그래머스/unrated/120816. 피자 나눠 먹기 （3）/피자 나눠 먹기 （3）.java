class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if( slice >= n ){
            answer = 1;
        }else{
            int stack = 0;
            while(stack * slice < n){
                stack++;
            }
            answer = stack;
        } 
        return answer;
    }
}
