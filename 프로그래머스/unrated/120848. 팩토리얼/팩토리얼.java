class Solution {
    public static int fact(int n) {		
        if (n <= 1)			
            return n;		
        else
            return fact(n-1) * n;	
    }

    public int solution(int n) {
        int answer = 0;
        do{
            answer++;
        }while(fact(answer) <= n);
        
        answer--;
        return answer;
    }
}