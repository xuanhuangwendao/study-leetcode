import java.util.ArrayList;
import java.util.List;

public class Week2_1 {

    public List<String> splitWordsBySeparator(List<String> words, char separator) {

        List<String> ret = new ArrayList<>();
        for (String word : words) {
            word = word.replace(String.valueOf(separator), "-");
            String[] split = word.split("-");
            for (String s : split) {

                s = s.replace("-", "");
                if (!"".equals(s)) {
                    ret.add(s);
                }
            }
        }
        return ret;
    }

}
