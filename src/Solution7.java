public class Solution7 {
    public int reverse(int x) {
        boolean fu = x < 0;
        if (fu) {
            x = -x;
        }
        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder(s);
        String ret = sb.reverse().toString();
        try {
            return Integer.parseInt(fu ? "-" + ret : ret);
        } catch (Exception e) {
            return 0;
        }
    }
}
