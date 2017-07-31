package tencent;

/**
 * Created by liuyang on 17/2/28.
 春节期间小明使用微信收到很多个红包，非常开心。在查看领取红包记录时发现，某个红包金额出现的次数超过了红包总数的一半。请帮小明找到该红包金额。写出具体算法思路和代码实现，要求算法尽可能高效。
 给定一个红包的金额数组gifts及它的大小n，请返回所求红包的金额。
 若没有金额超过总数的一半，返回0。
 */
public class Gift {
    public int getValue(int[] gifts, int n) {
        if (gifts == null || gifts.length == 0) {
            return 0;
        }
        int money = gifts[0];
        int num = 1;
        for (int i = 1; i < n; i++) {
            if (money == gifts[i]) {
                num++;
            }
            if (money != gifts[i] && num != 0) {
                num--;
            }
            if (money != gifts[i] && num == 0) {
                money = gifts[i];
                num = 1;
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (gifts[i] == money) {
                count++;
            }
        }
        return count > n / 2 ? money : 0;
    }
}
