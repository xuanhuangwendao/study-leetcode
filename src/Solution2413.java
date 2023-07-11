public class Solution2413 {
    public int smallestEvenMultiple(int n) {
        return 2 * n / gcd(2, n);
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Solution2413 solution2413 = new Solution2413();
        System.out.println(solution2413.gcd(4, 6));
    }
}
