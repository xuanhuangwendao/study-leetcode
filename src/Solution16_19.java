import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution16_19 {

    /**
     *
     * @param land
     * @return
     */
    public int[] pondSizes(int[][] land) {
        final int len1 = land.length;
        final int len2 = land[0].length;
        int[][] areas = new int[len1][len2];

        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (land[i][j] == 0) {
                    areas[i][j] = 1;
                    if (j > 0) {
                        areas[i][j] += areas[i][j - 1];
                        areas[i][j - 1] = 0;
                    }
                    if (i > 0) {
                        areas[i][j] += areas[i - 1][j];
                        areas[i - 1][j] = 0;
                    }
                    if (i > 0 && j > 0) {
                        areas[i][j] += areas[i - 1][j - 1];
                        areas[i - 1][j - 1] = 0;

                    }
                    if (i > 0 && j + 1 < len2) {
                        areas[i][j] += areas[i - 1][j + 1];
                        areas[i - 1][j + 1] = 0;
                    }
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int[] row : areas) {
            for (int area : row) {
                if (area != 0) {
                    list.add(area);
                }
            }
        }
        list.sort(Comparator.comparingInt(o -> o));
        int[] ret = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }
}
