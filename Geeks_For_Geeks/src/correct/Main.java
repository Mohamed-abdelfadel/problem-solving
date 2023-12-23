package correct;

import java.util.HashSet;
import java.util.Set;

import static correct.Solution.subsequences;

public class Main {
    public static void main(String[] args)
    {
        String string = "gfg";
        char[] str = string.toCharArray();
        int length = str.length;

        Set<String> sn = new HashSet<>();


        char[] op = new char[length + 1];


        subsequences(sn, str, op, 0, 0, length);


        System.out.println(sn.size());
        sn.clear();
    }
}

