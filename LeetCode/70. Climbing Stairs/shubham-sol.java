class Solution {
    public int climbStairs(int n) {
        int a, b, sum = 0;
        a = 0;
        b = 1;

        while (n-- > 0) {
            sum = a + b;
            a = b;
            b = sum;
        }

        return sum;
    }
}