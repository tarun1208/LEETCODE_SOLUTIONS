// Last updated: 9/4/2026, 9:00:44 PM
class Solution {
    public int minimumPushes(String word) {
        int []hashTable = new int[26];

        for(char ch : word.toCharArray()){
            hashTable[ch-'a']++;
        }

        int push = 0;

        Arrays.sort(hashTable);;

        for(int i=25,pushCount = 0; i>=0;i--){
            int currEle = 25-i;
            if(currEle%8 == 0) pushCount++;

            push += hashTable[i]*pushCount;
        }

        return push;
    }
}