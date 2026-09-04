// Last updated: 9/4/2026, 9:02:16 PM
class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());

        list.sort((a, b) -> {
            if(a.getValue().equals(b.getValue())){
                return b.getKey()-a.getKey(); 
            }
            return a.getValue()-b.getValue(); 
        });

        int[] arr=new int[nums.length];
        
        int ind=0;
        for(Map.Entry<Integer,Integer> entry:list){
            int count=entry.getValue();
            int val=entry.getKey();
            for(int i=0;i<count;i++){
                arr[ind]=val;
                ind++;
            }
        } 
        return arr;
    }
}