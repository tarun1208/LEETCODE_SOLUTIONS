// Last updated: 7/24/2026, 7:49:39 PM
1class Solution {
2    public int uniqueXorTriplets(int[] nums) {
3        int n = nums.length;
4
5        boolean[] xorPair = new boolean[2048];
6        boolean[] xorTriple = new boolean[2048];
7
8        for(int i=0;i<n;i++){
9            for(int j=i;j<n;j++){
10                xorPair[nums[i]^nums[j]] = true;
11            }
12        }
13
14        for(int i=0;i<n;i++){
15            for(int j=0;j<2048;j++){
16                if(xorPair[j]){
17                    xorTriple[j^nums[i]] = true;
18                }
19            }
20        }
21
22        int count = 0;
23        for(boolean val : xorTriple){
24            if(val){
25                count++;
26            }
27        }
28
29        return count;
30    }
31}