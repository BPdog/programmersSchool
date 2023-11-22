class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String [] morse = {
            ".-","-...","-.-.","-..",".","..-.","--.","....",
            "..",".---","-.-",".-..","--","-.","---",".--.",
            "--.-",".-.","...","-","..-","...-",".--","-..-",
            "-.--","--.."
            };
        
        String [] tmp = letter.split(" ");
        for(int i = 0; i < tmp.length; i++){
            for(int j = 0; j < morse.length; j++){
                if(tmp[i].equals(morse[j])){
                    answer += (char) (97+j);
                }
            }
        }            
        
        
        
        return answer;
    }
}