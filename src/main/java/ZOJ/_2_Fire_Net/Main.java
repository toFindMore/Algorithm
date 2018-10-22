package ZOJ._2_Fire_Net;

import java.util.Scanner;

/**
 * http://acm.zju.edu.cn/onlinejudge/showProblem.do?problemCode=1002
 * 思路：dfs、s遍历试探
 */
public class Main {

    private static int SIZE = 5;
    private static int res ;

    /**
     *
     * @param map   代表地图
     * @param N     代表地图的大小 N*N
     * @param pos   地图中的第pos个点，从 0 开始，当 pos>= N*N时，所有点都被遍历过
     * @param count 用来记录放了点之后计数，在结束条件下判断和 res 的大小
     */

    public static void helper(char[][] map,int N,int pos,int count) {
        //终止条件
        if(pos >= N*N) { res=(res>count)?res:count;  return; };

        //否则递归
        int x = pos/N + 1;
        int y = pos%N + 1;
        //可放
        if(isPress(map,N,x,y)) {
            //不放
            helper(map,N,pos+1,count);
            //放
            map[x][y] = 'O';
            helper(map,N,pos+1,count+1);
            map[x][y] = '.';
        }
        else
        {
            //不能放，找下一个可放点
            helper(map,N,pos+1,count);
        }
    }

    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);

        char[][] map = new char[SIZE][SIZE];
        int N = 0;
        while(true) {
            res = 0;
            N = in.nextInt();
            if(N == 0) break;
            for (int i = 1; i <= N; i++) {
                String tempStr = in.next();
                for (int j = 1; j <= N; j++) {
                    map[i][j] = tempStr.charAt(j-1);
                }
            }
            helper(map,N,0,0);
            System.out.println(res);
        }
    }

    /**
     *
     * @param map 地图
     * @param N   地图大小 N*N
     * @param i   该点的坐标 x
     * @param j   该点的坐标 y
     * @return    该点是否是可放点
     */
    public static boolean isPress(char [][] map,int N,int i,int j) {
        //如果是非 '.'
        if( map[i][j] == 'X' || map[i][j] == 'O' ) {
            return false;
        }
        boolean flag = true;
        //左边扫描
        for (int k = j-1; k>=1 && map[i][k]!='X'; k--) {
            if( map[i][k] == 'O') {
                flag = false;
                break;
            }
        }
        if(flag == false) return false;
        //右边扫描
        for (int k = j+1; k<=N && map[i][k]!='X'; k++) {
            if( map[i][k] == 'O') {
                flag = false;
                break;
            }
        }
        if(flag == false) return false;
        //上面扫描
        for (int k = i-1; k>=1 && map[k][j]!='X'; k--) {
            if( map[k][j] == 'O') {
                flag = false;
                break;
            }
        }
        if(flag == false) return false;
        //下面扫描
        for (int k = i+1; k<=N && map[k][j]!='X'; k++) {
            if( map[k][j] == 'O') {
                flag = false;
                break;
            }
        }
        if(flag == false) return false;
        return true;
    }
}
