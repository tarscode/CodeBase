package codem.numbercode;

import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: codem.numbercode 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/6/15 下午8:10
 * 【题目】: 数码
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】: 50%超时
 * 【思路】:
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int r = in.nextInt();
        int[] res = new int[10];
        for (int i = l; i <= r; i++) {
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    int k = i / j;
                    if (k != j) {
                        res[getFirst(j)]++;
                    }
                    res[getFirst(k)]++;
                }
            }
        }
        for (int i = 1; i < 10; i++) {
            System.out.println(res[i]);
        }
    }

    public static int getFirst(int n) {
        String str = String.valueOf(n);
        return str.charAt(0) - '0';
    }
}