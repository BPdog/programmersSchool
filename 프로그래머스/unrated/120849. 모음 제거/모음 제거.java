class Solution {
    public String solution(String my_string) {
        String answer = "";
        String [] vowels = {"a","e","i","o","u"};
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i < my_string.length(); i++){
            boolean fl = false;
            for(int j = 0; j < vowels.length; j++){
                if(vowels[j].equals((my_string.charAt(i)+""))){
                    fl = fl || true;
                }
            }
            if(!fl) sb.append(my_string.charAt(i));
        }
        answer = sb.toString();
        return answer;
    }
}