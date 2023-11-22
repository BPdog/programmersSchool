class Solution {
    public int solution(int hp) {
        int answer = 0;
        int general_ant = 5;
        int soldier_ant = 3;
        int work_ant =1;
        int stack = 0;
        while(hp > 0){
            while(hp>=5) {
                hp -= general_ant;
                stack++;
            }
            while(hp>=3) {
                hp -= soldier_ant;
                stack++;
            }
            while(hp>=1) {
                hp -= work_ant;
                stack++;
            }
        }
        answer = stack;   
        return answer;
    }
}