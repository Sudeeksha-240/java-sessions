import java.util.ArrayList;
import java.util.List;
public class day_8 {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String s1 = words[i];
            for (int j = 0; j < words.length; j++) {
                String s2 = words[j];
                if (i != j && s1.length() < s2.length()) {
                    if (isSubstring(s1, s2)) {
                        result.add(s1);
                        break;
                    }
                }
            }
        }
        return result;
    }

    public boolean isSubstring(String one, String two) {
        for (int i = 0; i <= two.length() - one.length(); i++) {
            if (two.substring(i, i + one.length()).equals(one)) {
                return true;
            }
        }
        return false;
    }
}