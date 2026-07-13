// Last updated: 7/13/2026, 12:08:46 PM
class Solution {
    public boolean isprime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public boolean completePrime(int num) {
        String str=Integer.toString(num);
        for(int i=0;i<str.length();i++){
            if(!isprime(Integer.parseInt((str.substring(0,i+1))))||!isprime(Integer.parseInt((str.substring(str.length()-1-i,str.length()))))){
                return false;
            }
        }
        return true;
        
    }
}