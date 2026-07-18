// Last updated: 7/18/2026, 9:45:07 PM
1class Solution {
2    public int minAdjacentSwaps(int[] nums, int a, int b) {
3        int f = 0;
4        long count1 = 0;
5        long count2 = 0;
6        long swap = 0;
7        long MOD = 1000000007;
8
9        for(int num:nums){
10            if(num<a){
11                swap+=(count1+count2);
12            }else if(num>=a && num<=b){
13                swap +=count2;
14                count1++;
15            }else{
16                count2++;
17            }
18        }
19        return (int) (swap%MOD);
20    }
21}