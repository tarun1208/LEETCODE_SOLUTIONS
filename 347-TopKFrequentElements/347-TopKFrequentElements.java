// Last updated: 7/13/2026, 12:11:17 PM
class Solution {
    public int[] topKFrequent(int[] num, int k) {
        // Write your solution here
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int n:num){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        ArrayList<Integer> number = new ArrayList<>(map.keySet());
        Collections.sort(number, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return map.get(b)-map.get(a);
            }
        });
        int [] answer = new int[k];
        for(int i=0;i<k;i++){
            answer[i] = number.get(i);
        }
        return answer;
    }
}
