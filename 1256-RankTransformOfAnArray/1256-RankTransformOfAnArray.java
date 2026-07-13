// Last updated: 7/13/2026, 12:10:07 PM
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int temp[] = Arrays.copyOf(arr,arr.length);
        Arrays.sort(temp);
        int rank = 1;
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int num : temp){
            if(!hash.containsKey(num)){
                hash.put(num,rank++);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = hash.get(arr[i]);
        }
        return arr;
    }
}