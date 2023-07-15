import java.util.Arrays;

public class Solution1764 {
    public boolean canChoose(int[][] groups, int[] nums) {

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (i + groups[index].length > nums.length) {
                break;
            }
            if (groups[index][0] != num) {
                continue;
            }
            int j = 0;
            for (; j < groups[index].length; j++) {
                if (nums[i + j] != groups[index][j]) {
                    break;
                }
            }
            if (groups[index].length == j) {
                i = i + j - 1;
                index++;
            }
            if (index == groups.length) {
                return true;
            }
        }
        return false;
    }

}
