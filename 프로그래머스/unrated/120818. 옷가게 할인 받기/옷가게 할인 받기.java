class Solution {
    public int solution(int price) {
        int answer = 0;
        double percent = 1;
        if(price>=500000){
            percent = (0.80);
        }else if(price>=300000){
            percent =(0.90);
        }else if(price>=100000){
            percent = (0.95);
        }  
        answer = (int)(price * percent);
        
        return answer;
    }
}