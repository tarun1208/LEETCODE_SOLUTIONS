// Last updated: 7/16/2026, 2:48:22 PM
1class Solution {
2    public long gcdSum(int[] nums) {
3        int n = nums.length;
4        int [] arr = new int[n];
5        int max = 0;
6        for(int i=0;i<n;i++){
7            max = Math.max(max,nums[i]);
8            arr[i] = gcd(max,nums[i]);
9        }
10
11        Arrays.sort(arr);
12        long sum = 0;
13        int left=0;
14        int right = n-1;
15
16        while(left<right){
17            sum+=gcd(arr[left],arr[right]);
18            left++;
19            right--;
20        }
21        return sum;
22    }
23
24    private int gcd(int a, int b){
25        while(b!=0){
26            int temp = b;
27            b = a%b;
28            a = temp;
29        }
30        return a;
31    }
32}