public class Solution12 {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        num = generateRoman(sb, "M", 1000, num);
        num = generateRoman(sb, "CM", 900, num);
        num = generateRoman(sb, "D", 500, num);
        num = generateRoman(sb, "CD", 400, num);
        num = generateRoman(sb, "C", 100, num);
        num = generateRoman(sb, "XC", 90, num);
        num = generateRoman(sb, "L", 50, num);
        num = generateRoman(sb, "XL", 40, num);
        num = generateRoman(sb, "X", 10, num);
        num = generateRoman(sb, "IX", 9, num);
        num = generateRoman(sb, "V", 5, num);
        num = generateRoman(sb, "IV", 4, num);
        num = generateRoman(sb, "I", 1, num);
        return sb.toString();
    }

    public int generateRoman(StringBuilder sb, String roman, int number, int now) {
        int size = now / number;
        sb  .append(String.valueOf(roman).repeat(Math.max(0, size)));
        return now % number;
    }

}
