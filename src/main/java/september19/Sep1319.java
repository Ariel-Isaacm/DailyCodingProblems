package september19;

import java.util.HashSet;

public class Sep1319 {
    public boolean solve(int[] input, int k) {
        HashSet<Integer> integersSet = new HashSet<Integer>();
        for (int a : input) {
//          a + b = k => b = k - a
            integersSet.add(a);
            if (integersSet.contains(k - a)) {
                return true;
            }
        }
        return false;
    }
}
