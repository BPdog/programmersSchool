class Solution {
    public int fact(int n) {
        if (n <= 1){			
            return n;
        }else{	
            return fact(n-1) * n;	
        }
    }
    public int comb(int n,int m){
        if(n==m || m == 0 )return 1;
        return comb(n-1,m-1) + comb(n-1,m);
    }
    
    
    public int solution(int balls, int share) {
        int answer = 0;
        answer = comb(balls, share);
        return answer;
    }
}