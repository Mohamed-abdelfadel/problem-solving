package correct;

import java.util.Set;

public class Solution {
    public static void subsequences(Set<String> sn,
                                    char[] s, char[] op,
                                    int i, int j, int length)
    {
        if (i == length) {
            op[j] = '\0';
            sn.add(String.valueOf(op));
        }

        else {
            op[j] = s[i];
            System.out.println(op);
            System.out.println(s);
            subsequences(sn, s, op, i + 1, j + 1, length);
            subsequences(sn, s, op, i + 1, j, length);
        }
    }
}
