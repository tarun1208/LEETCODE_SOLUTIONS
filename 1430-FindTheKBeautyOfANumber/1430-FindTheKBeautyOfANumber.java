// Last updated: 7/13/2026, 12:09:53 PM
class Solution {
    public int divisorSubstrings(int num, int k) {
        String str = String.valueOf(num);
        int count =0;
        int n= str.length();
        for(int i=0;i<n-k+1;i++){
            String temp = str.substring(i,i+k);
            int n1 = Integer.valueOf(temp);
            if(n1 == 0){
                continue;
            }
            if(num%n1 == 0){
                count++;
            }
        }
        return count;
    }
}