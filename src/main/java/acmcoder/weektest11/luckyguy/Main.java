package acmcoder.weektest11.luckyguy;

import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: acmcoder.weektest11.luckyguy 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/6/9 下午7:35
 * 【题目】:
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }
        //int[] res = new int[n + 1];
        int num = 1;
        int index = 2;
        while (num <= n - 2) {
            //找到一个满足的
            while (arr[index] == 0) {
                index = (index + 1) % n;
            }
            //res[num++] = arr[index];
            System.out.print(arr[index] + " ");
            arr[index] = 0;
            index = (index + 1) % n;
            while (arr[index] == 0) {
                index = (index + 1) % n;
            }
            index = (index + 1) % n;
        }
        /*
        for(int i:arr){
            if(i!=0){
                res[num++] = i;
            }
        }
        for(int i=1;i<=n-2;i++){
            System.out.print(res[i]);
            if(i!=n-2){
                System.out.print(" ");
            }else{
                System.out.println();
            }
        }
        System.out.println(res[n-1]+" "+res[n]);
        */
    }
}