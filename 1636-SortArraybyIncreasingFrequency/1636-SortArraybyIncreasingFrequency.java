// Last updated: 7/16/2026, 12:10:46 PM
1class Solution {
2    public int[] frequencySort(int[] nums) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
6        }
7
8        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
9
10        list.sort((a, b) -> {
11            if(a.getValue().equals(b.getValue())){
12                return b.getKey()-a.getKey(); 
13            }
14            return a.getValue()-b.getValue(); 
15        });
16
17        int[] arr=new int[nums.length];
18        
19        int ind=0;
20        for(Map.Entry<Integer,Integer> entry:list){
21            int count=entry.getValue();
22            int val=entry.getKey();
23            for(int i=0;i<count;i++){
24                arr[ind]=val;
25                ind++;
26            }
27        } 
28        return arr;
29    }
30}