// Last updated: 7/13/2026, 12:08:48 PM
class Solution {
    public long sumAndMultiply(int n) {
       long x = 0;
       long sum = 0;
       long len = 1;
       while(n!=0){
        x = (n%10)*len +x;
        if(n%10 !=0) len=len*10;
        sum += n%10;
        n /=10;
       }
       return sum*x; 
    }
}