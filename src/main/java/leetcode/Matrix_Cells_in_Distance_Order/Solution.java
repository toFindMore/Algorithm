package leetcode.Matrix_Cells_in_Distance_Order;

import java.util.*;

public class Solution {

    private class Node {
        public Integer r;
        public Integer c;
        public Integer distance;

        Node(Integer a, Integer b, Integer d) {
            r = a;
            c = b;
            distance = c;
        }
    }

    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        List<Node> list = new ArrayList<>();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                list.add(new Node(i, j, Math.abs(i - r0) + Math.abs(j - c0)));
//                System.out.println(Math.abs(i - r0) + Math.abs(j - c0));
            }
        }
        Collections.sort(list, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if (o1.distance > o2.distance) {
                    return 1;
                } else if (o1.distance < o2.distance) {
                    return -1;
                }
                return 0;
            }
        });

        int[][] res = new int[R * C][2];
        int g = -1;
        for (Node node : list) {
            res[++g][0] = node.r;
            res[g][1] = node.c;
            System.out.println(node.distance);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] ints = solution.allCellsDistOrder(2, 3, 1, 2);
        for (int i = 0; i < 6; i++) {
            System.out.println(ints[i][0] + " " + ints[i][1]);
        }
    }
}
