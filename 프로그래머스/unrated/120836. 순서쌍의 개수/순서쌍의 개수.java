class Solution {
    public boolean isInteger(double num) {
      return num % 1 == 0.0;
    }
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i<=n; i++){
             if(isInteger( (double)n / i )){
               answer++;
             }
        }
        return answer;
    }
}