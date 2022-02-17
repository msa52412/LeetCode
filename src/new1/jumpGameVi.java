package new1;

import java.util.Deque;
import java.util.LinkedList;

public class jumpGameVi {
    public int maxResult(int[] nums, int k) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        // 构造滑动窗口的索引所对应的队列，队首至队尾的索引依次增大，但对应dp数组中的值依次降低
        Deque<Integer> windowIndices = new LinkedList<>();
        for (int i = 1; i < nums.length; i++) {
            // 如果新的索引i所对应的元素dp[i - 1]大于队尾rear所对应的数组元素dp[rear]，就循环弹出队尾，直到新的元素i - 1能够成为队尾
            // 因为dp[rear] < dp[i - 1]且rear < i - 1，只要窗口继续向右移，dp[rear]就一定会被dp[i - 1]压在下面，不会成为窗口最大元素
            while (!windowIndices.isEmpty() && dp[i - 1] >= dp[windowIndices.peekLast()]) {
                windowIndices.pollLast();
            }
            windowIndices.offerLast(i - 1);
            if (windowIndices.peekFirst() < i - k) {
                windowIndices.pollFirst();
            }
            dp[i] = dp[windowIndices.peekFirst()] + nums[i];
        }
        return dp[nums.length - 1];
    }
    public int maxResult1(int[] nums, int k) {
        if (nums.length == 1) {
            return nums[0];
        }
        int length = nums.length;
        // dp[i] = 到达i位置可得的最大分数
        int[] dp = new int[length];
        // 初始化除0外的所有值为最小
        dp[0] = nums[0];
        for (int i = 1; i < length; i++) {
            dp[i] = Integer.MIN_VALUE;
        }
        for (int i = 0; i < length; i++) {
            // dp[i]可到达的所有位置
            for (int j = i+1; j < length && j <= i+k; j++) {
                // 从i跳跃到j位置, j位置的最大得分
                int nextNum = dp[i]+nums[j];
                // 如果比j位置当前最大得分大, 则更新j位置最大得分
                if (dp[j] < nextNum) {
                    dp[j] = nextNum;
                }
                // 剪枝, i后面能影响到的分数, 可以由遍历到j时进行更新
                if (dp[j] >= dp[i]) {
                    break;
                }
            }
        }
        return dp[length-1];
    }


    public int[] maxSlidingWindow(int[] num, int k) {
        int n=num.length;
        Deque<Integer> deque=new LinkedList<Integer>();
        for (int i=0;i<k;i++){
            while (!deque.isEmpty()&&num[i]>=num[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        int[] res=new int[n-k+1];
        res[0]=num[deque.peekFirst()];
        for (int i=k;i<n;i++){
            while (!deque.isEmpty()&&num[i]>=num[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offerLast(i);
            while (deque.peekFirst()<=i-k) deque.pollFirst();
            res[i-k+1]=num[deque.peekFirst()];
        }
        return res;

    }
}
