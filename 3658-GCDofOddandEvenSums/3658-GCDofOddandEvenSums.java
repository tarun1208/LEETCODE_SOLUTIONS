// Last updated: 7/15/2026, 9:44:52 AM
1class Solution {
2    public int gcdOfOddEvenSums(int n) {
3        int sumOdd = 0;
4        int sumEven = 0;
5        for(int i = 1;i<=2*n;i++){
6            if(i%2!=0){
7                sumOdd +=i;
8            }else{
9                sumEven +=i;
10            }
11        }
12        return sumEven - sumOdd;
13    }
14}