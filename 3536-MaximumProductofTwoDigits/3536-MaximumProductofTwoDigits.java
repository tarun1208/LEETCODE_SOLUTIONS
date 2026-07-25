// Last updated: 7/25/2026, 6:00:39 PM
1class Solution {
2    public int maxProduct(int n) {
3        int max1 = 0;
4        int max2 = 0;
5
6        while(n>0){
7            int digit = n%10;
8            if(digit > max1){
9                max2 = max1;
10                max1 = digit;
11            }else if(digit > max2){
12                max2 = digit;
13            }
14            n = n/10;
15        }
16
17        return max1*max2;
18    }
19}