package leetcode.BulbSwitcher_II;

import java.util.HashMap;

class Solution {
    HashMap<Integer, HashMap<Long, Integer>> reg = new HashMap<>();

    private void init() {
        for (int i = 0; i <= 1000; i++) {
            reg.put(i, new HashMap<Long, Integer>());
        }
    }

    public int numberOfArithmeticSlices(int[] A) {
        if (A.length <= 2) return 0;
        long[] AC = new long[1005];
        init();
        for (int i = 0; i < A.length; i++) {
            AC[i] = (long) A[i];
        }
        int len = A.length;
        int res = 0;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                long gap = AC[i] - AC[j];
                int num = reg.get(j).containsKey(gap) ? reg.get(j).get(gap) + 1 : 1;
                if (reg.get(i).containsKey(gap)) {
                    reg.get(i).put(gap, num + reg.get(i).get(gap));
                } else {
                    reg.get(i).put(gap, num);
                }
                if (num >= 2) {
                    res += (num - 1);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = {79, 20, 64, 28, 67, 81, 60, 58, 97, 85, 92, 96, 82, 89, 46, 50, 15, 2, 36, 44, 54, 2, 90, 37, 7, 79, 26, 40, 34, 67, 64, 28, 60, 89, 46, 31, 9, 95, 43, 19, 47, 64, 48, 95, 80, 31, 47, 19, 72, 99, 28};
        System.out.println(solution.numberOfArithmeticSlices(A));
    }
}