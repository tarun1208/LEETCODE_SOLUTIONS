// Last updated: 7/21/2026, 8:10:09 PM
1class Solution {
2    public int maxActiveSectionsAfterTrade(String s) {
3        char[] arr = s.toCharArray();
4        int n = arr.length;
5
6        int count1 = 0;
7        int block1 = 0;
8        int block2 = 0;
9        int maxx = 0;
10
11        int i = 0;
12        while(i<n){
13            char ch = arr[i];
14
15            if(ch=='0') {
16                block1++;
17                i++;
18            }else{
19                while(i<n && arr[i]=='1'){
20                    i++;
21                    count1++;
22                }
23                
24                while(i<n && arr[i]=='0'){
25                    i++;
26                    block2++;
27                }
28
29                if(block1!=0 && block2!=0) maxx = Math.max(maxx, block1+block2);
30                block1 = block2;
31                block2 = 0;
32            }
33        }
34        return count1 + maxx;
35    }
36}