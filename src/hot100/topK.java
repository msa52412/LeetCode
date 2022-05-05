package hot100;

import java.util.PriorityQueue;

public class topK {
    //堆
    public int findK(int[] nums,int k){
        PriorityQueue<Integer> queue=new PriorityQueue<>(k);
        int i=0;
        for (;i<k;i++) queue.add(nums[i]);
        for (;i<nums.length;i++) {
            if (nums[i]>queue.peek()) {
                queue.poll();
                queue.add(nums[i]);
            }
        }
        return queue.peek();
    }
    //快排
    public int findKQuickSort(int[] nums,int k){
        return quickSort(0,nums.length-1,nums,k);
    }
    public int quickSort(int l,int r,int[] nums,int k){
        int mid=sort(nums,l,r);
        if (mid==nums.length-k) return nums[mid];
        else if (mid>nums.length-k) return quickSort(l,mid-1,nums,k);
        else return quickSort(mid+1,r,nums,k);
    }
    public int sort(int[] nums,int l,int r){
        int p=nums[l];
        while (l<r){
            while (l<r&&nums[r]>=p) r--;
            nums[l]=nums[r];
            while (l<r&&nums[l]<=p) l++;
            nums[r]=nums[l];
        }
        nums[l]=p;
        return l;
    }
}
