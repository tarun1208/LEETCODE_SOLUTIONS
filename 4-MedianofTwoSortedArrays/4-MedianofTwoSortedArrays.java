// Last updated: 7/15/2026, 8:25:25 PM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int nums[] = new int[nums1.length+nums2.length];
4        int j=0;
5
6        for(int i=0;i<nums1.length;i++){
7            nums[j++] = nums1[i];
8        }
9        for(int i=0;i<nums2.length;i++){
10            nums[j++] = nums2[i];
11        }
12        Arrays.sort(nums);
13        int n= nums.length;
14        if(n%2==1){
15            return nums[n/2];
16        }else{
17            return (nums[n/2-1]+nums[n/2])/2.0;
18        }
19    }
20}