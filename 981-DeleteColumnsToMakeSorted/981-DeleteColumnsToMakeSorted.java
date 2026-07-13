// Last updated: 7/13/2026, 12:10:40 PM
class Solution {
    public int minDeletionSize(String[] strs) {
        int m = strs.length;
        int n = strs[0].length();
        int delete = 0;
        for(int i=0;i<n;i++){//column
            for(int j=0;j<m-1;j++){//row
                if(strs[j].charAt(i)>strs[j+1].charAt(i)){
                    delete++;
                    break;
                }
            }
        }
        return delete;
    }
}