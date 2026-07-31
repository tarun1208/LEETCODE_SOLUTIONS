// Last updated: 7/31/2026, 2:35:54 PM
1class Solution {
2    public int minimumPushes(String word) {
3        int []hashTable = new int[26];
4
5        for(char ch : word.toCharArray()){
6            hashTable[ch-'a']++;
7        }
8
9        int push = 0;
10
11        Arrays.sort(hashTable);;
12
13        for(int i=25,pushCount = 0; i>=0;i--){
14            int currEle = 25-i;
15            if(currEle%8 == 0) pushCount++;
16
17            push += hashTable[i]*pushCount;
18        }
19
20        return push;
21    }
22}