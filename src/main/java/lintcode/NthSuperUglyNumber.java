package lintcode;

import java.util.TreeSet;

/**
 * 【工程】: Algorithm 包名: lintcode 类名: NthSuperUglyNumber
 * 【作者】: liuyang
 * 【时间】: 17/6/10 下午9:22
 * 【题目】: 超级丑数
 * 【内容】: 写一个程序来找第 n 个超级丑数。超级丑数的定义是正整数并且所有的质数因子都在所给定的一个大小为 k 的质数集合内。
 * 比如给你 4 个质数的集合 [2, 7, 13, 19], 那么 [1, 2, 4, 7, 8, 13, 14, 16, 19, 26, 28, 32] 是前 12 个超级丑数。
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class NthSuperUglyNumber {

    /**
     * @param n      a positive integer
     * @param primes the given prime list
     * @return the nth super ugly number
     */
    public int nthSuperUglyNumber(int n, int[] primes) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : primes) {

        }
        return n;
    }


    public static void main(String[] args) {
        NthSuperUglyNumber t = new NthSuperUglyNumber();
        System.out.println();
    }
}