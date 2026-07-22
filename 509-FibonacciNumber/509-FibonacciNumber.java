// Last updated: 7/22/2026, 10:07:08 AM
1class Solution {
2    public int fib(int n) {
3        if(n<=1) return n;
4        else{
5            return fib(n-1)+fib(n-2);
6        }
7    }
8}