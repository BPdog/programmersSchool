class Solution {
    
    public int createGcd(int num1, int num2){
            if(num1 <= num2){
                int tmp = num1;
                num1 = num2;
                num2 = tmp;
            }
            while(num2 != 0){
                int n = num1 % num2;
                num1 = num2;
                num2 = n;
            }
            int result = num1;
            return result;
    }
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int resultDenom = denom1 * denom2;
        int resultNumer = numer1 * denom2 + numer2 * denom1;
        
        int gcd = createGcd(resultDenom,resultNumer);
        
        resultNumer = resultNumer/gcd;
        resultDenom = resultDenom/gcd;
        
        int[] answer = {resultNumer, resultDenom};
        
        return answer;
    }
}