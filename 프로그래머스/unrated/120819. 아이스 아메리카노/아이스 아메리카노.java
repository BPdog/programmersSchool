class Solution {
    public int[] solution(int money) {
        int price = 5500;
        int cup = (int)(money/price);
        int changes = money % price;
        int[] answer = {cup, changes};
        return answer;
    }
}