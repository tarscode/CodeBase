package codem.coupon;

import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: codem.coupon 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/6/15 下午6:51
 * 【题目】: 优惠券
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】: 10.00%
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int m = in.nextInt();
            int[] map = new int[100001];
            int num = 0;//记录'?'的数量
            if (m == 0) {
                System.out.println(-1);
            }
            for (int i = 0; i < m; i++) {
                String flag = in.next();

                if (flag.equals("I")) {
                    int id = in.nextInt();
                    if (map[id] != 0) {
                        if (num != 0) {
                            num--;
                        } else {
                            System.out.println(i + 1);
                            break;
                        }
                    } else {
                        map[id] = 1;
                    }
                }

                if (flag.equals("O")) {
                    int id = in.nextInt();
                    if (map[id] != 0) {
                        map[id] = 0;
                    } else {
                        if (num != 0) {
                            num--;
                        } else {
                            System.out.println(i + 1);
                            break;
                        }
                    }
                }

                if (flag.equals("?")) {
                    num++;
                }

                if (i == m - 1) {
                    System.out.println(-1);
                }
            }
        }
    }
}