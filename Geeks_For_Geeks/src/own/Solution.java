package own;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Solution {
    int distinctSubsequences(String string) {
        char[] chars = string.toCharArray();
        int charsLength = chars.length;
        Set<String> subSequences = new LinkedHashSet<>();
        subSequences.add("");
        subSequences.add(string);

        for (int i = 0; i < charsLength; i++) {
            for (int j = 0; j < charsLength; j++) {
//                System.out.println("i : " + i);
//                System.out.println("j : " + j);
//                System.out.println("------------");
                String substring;
                if (j < i) {
                    substring = string.substring(j, i);
                } else {
                    substring = string.substring(i, j);
                }
            subSequences.add(substring);
                if (chars[i] ==chars[j] ){
                    subSequences.add(String.valueOf(chars[i]).concat(String.valueOf(chars[j])));

                }

            }
        }

//        System.out.println(subSequences);
        return subSequences.size();
    }
}
