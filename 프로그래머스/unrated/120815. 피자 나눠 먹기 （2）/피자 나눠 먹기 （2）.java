class Solution {
    int piece = 6;
    public int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
        return a;
    }
    public int solution(int n) {
        int answer = 0;
        answer = n  / gcd(n, piece);
        return answer;
    }
}