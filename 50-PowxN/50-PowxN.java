// Last updated: 7/13/2026, 12:11:43 PM
class Solution {
    public double myPow(double x, int n) {
        return binary(x, (long) n);
    }

    public double binary(double x, long n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 1/binary(x,-n);
        }
        if(n%2 == 0){
            return binary(x*x,n/2);
        }else{
            return x*binary(x*x, (n-1)/2);
        }
    }
}