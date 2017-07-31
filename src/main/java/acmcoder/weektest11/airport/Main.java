package acmcoder.weektest11.airport;

import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: acmcoder.weektest11.airport 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/6/9 下午7:10
 * 【题目】:
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 * 位运算40%
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long l = in.nextLong();
        long r = in.nextLong();
        long len = r - l + 1;
        long flag = 0;
        for (long i = 2; i <= n + 1; i++) {
            for (long j = l; j <= r; j++) {
                if (j % i == 0) {
                    flag = flag ^ 1 << (j - len);
                }
            }
        }
        System.out.println(NumberOf1(flag));
    }

    public static long NumberOf1(long n) {
        long num = 0;
        while (n != 0) {
            num++;
            n = n & (n - 1);
        }
        return num;
    }

    public static int getNumber(int l, int r, int n) {
        
        return 0;
    }
}