// Last updated: 7/20/2026, 10:30:19 AM
class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        int f = 0;
        long count1 = 0;
        long count2 = 0;
        long swap = 0;
        long MOD = 1000000007;

        for(int num:nums){
            if(num<a){
                swap+=(count1+count2);
            }else if(num>=a && num<=b){
                swap +=count2;
                count1++;
            }else{
                count2++;
            }
        }
        return (int) (swap%MOD);
    }
}