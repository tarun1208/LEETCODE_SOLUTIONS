// Last updated: 7/16/2026, 4:18:55 PM
1class Solution {
2    public String frequencySort(String s) {
3        HashMap<Character, Integer> map=new HashMap<>();
4        for(int i=0;i<s.length();i++){
5            char c = s.charAt(i);
6            map.put(c,map.getOrDefault(c,0)+1);
7        }
8
9        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
10
11        list.sort((a, b) -> b.getValue()-a.getValue());
12
13        StringBuilder ans = new StringBuilder();
14        for(Map.Entry<Character,Integer> entry:list){
15            int count=entry.getValue();
16            char c=entry.getKey();
17            for(int i=0;i<count;i++){
18                ans.append(c);
19            }
20        } 
21        return ans.toString();
22    }
23}